package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\eclipse-workspace\\SeleniumDemo\\Lib\\geckoDriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
		
//		WebDriverWait wait = new WebDriverWait (driver, 15);
//		wait.until(ExpectedConditions.titleIs("Facebook - Log In or Sign Up"));
//		driver.close();
		
		clickon(driver,driver.findElement(By.xpath(".//*[@id='u_0_2']")),10);

	}
	
	public static void clickon(WebDriver d,WebElement locator,int timeout)
	{
		new WebDriverWait(d,timeout).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}
