package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import mypagefactoryPOM.LoginPagefactoryPOM;

public class VerifyLogintestpagefactory {
	@Test
	public void logintest() {
	System.setProperty("webdriver.chrome.driver", "G:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/login");
	
	LoginPagefactoryPOM Loginpage=PageFactory.initElements(driver, LoginPagefactoryPOM.class);
	
	Loginpage.sendemail("rekhabr3@gmail.com");
	Loginpage.sendpassword("rekhab");
	Loginpage.clickloginbtn();
	driver.close();
	
}
}