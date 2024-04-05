package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_demo4 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Samsung Series 9 NP900X4C Premium Ultrabook");
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Samsung Series 9 NP900X4C Premium Ultrabook");
		//  driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys("Samsung Series 9 NP900X4C Premium Ultrabook");
		driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("Samsung Series 9 NP900X4C Premium Ultrabook");
	}

}
