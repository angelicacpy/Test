package PruebasMPD;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ejercicio1_E3 {

WebDriver driver; 
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "..\\Laboratorio\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@BeforeTest
	public void irUrl() {

		driver.get("https://demomarketplace.tiarg.net.ar/qa/mi-cuenta/");
		
	}

	@BeforeClass
	public void maxVentana() {
		driver.manage().window().maximize();
	}
	


@Test
  public void f() {
	  
	  WebDriverWait myWaitVar = new WebDriverWait(driver, 15); 
		WebElement txtCel = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("reg_email"))); 
		txtCel.sendKeys("acp@yopmail.com");
				
		WebElement btnInicio = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("register"))); 
		btnInicio.click(); 
		
		Assert.assertEquals("https://demomarketplace.tiarg.net.ar/qa/mi-cuenta//", driver.getCurrentUrl());
		
	
		  }

	@AfterClass
	public void finPrueba() {
	System.out.print("Fin de Prueba");
	}

	@AfterTest
	public void cierre() {
	}

	@AfterSuite
	public void finSuite() {
	}

}
