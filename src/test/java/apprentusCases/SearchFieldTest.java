package apprentusCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.OperatingSystem;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchFieldTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();

		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);

		// Open application Apprentus
		String url = "https://www.apprentus.com/";
		driver.get(url);

		// maximize browser
		driver.manage().window().maximize();

		// Input the subject you are looking for
		driver.findElement(By.id("homepage")).sendKeys("Math");

		// Click on the search button
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		System.out.println("Search for Math class worked as expected");
		
		
        //Kill Browser
		driver.quit();

	}

}
