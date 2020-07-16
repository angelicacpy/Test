package PruebasMPD;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import PaginasMPD.paginainicioMPD;
import PaginasMPD.paginaloginMPD;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;



public class Ejercicio1_E2 {
	WebDriver driver;
	String url="https://demomarketplace.tiarg.net.ar/qa/";
	String pathDriver="..\\Laboratorio\\Drivers\\chromedriver.exe"; 
	
	
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", pathDriver);
		driver = new ChromeDriver();
		driver.get(url);
	}
  @Test (priority=0)
  public void pruebainicio() {
	  
	  paginainicioMPD inicio = new paginainicioMPD(driver);
	  inicio.clicLogin();
	  
  }
  
  @Test (priority=1)
  public void ingreso()  throws IOException {
	  paginaloginMPD login = new paginaloginMPD(driver); 
	  login.loginUsuario("angelicacp@gmail.com", "123ap");
	  
	  
	  File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(screen,new File("..\\Laboratorio\\Evidencias\\Test.png"));
  }

}
