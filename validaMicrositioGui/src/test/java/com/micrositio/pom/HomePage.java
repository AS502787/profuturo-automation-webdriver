package com.micrositio.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

	By imgProfuturoHomePage = By.xpath("//*[@id=\"app\"]/div/div[1]/header/div/div/div[1]/div[2]/img");
	By linkTextAfore = By.xpath("//*[@id=\"afore\"]");
	By linkTextMyAfore = By.xpath("//*[@id=\"myAfore\"]");
	By linkTextProfuturo = By.xpath("//*[@id=\"profuturo\"]");
	By linkTextCalculadora = By.xpath("//*[@id=\"calculator\"]");
	By linkTextSoyCliente = By.xpath("//*[@id=\"calculator-a\"]");
	By linkTextUnete = By.xpath("//*[@id=\"joinProfuturo\"]");
	By lblLoQueHace = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[1]/div/div[1]/span");
	By imgCheck1 = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[1]/div/div[2]/div[1]/i");
	By imgCheck2 = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[1]/div/div[3]/div[1]/i");
	By imgCheck3 = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[1]/div/div[4]/div[1]/i");
	By lblCheck1 = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[1]/div/div[2]/div[2]");
	By lblCheck2 = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[1]/div/div[3]/div[2]");
	By lblCheck3 = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[1]/div/div[4]/div[2]");
	By imgDescubreSiEresCliente = By.xpath("//*[@id=\"app\"]/div/div[3]/div[3]/div/div/div[1]/img");
	By btnDescubreSiEresCliente = By.xpath("//*[@id=\"app\"]/div/div[3]/div[3]/div/div/div[2]");
	By divQueEsUnaAfore = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[2]/div/div[1]");
	By divEnQueAforeEstoy = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[2]/div/div[2]");
	By divPorQueProfuturo = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[2]/div/div[3]");
	By divCambiarteNoEsVolver = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[2]/div/div[4]");
	By lblLaImportancia = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[3]/div[1]/div/h1");
	By lblLeeNuestroBlog = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[3]/div[2]/h2");
	By divInf1 = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[3]/div[3]/div[1]");
	By divInf2 = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[3]/div[3]/div[2]");
	By divInf3 = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[3]/div[3]/div[3]");
	By lblContacta = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[4]/div[2]/div[1]/div/h2[1]");
	By lblTeEnviaremos = By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[4]/div[2]/div[1]/div/h2[2]");
	By inptNombreCompleto = By.xpath("//*[@id=\"f_ec50d00f-2bc9-4a04-a66c-124ed26dc437\"]");
	By inptCorreo = By.xpath("//*[@id=\"f_cd85dc0a-5015-49ce-9438-d87d07ad2de8\"]");
	By inptTelefono = By.xpath("//*[@id=\"f_7613a632-dbb1-40b5-91d0-5f202049a156\"]");
	By chckBoxPrivacidad = By.xpath("//*[@id=\"privacyBox\"]");
	By lblPrivacidad = By.xpath("/*[@id=\"app\"]/div/div[3]/div[1]/div/div[4]/div[2]/div[2]/div/form/div/label/div/div[1]/div/label/span");
	By btnEnviarMisDatos = By.xpath("//*[@id=\"joinUs\"]");
	By lblLegal1 = By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div/div[1]");
	By lblLegal2 = By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div/div[2]");

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void isDisplayedAllElementsOfHomePage() {

		if (isDisplayed(imgProfuturoHomePage)) {

		} else {
			System.out.println("imgProfuturoHomePage was not present");
		}

		if (isDisplayed(linkTextAfore)) {

		} else {
			System.out.println("linkTextAfore was not present");
		}

		if (isDisplayed(linkTextMyAfore)) {

		} else {
			System.out.println("linkTextMyAfore was not present");
		}

		if (isDisplayed(linkTextProfuturo)) {

		} else {
			System.out.println("linkTextProfuturo was not present");
		}

		if (isDisplayed(linkTextCalculadora)) {

		} else {
			System.out.println("linkTextCalculadora was not present");
		}

		if (isDisplayed(linkTextSoyCliente)) {

		} else {
			System.out.println("linkTextSoyCliente was not present");
		}

		if (isDisplayed(linkTextUnete)) {

		} else {
			System.out.println("linkTextUnete was not present");
		}

		if (isDisplayed(lblLoQueHace)) {

		} else {
			System.out.println("lblLoQueHace was not present");
		}

		if (isDisplayed(imgCheck1)) {

		} else {
			System.out.println("imgCheck1 was not present");
		}

		if (isDisplayed(imgCheck2)) {

		} else {
			System.out.println("imgCheck2 was not present");
		}
		
		if (isDisplayed(imgCheck3)) {

		} else {
			System.out.println("imgCheck3 was not present");
		}
		
		if (isDisplayed(lblCheck1)) {

		} else {
			System.out.println("lblCheck1 was not present");
		}
		
		if (isDisplayed(lblCheck2)) {

		} else {
			System.out.println("lblCheck2 was not present");
		}
		
		if (isDisplayed(lblCheck3)) {

		} else {
			System.out.println("lblCheck3 was not present");
		}
		
		if (isDisplayed(imgDescubreSiEresCliente)) {

		} else {
			System.out.println("imgDescubreSiEresCliente was not present");
		}
		
		if (isDisplayed(btnDescubreSiEresCliente)) {

		} else {
			System.out.println("btnDescubreSiEresCliente was not present");
		}
		
		if (isDisplayed(divQueEsUnaAfore)) {

		} else {
			System.out.println("divQueEsUnaAfore was not present");
		}

		if (isDisplayed(divEnQueAforeEstoy)) {

		} else {
			System.out.println("divEnQueAforeEstoy was not present");
		}
		
		if (isDisplayed(divPorQueProfuturo)) {

		} else {
			System.out.println("divPorQueProfuturo was not present");
		}
		
		if (isDisplayed(divCambiarteNoEsVolver)) {

		} else {
			System.out.println("divCambiarteNoEsVolver was not present");
		}
		
		if (isDisplayed(lblLaImportancia)) {

		} else {
			System.out.println("lblLaImportancia was not present");
		}
		
		if (isDisplayed(lblLeeNuestroBlog)) {

		} else {
			System.out.println("lblLeeNuestroBlog was not present");
		}
		
		if (isDisplayed(divInf1)) {

		} else {
			System.out.println("divInf1 was not present");
		}
		
		if (isDisplayed(divInf2)) {

		} else {
			System.out.println("divInf2 was not present");
		}
		
		if (isDisplayed(divInf3)) {

		} else {
			System.out.println("divInf3 was not present");
		}
		
		if (isDisplayed(lblContacta)) {

		} else {
			System.out.println("lblContacta was not present");
		}
		
		if (isDisplayed(lblTeEnviaremos)) {

		} else {
			System.out.println("lblTeEnviaremos was not present");
		}
		
		if (isDisplayed(inptNombreCompleto)) {

		} else {
			System.out.println("inptNombreCompleto was not present");
		}
		
		if (isDisplayed(inptCorreo)) {

		} else {
			System.out.println("inptCorreo was not present");
		}
		
		if (isDisplayed(inptTelefono)) {

		} else {
			System.out.println("inptTelefono was not present");
		}
		
		if (isDisplayed(chckBoxPrivacidad)) {

		} else {
			System.out.println("chckBoxPrivacidad was not present");
		}
		
		if (isDisplayed(lblPrivacidad)) {

		} else {
			System.out.println("lblPrivacidad was not present");
		}
		
		if (isDisplayed(btnEnviarMisDatos)) {

		} else {
			System.out.println("btnEnviarMisDatos was not present");
		}
		
		if (isDisplayed(lblLegal1)) {

		} else {
			System.out.println("lblLegal1 was not present");
		}
		
		if (isDisplayed(lblLegal2)) {

		} else {
			System.out.println("lblLegal2 was not present");
		}
	}
}