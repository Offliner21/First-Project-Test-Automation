package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		// Read chromedriver.exe
		// System.setProperty("webdriver.chrome.driver",
		// "src/test/resources/drivers/chromedriver.exe");
	//	WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		// Maximize browser
		driver.manage().window().maximize();

		// Open application OrangeHRM
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Input username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		// Input password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// Click button login
		// driver.findElement(By.id("btnLogin")).click();

		// Explicit wait
		WebElement btnLogin;
		btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin")));
		btnLogin.click();
		
		// Click on the submit button with an alternative method 
		
		//btnLogin.submit();

		// Assert

		String adminUser = driver.findElement(By.id("welcome")).getText();

		Assert.assertTrue(adminUser.contains("Welcome Paul"));

		// Wait 3 sec
		//Thread.sleep(3000);

		// Print a log in message to the screen
		System.out.println("Successfull authentification!");

		// Kill browser
		driver.quit();

	}

}
