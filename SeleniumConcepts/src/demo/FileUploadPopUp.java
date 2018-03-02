package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\eclipse-workspace\\SeleniumDemo\\Lib\\geckoDriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		//driver.manage().deleteAllCookies();
		
		driver.get("http://html.com/input-type-file/");
		driver.findElement(By.xpath(".//*[@id='fileupload']")).sendKeys("C:\\Users\\vamsh\\Desktop\\a.docx");
	}

}
