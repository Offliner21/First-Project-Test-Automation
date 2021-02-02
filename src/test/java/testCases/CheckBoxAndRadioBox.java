package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxAndRadioBox {

	public static void main(String[] args) {

	//	WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Open application OrangeHRM
		String url = "https://demoqa.com/automation-practice-form";
		driver.get(url);

		// maximize browser
		driver.manage().window().maximize();
		
		//CheckBox
		
		WebElement hobbiesSport = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		hobbiesSport.click();
		
		//RadioButton
		Select radio = new Select(driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]")));
		radio.selectByValue("Male");
		driver.quit();
		
		
		
	}

}
