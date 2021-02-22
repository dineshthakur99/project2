package myTestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyGoogleTest {
	WebDriver driver;
	@BeforeMethod
	public void setbrowser() {
	System.setProperty("webdriver.chrome.driver", "G:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	}
	
	@Test
	public void checktitle() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "google");
	}
	
	@Test(priority=1)
	public void checklogo() {
		boolean view=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(view);
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
	
}
