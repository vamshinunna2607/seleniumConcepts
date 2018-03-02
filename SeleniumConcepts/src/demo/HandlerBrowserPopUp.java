package demo;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class HandlerBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\eclipse-workspace\\SeleniumDemo\\Lib\\geckoDriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Thread.sleep(2000);
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> itr =handler.iterator();
		
		String parentId=itr.next();
		System.out.println("parentId"+parentId);
		String childId=itr.next();
		System.out.println("childId"+childId);
		driver.switchTo().window(childId); 
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close(); 
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

	}

}
