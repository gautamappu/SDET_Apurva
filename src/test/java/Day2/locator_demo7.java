package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class locator_demo7 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationbookstore.dev/");
		WebElement book6=driver.findElement(By.id("pid7_thumb"));
		String book5= driver.findElement(RelativeLocator.with(By.tagName("li")).above(book6)).getText();
		System.out.println(book5);
		
		driver.close();

	}

}
