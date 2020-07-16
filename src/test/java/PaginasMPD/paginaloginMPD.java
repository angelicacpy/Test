package PaginasMPD;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class paginaloginMPD {
WebDriver driver;
	
	@FindBy (id="username") 
	WebElement txtusername; 
	
	@FindBy (id="password") 
	WebElement txtpassword; 
	
	@FindBy (name="login") 
	WebElement btnLogin; 
	
	
	//constructor que hace referencia a la pagina con la que estoy trabajando 
	public paginaloginMPD(WebDriver driver) {//cada que se llama la pagina se pasa el driver
		this.driver = driver; //hace la referncia al driver 
		//inicializa los elemntos con una espera implicita 
		PageFactory.initElements(new AjaxElementLocatorFactory  (driver,20), this);}//realiza la espera

	public void loginUsuario(String username, String clave) {//definir las acciones para que complete los datosasi como los parametros dentro de los parentesis  
		txtusername.clear();
		txtusername.sendKeys(username);
		txtpassword.clear();
		txtpassword.sendKeys(clave);
		btnLogin.click();
		
	}
}

