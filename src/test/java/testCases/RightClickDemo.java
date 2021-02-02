package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {

	//	WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();

		// Open chromes
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// Open application OrangeHRM
		driver.get("http://demoqa.com/buttons");
		

		//Instanciate acion class
		
		Actions action = new Actions(driver);
		
		//Retrieve Webelement to performdouble click
		
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
		//WebElement btnRightClick = driver.findElement(By.xpath("//button[contains(@id='rightClickBtn')]"));
		
		action.contextClick(btnRightClick).perform();
				
		String rightClickMessage = driver.findElement(By.id("rightClickMessage")).getText();
		Assert.assertTrue(rightClickMessage.contains("You have done a right click"));
		
		System.out.println("right click context displayed");
		
		driver.quit();
		

	}

}
