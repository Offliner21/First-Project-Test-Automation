package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// Open application OrangeHRM
		driver.get("https://demoqa.com/menu/");
		
		
		//Mouse Hover
		
		Actions action = new Actions (driver);
		WebElement mousseHover = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
        action.moveToElement(mousseHover).perform();
        
        //Assert
        
        String onHoverMessage = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).getText();
		
		Assert.assertTrue(onHoverMessage.contains("Sub Item"));
	
        System.out.println("Mouseover is working correctly");
        
        
        driver.quit();
	}

}
