package br.com.test.codes;

import org.openqa.selenium.By;
import br.com.test.method.startsWebDriver;

/* Esta é a Classe "LoginAndNewCustomer" do Projeto responsavel por conter todo codigo fonte que for 
utilizado nas telas do Login do site.
Nesta Classe vai conter todos os metodos e comandos(IF,Else e etc..) para o Logar e Verificar se 
o Login foi realizado com sucesso.
*/	

public class LoginAndNewCustomer extends startsWebDriver{

	public void RegisterNewCustomer(String user, String password, boolean ConfirmPassword) {
		
		if (!user.toUpperCase().equals(""))
		{
			driver.findElement(By.xpath("*//div[2]/input")).sendKeys(user);
		}
		
		if (!password.toUpperCase().equals(""))
		{
			driver.findElement(By.xpath("*//div[4]/input")).sendKeys(password);
		}
				
		if (ConfirmPassword)
		{
			driver.findElement(By.xpath("*//div[6]/input")).sendKeys(password);
		}
		
		driver.findElement(By.xpath("*//div[7]/button")).click();
	}
	
	public void LoginCustomer(String user, String password) {
		
		if (!user.toUpperCase().equals(""))
		{
			driver.findElement(By.xpath("*//div[3]/input")).sendKeys(user);
		}
		
		if (!password.toUpperCase().equals(""))
		{
			driver.findElement(By.xpath("*//div[5]/input")).sendKeys(password);
		}
	
		driver.findElement(By.xpath("*//div[6]/button")).click();
	}
	
	
	
	
	
	
}
