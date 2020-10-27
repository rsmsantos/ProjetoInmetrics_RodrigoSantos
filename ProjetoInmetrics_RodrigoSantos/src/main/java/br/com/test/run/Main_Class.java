package br.com.test.run;
import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.session.ChromeFilter;

import br.com.test.method.defaultMethod;
import br.com.test.method.startsWebDriver;
import br.com.test.scriptTest.scriptTest_LoginAndNewCustomer;
import br.com.test.scriptTest.scriptTest_collaborator;

public class Main_Class {

	@Test
	public void test_CRUD_Complete() {
		int UserRandomico = new Random().nextInt(1000);
		String user = "customerTest"+UserRandomico,
			   password = "123456";	  
		
		// Inicia o WebDriver
		startsWebDriver run = new startsWebDriver();
		run.OpenDriver();
		
		// Cria o cliente e faz login
		scriptTest_LoginAndNewCustomer scr = new scriptTest_LoginAndNewCustomer();
		scr.scriptTest_RegisterNewCustomer(user, password);
		scr.scriptTest_LoginCustomer(user, password);
		
		// Cadastro de Funcionario
		scriptTest_collaborator col = new scriptTest_collaborator();
		col.scriptTest_RegisterNewCollaborator();
		
		// Pesquisa Funcionario
		col.scriptTest_SearchCollaborator();
		
		// Editar Dados do Funcionario
		col.scriptTest_EditCollaborator();
		
		// Editar Dados do Funcionario
		col.scriptTest_DeleteCollaborator();
	}
}
