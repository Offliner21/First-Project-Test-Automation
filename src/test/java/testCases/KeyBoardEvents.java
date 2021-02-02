package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

		// Maximize browser
		driver.manage().window().maximize();

		// Open application Patient Form
		driver.get("https://demoqa.com/text-box");

		// Find Webelement
		WebElement fullname = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		
		//Instanciate action class
		Actions action = new Actions(driver);
        action.sendKeys(fullname, "Tyrion Lanister").perform();
        action.sendKeys(email, "Tyrion@gameofthrones.com").perform();
        action.sendKeys(currentAddress, "10 rue de test 2037").perform();
        
        //Copy currentAddress
        action.keyDown(currentAddress, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(permanentAddress, Keys.CONTROL).perform();
        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        
	}

}
