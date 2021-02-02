package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

		// Maximize browser
		driver.manage().window().maximize();

		// Open application Patient Form
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement element = driver.findElement(By.id("txtUsername"));
		String attValue = element.getAttribute("id");

		System.out.println("The ID attribute is: " + attValue);
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		WebElement element2 = driver.findElement(By.id("txtPassword"));
		Dimension dimensions = element2.getSize();
		System.out.println("Hight: " + dimensions.height + "Width: " + dimensions.width);
		driver.findElement(By.id("txtPassword")).clear();

		WebElement element3 = driver.findElement(By.id("txtPassword"));
		Point point = element3.getLocation();
		System.out.println("X Coordinate: " + point.x + "Y Coordinate: " + point.y);

		// Vérifier si le bouton afficher vrai/faux
		WebElement element4 = driver.findElement(By.id("btnLogin"));
		boolean status = element4.isDisplayed();
		System.out.println(status);

		// Vérifier si le bouton activer vrai/faux
		WebElement element5 = driver.findElement(By.id("btnLogin"));
		boolean status1 = element5.isEnabled();
		System.out.println(status1);

		// Vérifier si le bouton exist

		List<WebElement> element6 = driver.findElements(By.id("btnLogin"));

		if (element6.size() != 0) {

			System.out.println("Button login exists");
		} else {

			System.out.println("Button login doesn't exist");

		}

	}

}
