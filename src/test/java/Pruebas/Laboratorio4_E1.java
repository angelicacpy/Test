 package Pruebas;

import org.testng.annotations.Test;

import Paginas.paginaLogin;
import Paginas.paginainicio;
import Utilidades.DatosExcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Laboratorio4_E1 {
	WebDriver driver;		
	String url="http://automationpractice.com/index.php";
	String pathDriver="..\\Laboratorio\\Drivers\\chromedriver.exe"; 
	
	 @BeforeSuite
	  public void beforeSuite() {
		  System.setProperty("webdriver.chrome.driver", pathDriver);
		  driver = new ChromeDriver(); 
		  driver.get(url);
	 }
	
	 @Test (priority=0)
	  public void f() {
		  
		  paginainicio inicio = new paginainicio(driver); 
		  inicio.clicLogin();
	  }
	  
	  @Test (priority=1, dataProvider="Registro invalido excel")
	  public void ingreso(String usuario, String clave)  throws IOException {
		  paginaLogin login = new paginaLogin(driver); 
		  login.loginUsuario(usuario, clave);
		  
		  File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screen,new File("..\\Laboratorio\\Evidencias\\Test.png"));
		  
		  Assert.assertEquals("AUTHENTICATION", login.getTituloForm());
		  
	  }
	   
  @DataProvider(name="Registro invalido")
  public Object[][] dp() {
	  Object[][] datos = new Object[2][2];
	  datos[0][0]="Angelica";
	  datos[0][1]="contraseña";
	  datos[1][0]="Julio";
	  datos[1][1]="123";	
	  
	  return datos; 
	  
  }
  
  @DataProvider(name="Registro invalido excel")
  public Object[][] datosPruebaExcel() throws Exception {
	  Object[][] datos = DatosExcel.leerExcel("C:\\Users\\angel\\eclipse-workspace\\Laboratorio\\Recursos\\Datos.xlsx", "Hoja1");
	  return datos; 
  }
	

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
