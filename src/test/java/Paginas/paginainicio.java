package Paginas;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class paginainicio {
	WebDriver driver; // Para llamar la pagina 
		
@FindBy (xpath="//*//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a") 
WebElement btnLogin; //con un nombre especifico 

public paginainicio(WebDriver driver) {//cada que se llama la pagina se pasa el driver
	this.driver = driver; //hace la referncia al driver 
	//inicializa los elemntos con una espera implicita 
	PageFactory.initElements(new AjaxElementLocatorFactory  (driver,20), this);}//realiza la espera

//codificar un metodo para la  pagina 
public void clicLogin() {
	btnLogin.click();//para que el boton haga un clic, llamando a la variable que se definio en el driver 
}
}
