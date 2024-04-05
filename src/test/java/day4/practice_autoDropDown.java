package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_autoDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> drp= driver.findElements(By.xpath("//div[@class='dimmer dim cdxShowConv']"));
		 Thread.sleep(4000);
		 
		 System.out.println("the no. of elements are: " +drp.size());
		 
//		 for(WebElement dd:drp)
//		 {
//			 System.out.println(dd.getText());
//		 }
		 
		 
		

	}

}
