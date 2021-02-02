package testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

		// Maximize browser
		driver.manage().window().maximize();

		// Open application Patient Form
		driver.get("https://demoqa.com/browser-windows");

		// Store and print the name of the first window
		String handle = driver.getWindowHandle();

		System.out.println(handle);

		// Click on the button "New Window Message"
		driver.findElement(By.id("messageWindowButton")).click();

		// Store and print the name of all windows open
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		//Pass a window handle to other window
		for (String handle1 : driver.getWindowHandles()) {
			System.out.println(handle1);
			driver.switchTo().window(handle1);
			
		}
		
       driver.quit();
	}

}
