package br.com.test.codes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import br.com.test.method.defaultMethod;
import br.com.test.method.startsWebDriver;

/* Esta é a Classe "Collaborator" do Projeto responsavel por conter todo codigo fonte que for 
utilizado nas telas do Criar Novo Funcionario.
A Classe vai conter todos os metodos e comandos(IF,Else e etc..) para o Criar e Verificar se 
o Novo Cadastro do Funcionario foi realizado com sucesso.
*/	

public class Collaborator extends startsWebDriver{

	public void RegisterNewCollaborator(String Nome, String CPF, String Sexo, String Admissao, 
			String Cargo, String Salario, String TPContratacao ) {
		
		defaultMethod def = new defaultMethod();
		def.AguardarElementos(By.id("inputNome"));
		
		if (!Nome.equals(""))
		{
			driver.findElement(By.id("inputNome")).clear();
			driver.findElement(By.id("inputNome")).sendKeys(Nome);
		}
		
		if (!CPF.equals(""))
		{
			driver.findElement(By.id("cpf")).clear();
			driver.findElement(By.id("cpf")).sendKeys(CPF);
		}
		
		if (!Sexo.equals(""))
		{
			driver.findElement(By.id("slctSexo")).sendKeys(Sexo);
		}
		
		if (!Admissao.equals(""))
		{
			driver.findElement(By.id("inputAdmissao")).clear();
			driver.findElement(By.id("inputAdmissao")).sendKeys(Admissao);
		}
		
		if (!Cargo.equals(""))
		{
			driver.findElement(By.id("inputCargo")).clear();
			driver.findElement(By.id("inputCargo")).sendKeys(Cargo);
		}
		
		if (!Salario.equals(""))
		{
			driver.findElement(By.id("dinheiro")).clear();
			driver.findElement(By.id("dinheiro")).sendKeys(Salario);
		}
		
		if (TPContratacao.toUpperCase().equals("PJ"))
		{
			def.ClickPadrao(By.id("pj"));
		}
		else {
			def.ClickPadrao(By.id("clt"));
		}
			
		boolean clk = def.ClickPadrao(By.xpath("/html/body/div/div[2]/div/form/div[3]/input")); //Cadastro Funcionario
		if (!clk) {
			def.ClickPadrao(By.xpath("/html/body/div/div/div/form/div[3]/input")); //Editar Funcionario
		}
	}
	
	public void SearchCollaborator(String Nome) {
		
		defaultMethod def = new defaultMethod();
		def.AguardarElementos(By.xpath("//*[@id=\"tabela_filter\"]/label/input"));
		def.ClickPadrao(By.xpath("//*[@id=\"tabela_filter\"]/label/input"));
		
		driver.findElement(By.xpath("//*[@id=\"tabela_filter\"]/label/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"tabela_filter\"]/label/input")).sendKeys(Nome);
		def.AguardarElementos(By.xpath("//*[@id=\"tabela\"]/tbody/tr/td[1]"));
		assertEquals(def.GetAttribute(By.xpath("//*[@id=\"tabela\"]/tbody/tr/td[1]"), "innerText"), Nome);
	}	
	
    public void EditCollaborator(String Nome, String CPF, String Sexo, String Admissao, 
			String Cargo, String Salario, String TPContratacao ) {
		
		defaultMethod def = new defaultMethod();
		def.AguardarElementos(By.xpath("//*[@id=\"tabela\"]/tbody/tr/td[6]/a[2]/button"));
		def.ClickPadrao(By.xpath("//*[@id=\"tabela\"]/tbody/tr/td[6]/a[2]/button"));
		
		RegisterNewCollaborator(Nome, CPF, Sexo, Admissao, Cargo, Salario, TPContratacao);
	}
  
	public void DeleteCollaborator(String Nome) {

		SearchCollaborator(Nome);
		
		defaultMethod def = new defaultMethod();
		def.AguardarElementos(By.xpath("//*[@id=\"delete-btn\"]/span"));
		def.ClickPadrao(By.xpath("//*[@id=\"delete-btn\"]/span"));
		
		def.AguardarElementos(By.xpath("/html/body/div/div[1]/div"));
		assertEquals(def.GetAttribute(By.xpath("/html/body/div/div[1]/div/strong"), "innerText").trim(), "SUCESSO!");
	}
	
	
  
	
	
}
