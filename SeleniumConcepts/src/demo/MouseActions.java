package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\eclipse-workspace\\SeliniumDemo\\Lib\\geckodriver\\geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://spicejet.com/");
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.linkText("MENU"))).build().perform();
			
			Thread.sleep(3000);
			act.moveToElement(driver.findElement(By.linkText("Travel Info"))).build().perform();
			Thread.sleep(3000);
			act.moveToElement(driver.findElement(By.linkText("Carriage of Live Animals"))).click().build().perform();
			
			

		}

}

