package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayedEnabledSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\eclipse-workspace\\SeleniumDemo\\Lib\\geckoDriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");
		boolean d= driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(d);
		boolean e= driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(e);
		driver.findElement(By.name("agreeTerms")).click();
		
		boolean e1= driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(e1);
		
		boolean s= driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(s);
	}

}
