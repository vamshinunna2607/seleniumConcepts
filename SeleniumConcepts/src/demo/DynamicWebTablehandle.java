package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTablehandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\eclipse-workspace\\SeleniumDemo\\Lib\\geckoDriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='navmenu']/ul/li[4]/a")).click();
		
		
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]
		//method1
//		String beforXpath = "//*[@id='vContactsForm']/table/tbody/tr[";
//		String afterXpath = "]/td[2]";
//		
//		for(int i=4;i<9;i++)
//		{
//			String name =driver.findElement(By.xpath(beforXpath+i+afterXpath)).getText();
//			System.out.println(name);
//			if(name.contains("Aashley Aaskers"))
//			{
//				//*[@id='vContactsForm']/table/tbody/tr[8]/td[1]
//				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]")).click();
//			}
//		}
		
		//method2
		driver.findElement(By.xpath("//a[contains(text(),'Akash Rathor')]/parent::td//preceding-sibling::td//input[@name ='contact_id']")).click();
	}

}
