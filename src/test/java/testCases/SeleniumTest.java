package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	// driver is declared here to be applied in all methods below
	public static WebDriver driver;

	@BeforeClass
	public static void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test
	public void valid_UserCridential() {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test
	public void invalid_UserCridential() {

		driver.findElement(By.id("txtUsername")).sendKeys("Tyrion");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test
	public void invalid_UserCridential1() {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("wrongpassword");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test
	public void invalid_UserCridential2() {

		driver.findElement(By.id("txtUsername")).sendKeys("wrongname");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}

	@AfterClass

	public static void tearDown() {

		driver.quit();
	}
}
