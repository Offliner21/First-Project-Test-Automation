package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

		// Maximize browser
		driver.manage().window().maximize();

		// Open application Patient Form
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		
		//Accept Alert
		driver.switchTo().alert().accept();
		
		//Print title page
		String title = driver.getTitle();
		System.out.println("Title of the page is: " +title);
		
	}

}
