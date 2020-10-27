package br.com.test.scriptTest;

import static org.junit.Assert.assertTrue;
import java.util.Random;
import org.openqa.selenium.By;
import br.com.test.codes.LoginAndNewCustomer;
import br.com.test.method.defaultMethod;

public class scriptTest_LoginAndNewCustomer {

	
	public void scriptTest_RegisterNewCustomer(String user, String password) {
		
		defaultMethod def = new defaultMethod();
		def.GoToURL("http://www.inmrobo.tk/accounts/login/");
		def.ClickPadrao(By.xpath("*//div[7]/a"));
		def.AguardarElementos(By.xpath("*//div[2]/input"));
				
		LoginAndNewCustomer cos = new LoginAndNewCustomer(); 
		cos.RegisterNewCustomer(user, password, true);
		def.AguardarElementos(By.xpath("*//div[3]/input"));
		assertTrue(def.ClickPadrao(By.xpath("*//div[3]/input")));
	}
	
	public void scriptTest_LoginCustomer(String user, String password) {
		defaultMethod def = new defaultMethod();
		def.GoToURL("http://www.inmrobo.tk/accounts/login/");
		
		LoginAndNewCustomer cos = new LoginAndNewCustomer(); 
		cos.LoginCustomer(user, password);
		def.AguardarElementos(By.xpath("//*[@id=\"tabela_filter\"]/label/input"));
		assertTrue(def.ClickPadrao(By.xpath("//*[@id=\"tabela_filter\"]/label/input")));
	}

	
	
	
	
	
	
}
