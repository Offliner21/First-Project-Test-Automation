package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.OperatingSystem;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover2 {

	public static void main(String[] args) {

		

		WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// Open application OrangeHRM
		driver.get("https://demoqa.com/slider/");
		
		Actions action = new Actions(driver);
		
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		action.moveToElement(slider, 50, 0).perform();
		slider.click();
		
		System.out.println("Move slider in Horizontal direction");
		
		driver.quit();
		
		
		
		
	}

}
