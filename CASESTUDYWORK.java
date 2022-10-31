package Newpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CASESTUDYWORK {

	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	@BeforeTest
	public void beforetest() throws InterruptedException {
//		WebDriverManager.edgedriver().setup();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//		driver.new EdgeDriver;
		driver.get(url);
		Thread.sleep(5000);
	}


	@Test (enabled = true, priority = 0)
	public void login() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//	    driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]")).click();
	    Thread.sleep(5000);
	}
	
	

	@Test(enabled = true,priority = 1)
	public void testlink() throws InterruptedException {
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("Total number of the links "+ links.size());
		Thread.sleep(5000);;
		for(int i=0;i<links.size();i++) {
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		
		}
		}
	}
		@Test(enabled = true, priority = 2)
		//pim
		public void testcase() throws InterruptedException  {
			Thread.sleep(5000);
				
			driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(6).click();
			Thread.sleep(5000);
			driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(6).click();
			Thread.sleep(5000);
			driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(6).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
			Thread.sleep(5000);
		}
			
			
		
	@Test (enabled = true ,priority = 3)
	public void logut() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Logout']")).click();
        System.out.println("logout");
        Thread.sleep(5000);
	}
	
}

	    
	    