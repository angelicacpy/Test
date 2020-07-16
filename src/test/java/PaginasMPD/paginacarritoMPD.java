package PaginasMPD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class paginacarritoMPD {
WebDriver driver; 
	
	@FindBy (xpath="//*[@id=\"masthead\"]/div[1]/div[4]/ul/li/a/span[1]") 
	WebElement btncarrito;  

	public paginacarritoMPD(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(new AjaxElementLocatorFactory  (driver,20), this);}
	
	public void cliccarrito() {
		btncarrito.click();
		}

}
