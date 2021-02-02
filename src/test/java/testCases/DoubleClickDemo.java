package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) throws InterruptedException {

		// Read chromedriver.exe
		// System.setProperty("webdriver.chrome.driver",
		// "src/test/resources/drivers/chromedriver.exe");
	//	WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// Open application OrangeHRM
		driver.get("http://demoqa.com/buttons");

		// Instanciate action class

		Actions action = new Actions(driver);

		// Retrieve Webelement to performdouble click

		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));

		// Double click on the button

		action.doubleClick(btnDoubleClick).perform();

		// Assert to test if the test is done and I got the needed result

		String doubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();

		Assert.assertTrue(doubleClickMessage.contains("double click"));

		Thread.sleep(3000);

		System.out.println("button is double clicked");

		// Scroll
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");

		// Refresh page
		driver.navigate().refresh();
		Thread.sleep(2000);

		// Go back
		driver.navigate().back();
		Thread.sleep(2000);

		// Forward
		driver.navigate().forward();
		Thread.sleep(2000);

		// driver.quit();

	}

}
