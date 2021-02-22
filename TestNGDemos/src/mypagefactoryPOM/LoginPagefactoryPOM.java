package mypagefactoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagefactoryPOM {
	WebDriver driver;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginbtn;
	
	public LoginPagefactoryPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendemail(String em) {
		email.sendKeys(em);
	}
	public void sendpassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickloginbtn() {
		loginbtn.click();
	}
	
}
