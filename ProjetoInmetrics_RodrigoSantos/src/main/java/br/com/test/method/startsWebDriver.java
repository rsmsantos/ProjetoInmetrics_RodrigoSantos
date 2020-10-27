package br.com.test.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class startsWebDriver {

	/*
	 * Esta é a Classe "IniciaWebDrive". Ela é responsável por iniciar o driver do
	 * browser para navegação nas tela. Por se tratar de um recurso que todos os
	 * projetos necessitam, esta classe foi criada separadamente para poder ser
	 * incorporada em qualquer outro projeto, afim de, normalizar e reaproveitar este
	 * recurso.
	 */

	public static WebDriver driver;

	public WebDriver OpenDriver() {
		try {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\library\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} catch (Exception e) {
			return (WebDriver) e;
		}
		return driver;
	}

	public void CloseDriver() {
		try {
			driver.close();
			System.exit(0);
		} catch (Exception e) {
		}
	}
}
