package br.com.test.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class defaultMethod extends startsWebDriver {

	/*
	 * Esta é a classe "MetodosPadrao_Geral" do Projeto. Ela é responsavel por
	 * conter todo o codigo fonte que podem ser utilizado em qualquer projeto, pois,
	 * os comandos aqui inseridos são de funções padrão como Click, sendkeys e etc.
	 * Esta classe tem o proposito de normalizar a utilização destes recursos do
	 * selenium.
	 */

	public String GetAttribute(By Elemento, String Atributo) {
		String Result;

		try {
			Result = driver.findElement(Elemento).getAttribute(Atributo);
		} catch (Exception e) {
			Result = "";
		}
		return Result;
	}

	public boolean ClickPadrao(By by) {
		boolean res = false;
		try {
			AguardarElementos(by);
			driver.findElement(by).click();
			res = true;
		} catch (Exception e) {
			res = false;
		}
		return res;
	}

	public void AguardarElementos(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public boolean GoToURL(String url) {
		if (!url.equals("")) {
			driver.get(url);
			return true;
		} else {
			return false;
		}
	}

	public Boolean ClickEmTextos(String ElementText) {
		Boolean Result;
		try {
			WebElement element = driver.findElement(By.xpath("//*[contains(text(), '" + ElementText + "')]"));
			new Actions(driver).moveToElement(element).click(element).build().perform();

			Result = true;
		} catch (Exception e) {
			Result = false;
		}

		return Result;
	}

}
