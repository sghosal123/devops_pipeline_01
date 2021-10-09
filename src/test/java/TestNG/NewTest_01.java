package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest_01 {

	WebDriver driver;

	@BeforeMethod

	public void launch() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://3.110.32.230:8080/addressbook/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void wbd1() {

		driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Test2");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("Mail");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("123456789");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("test2@test.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("10/5/21,");
		driver.findElement(By.xpath("//div[@class = 'v-button v-widget primary v-button-primary']")).click();
	}
		

	@AfterMethod
	public void close() {

		driver.close();

	}

}
