package PaginasMPD;

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

public class LoginVarios {
	WebDriver driver;		
	String url="https://demomarketplace.tiarg.net.ar/qa/mi-cuenta/";
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
	  public void ingreso(String usuario, String contraseña)  throws IOException {
		  paginaLogin login = new paginaLogin(driver); 
		  login.loginUsuario(usuario, contraseña);
		  
		  File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screen,new File("C:\\Users\\angel\\eclipse-workspace\\Laboratorio\\Evidencias\\Test.png"));
		  
		  Assert.assertEquals("Iniciar sesión", login.getTituloForm());
		  
	  }
	   
  @DataProvider(name="Registro invalido")
  public Object[][] dp() {
	  Object[][] datos = new Object[2][2];
	  datos[0][0]="Carla";
	  datos[0][1]="568";
	  datos[1][0]="Jose";
	  datos[1][1]="123";	
	  
	  return datos; 
	  
  }
  
  @DataProvider(name="Registro invalido excel")
  public Object[][] datosPruebaExcel() throws Exception {
	  Object[][] datos = DatosExcel.leerExcel("C:\\Users\\angel\\eclipse-workspace\\Laboratorio\\Recursos\\datosmpd.ods", "Hoja1");
	  return datos; 
  }
	

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
