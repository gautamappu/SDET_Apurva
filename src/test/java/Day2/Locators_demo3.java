package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_demo3 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		
		//driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("Tops"); //tag and id
		//driver.findElement(By.cssSelector("input.search_query")).sendKeys("Tops"); //tag and class
		//driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("Tops"); //tags and attribute
		driver.findElement(By.cssSelector("input.search_query[name=\"search_query\"]")).sendKeys("Tops");
		

		driver.close();
	}

}
