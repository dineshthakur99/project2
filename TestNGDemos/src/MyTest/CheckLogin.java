package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import myPOMPackage.LoginPOM;

public class CheckLogin {
	@Test
	public void logintest() {
	System.setProperty("webdriver.chrome.driver", "G:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/login");
	
	LoginPOM login=new LoginPOM(driver);
	login.enteremail("rekhabr1@gmail.com");
	login.enterpassword("rekhab");
	login.clicksignin();
	
}
}