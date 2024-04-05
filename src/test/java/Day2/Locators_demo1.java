package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_demo1 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
         
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirt"); //locator id
		driver.findElement(By.name("submit_search")).click(); //locator name
		
		//driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click(); //locator linked text
		
		driver.findElement(By.partialLinkText("Faded Short")).click(); // locator partial linked text
		
		System.out.println("successfully executed---script passed");
		
		driver.findElements(null);
		
		driver.close();
	}

}
