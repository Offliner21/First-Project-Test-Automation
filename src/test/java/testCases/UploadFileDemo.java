package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileDemo {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

		// Maximize browser
		driver.manage().window().maximize();

		// Open application Patient Form
		driver.get("http://demo.guru99.com/test/upload/");
		
		
		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		uploadFile.sendKeys("/home/offliner/Pictures/nopandamamic.png");
		
		driver.findElement(By.id("terms")).click();
		
		//Click on the button submit using Javascript method (JavaScript executor)
		WebElement submitButton = driver.findElement(By.id("submitbutton"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		executor.executeScript("arguments[0].click();", submitButton);
		
		
		driver.quit();
		
		
	}

}
