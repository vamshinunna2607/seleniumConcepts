package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\eclipse-workspace\\SeliniumDemo\\Lib\\geckodriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath(".//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath(".//*[@id='droppable']"))).release().build().perform();
	}

}
