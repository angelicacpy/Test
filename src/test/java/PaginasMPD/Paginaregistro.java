package PaginasMPD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Paginaregistro {
	WebDriver driver;
	
	@FindBy (id="reg_email") 
	WebElement txtreg_email; 
	
	public Paginaregistro(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory  (driver,20), this);}
	
	public void registroUsuario(String email) {  
		txtreg_email.clear();
		txtreg_email.sendKeys(email);
	}

}


//reg_email