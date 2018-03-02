package demo;





import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\eclipse-workspace\\SeleniumDemo\\Lib\\geckoDriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://www.facebook.com/");
		
		//System.out.println(driver.getTitle());
		
//		WebDriverWait wait = new WebDriverWait (driver, 15);
//		wait.until(ExpectedConditions.titleIs("Facebook - Log In or Sign Up"));
//		driver.close();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		WebElement element = driver.findElement(By.id("emailp"));
//		element.sendKeys("QA testing");
//		List<WebElement> inputs = driver.findElements(By.className("inputtext"));
//		System.out.println(inputs.size());
//		WebElement tagName = driver.findElement(By.tagName("button"));
//		tagName.click();
//		WebElement name = driver.findElement(By.name("lastname"));
//		name.sendKeys("hello");
//		WebElement linktext = driver.findElement(By.linkText("Forgot account?"));
//		//linktext.click();
//		WebElement partialLinkText = driver.findElement(By.partialLinkText("Use"));
//		//partialLinkText.click();
//		WebElement cssid = driver.findElement(By.cssSelector("input#u_0_e"));
//		cssid.sendKeys("hero");
		//driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys("bro");
		//driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("man");
		//driver.findElement(By.xpath("//*[@name='firstname'][@id='']")).sendKeys("hood");
//		driver.findElement(By.xpath("//*[contains(@name,'reg_email__')]")).sendKeys("how");
//		driver.findElement(By.xpath("//*[starts-with(@name,'reg_e')]")).sendKeys("are");
		//driver.findElement(By.cssSelector("input[name^='first']")).sendKeys("babe");
		
		
	} 

}
