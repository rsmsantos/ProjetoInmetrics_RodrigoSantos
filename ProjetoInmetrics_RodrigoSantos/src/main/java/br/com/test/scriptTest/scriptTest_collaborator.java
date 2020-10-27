package br.com.test.scriptTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import br.com.test.codes.Collaborator;
import br.com.test.method.defaultMethod;

/* Esta é a classe "scriptTest_collaborator" do Projeto responsavel por definir todos os caminhos que o testes
deverá passar para concluir as rotinas verificação do LOGIN, exibindo ponto a ponto cada etapa do teste.
Nesta Classe somente pode conter as chamadas dos metodos seguencialmente e não comandos como IF, Else e etc.
*/

public class scriptTest_collaborator {
	
	public void scriptTest_RegisterNewCollaborator() {
		
		defaultMethod def = new defaultMethod();
		def.AguardarElementos(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a"));
		def.ClickPadrao(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a"));
		
		Collaborator col = new Collaborator();
		col.RegisterNewCollaborator("Rufino", "882.725.730-67", "MASCULINO", "11/11/2011", "Eng QA", "6800,00", "clt");
		def.AguardarElementos(By.xpath("//*[@id=\"tabela_filter\"]/label/input"));
		assertTrue(def.ClickPadrao(By.xpath("//*[@id=\"tabela_filter\"]/label/input")));
	}
	
	public void scriptTest_SearchCollaborator() {
		Collaborator col = new Collaborator();
		col.SearchCollaborator("Rufino");
	}
	
	public void scriptTest_EditCollaborator() {
		Collaborator col = new Collaborator();
		col.SearchCollaborator("Rufino");
		col.EditCollaborator("Rufino Silva", "", "", "", "Analista QA", "", "");
		col.SearchCollaborator("Rufino Silva");
	}
	
	public void scriptTest_DeleteCollaborator() {
		Collaborator col = new Collaborator();
		col.DeleteCollaborator("Rufino Silva");
	}
	
}
