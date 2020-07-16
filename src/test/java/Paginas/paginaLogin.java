package Paginas;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class paginaLogin {
	WebDriver driver;
	
	@FindBy (id="email") 
	WebElement txtemail; 
	
	@FindBy (id="passwd") 
	WebElement txtPass; 
	
	@FindBy (xpath="//*[@id=\"SubmitLogin\"]/span") 
	WebElement btnLogin; 
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1")
	WebElement tituloForm; 
		
	
	//constructor que hace referencia a la pagina con la que estoy trabajando 
	public paginaLogin(WebDriver driver) {//cada que se llama la pagina se pasa el driver
		this.driver = driver; //hace la referncia al driver 
		//inicializa los elemntos con una espera implicita 
		PageFactory.initElements(new AjaxElementLocatorFactory  (driver,20), this);}//realiza la espera

	public void loginUsuario(String email, String clave) {//definir las acciones para que complete los datosasi como los parametros dentro de los parentesis  
		txtemail.clear();
		txtemail.sendKeys(email);
		txtPass.clear();
		txtPass.sendKeys(clave);
		btnLogin.click();
		
	}
	public String getTituloForm() {
		return tituloForm.getText(); //se devuelve un string visible de ese elemento
		
	}
}
