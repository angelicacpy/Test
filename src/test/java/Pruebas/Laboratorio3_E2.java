package Pruebas;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Paginas.paginaLogin;
import Paginas.paginainicio;

public class Laboratorio3_E2 {
	WebDriver driver;		
	String url="http://automationpractice.com/index.php";
	String pathDriver="..\\Laboratorio\\Drivers\\chromedriver.exe"; 
	
	
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", pathDriver);
		driver = new ChromeDriver(); 
		driver.get(url);
		
		
		
		
	}
  @Test (priority=0)
  public void f() {
	  
	  paginainicio inicio = new paginainicio(driver); //se define el nombre de la clase para instanciar, importar la ruta donde sale el error 
	  inicio.clicLogin();//para acceder al metodo
	  
  }
  
  @Test (priority=1)
  public void ingreso()  throws IOException {
	  paginaLogin login = new paginaLogin(driver); 
	  login.loginUsuario("angelicacp@gmail.com", "123ap");//al seleccionar el metodo trae los parametros ya definidos en la pagina login
	  //definir en el segundo test 
	  
	  File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(screen,new File("..\\Laboratorio\\Evidencias\\Test.png"));//siempre que se pide un manejo de excpecion 
	  
  }
}
