package myPOMPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {
	WebDriver driver;
	By email=By.id("Email");
	By password=By.name("Password");
	By signin=By.xpath("//input[@value='Log in']");


public LoginPOM(WebDriver driver) {
	this.driver=driver;
}

public void enteremail(String EM) {
	driver.findElement(email).sendKeys(EM);
	
}
public void enterpassword(String pwd) {
	driver.findElement(password).sendKeys(pwd);
	
}
public void clicksignin() {
	driver.findElement(signin).click();
	
}
}
