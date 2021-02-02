package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.OperatingSystem;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Open application OrangeHRM
		String url = "https://demoqa.com/droppable/";
		driver.get(url);

		// maximize browser
		driver.manage().window().maximize();

		// Drag and drop

		Actions action = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		action.dragAndDrop(from, to).perform();

		// Verify text changed into dropped

		String textTo = to.getText();
		
		if (textTo.equals("Dropped!")) {
			
			System.out.println("Pass: Source is dropped to target as expected");
			
		} else {
			
			System.out.println("Fail: Source couldn't be dropped to target as expected");
			
		}
		
		driver.quit();

	}

}
