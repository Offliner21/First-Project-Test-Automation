package testCases;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

public class PatientForm {

	public static void main(String[] args) {

		// WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

		// Maximize browser
		driver.manage().window().maximize();

		// Open application Patient Form
		driver.get("https://form.jotform.com/81665408084158");

		// Chose Patient Gender
		Select drpdwnGender = new Select(driver.findElement(By.id("input_71")));
		drpdwnGender.selectByVisibleText("Male");

		// Input First Name
		driver.findElement(By.id("first_45")).sendKeys("John");

		// Input Last Name
		driver.findElement(By.id("last_45")).sendKeys("Snow");

		// Chose Month of Birth
		Select drpdwn = new Select(driver.findElement(By.id("input_46_month")));
		drpdwn.selectByVisibleText("January");

		// Chose the day of birth
		Select drpdwnDay = new Select(driver.findElement(By.id("input_46_day")));
		drpdwnDay.selectByVisibleText("14");

		// Chose the year of birth
		Select drpdwnYear = new Select(driver.findElement(By.id("input_46_year")));
		drpdwnYear.selectByVisibleText("2020");

		// Scroll down
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,700)", "");

		// Chose a sickness
		WebElement sickness = driver.findElement(By.id("label_input_52_11"));
		sickness.click();

		// Scroll down again
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,999)", "");

		// Select how many days the patient exercises with Fluent wait

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement radio = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("label_input_80_1"));
			}
		});

		// WebElement radio = driver.findElement(By.id("label_input_80_1"));
		radio.click();
		
		// Scroll down again
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,999)", "");

		
		// Submit the form
		driver.findElement(By.id("input_14")).click();

		System.out.println("The exercise is finished correctly");
		
		

		// Quit Chrome
	//	driver.quit();

	}

}
