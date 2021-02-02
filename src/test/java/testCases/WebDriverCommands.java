package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Maximize browser
		driver.manage().window().maximize();

		// Open application OrangeHRM
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);

		String titlePage = driver.getTitle();

		int titleLength = titlePage.length();

		System.out.println("Tittle of the page is: " + titlePage);
		System.out.println("Length of the title is: " + titleLength);
		String actualUrl = driver.getCurrentUrl();

		if (actualUrl.equals(url)) {

			System.out.println("Verification Successfull - the correct url is opened");

		} else {

			System.out.println("Verification Failed an incorrect url is opened");
		}

		System.out.println("Actual url is: " + actualUrl);
		System.out.println("expected url is: " + url);
		String sourcePage = driver.getPageSource();
		int lengthSourcePage = sourcePage.length();

		System.out.println("Length of the source page is: " + lengthSourcePage);

		driver.quit();
	}

}
