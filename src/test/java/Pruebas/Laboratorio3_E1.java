package Pruebas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.Assert;



public class Laboratorio3_E1 {
	WebDriver driver; 
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "..\\Laboratorio\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@BeforeTest
	public void irUrl() {
	
		driver.get("https://www.facebook.com/");
		
	}
	
	@BeforeClass
	public void maxVentana() {
		driver.manage().window().maximize();
		

		
	}
	
  @Test (description = "Registro invalido de Usuario")
  public void registroUsuario() {
	    	  
				WebDriverWait myWaitVar = new WebDriverWait(driver, 15); 
		WebElement txtCel = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("email"))); 
		txtCel.sendKeys("12312");
		
		WebElement txtCont = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("pass"))); 
		txtCont.sendKeys("pass");
		
		WebElement btnInicio = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Iniciar sesión']"))); 
		btnInicio.click(); 
		
		Assert.assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
		
		
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
