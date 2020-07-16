package Laboratorio.Tiarg;
import org.junit.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


@SuppressWarnings("unused")
public class Laboratorio2 {
@Test
	public void Lab2_E0() {
		System.setProperty("webdriver.chrome.driver", "..\\AP\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    
		driver.get("https://www.selenium.dev/");
		WebElement linkDescarga = driver.findElement(By.linkText("Downloads"));
		linkDescarga.click();
		
		driver.quit();
	}

     @Test
     public void Lab2_E1() {
     System.setProperty("webdriver.chrome.driver", "..\\AP\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
     
		
		driver.get("https://www.facebook.com/");
		
		WebDriverWait myWaitVar = new WebDriverWait(driver, 15); 
		WebElement txtNombre = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("firstname"))); 
		txtNombre.sendKeys("Angelica");
		
		WebElement txtApellido = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("lastname"))); 
		txtApellido.sendKeys("Pacheco");
		
		WebElement txtCel = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='reg_email__']"))); 
		txtCel.sendKeys("123123");
		
		WebElement txtCont = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='reg_passwd__']"))); 
		txtCel.sendKeys("1231");

		Select mes = new Select(myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("month"))));
		mes.selectByVisibleText("nov");
		
		Select dia = new Select(myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("day"))));
		dia.selectByValue("10");
			
		
		driver.quit();
		
     }
     
     @Test
     public void Lab2_E2() {
     System.setProperty("webdriver.chrome.driver", "..\\AP\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebDriverWait myWaitVar = new WebDriverWait(driver, 15); 
		WebElement txtCel = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("email"))); 
		txtCel.sendKeys("12312");
		
		WebElement txtCont = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("pass"))); 
		txtCont.sendKeys("pass");
		
		WebElement btnInicio = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Iniciar sesión']"))); 
		btnInicio.click(); 
		
		driver.quit();
		
		
     } 

}
