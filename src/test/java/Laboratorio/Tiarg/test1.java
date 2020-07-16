package Laboratorio.Tiarg;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
@Test
public void tes1_E1() {
 System.out.print("Hola Mundo");	
 System.setProperty("webdriver.chrome.driver", "..\\AP\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.dev");
	driver.quit();
}
}
