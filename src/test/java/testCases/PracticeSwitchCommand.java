package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {

		
		// Open chrome
				WebDriver driver = new ChromeDriver();

				// Implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

				// Maximize browser
				driver.manage().window().maximize();

				// Open application Patient Form
				driver.get("http://demo.guru99.com/test/guru99home/");
				
			
				//Switching the frame by id
				driver.switchTo().frame("a077aa5e");
				
				// Click Pub
				driver.findElement(By.xpath("html/body/a/img")).click();
				
				
				// Quit Chrome
		   driver.close ();
				
				
		
	}

}
