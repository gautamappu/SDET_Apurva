package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_demo8 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> items= driver.findElements(By.xpath("//*[@name=\"email\"]/following::*"));
		System.out.println(items.size());
		
		List<WebElement> items1=driver.findElements(By.tagName("input"));
		System.out.println(items1.size());

	}

}
