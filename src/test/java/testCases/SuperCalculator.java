package testCases;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperCalculator {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "https://juliemr.github.io/protractor-demo/";
		driver.get(url);

// Input FirstNumber
		driver.findElement(By.xpath("//*[@ng-model=\"first\"]")).sendKeys("5");

// Dropdown list Operator
		Select drpOperator = new Select(driver.findElement(By.xpath("//*[@ng-model=\"operator\"]")));
		drpOperator.selectByVisibleText("+");
		drpOperator.selectByIndex(0);

// Input LastNumber
		driver.findElement(By.xpath("//*[@ng-model=\"second\"]")).sendKeys("7");

// Click doAddition
		driver.findElement(By.id("gobutton")).click();

		WebElement result = driver.findElement(By.tagName("h2"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Pattern pattern = Pattern.compile("\\d+");
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));

		System.out.println("the result is : " + result.getText());

	}

}