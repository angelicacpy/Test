package PaginasMPD;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class paginainicioMPD {
	WebDriver driver; 
	
	@FindBy (xpath="//*//*[@id=\"menu-item-433\"]/a") 
	WebElement btnLogin;  

	public paginainicioMPD(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(new AjaxElementLocatorFactory  (driver,20), this);}
	
	public void clicLogin() {
		btnLogin.click();
		}
	}

