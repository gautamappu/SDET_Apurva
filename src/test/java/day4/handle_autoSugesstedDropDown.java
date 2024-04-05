package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_autoSugesstedDropDown {

	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");

		Thread.sleep(4000);
		List<WebElement> drp= driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]//span"));
		
		Thread.sleep(5000);
		System.out.println("the no. of elements are: " +drp.size());
		
		for(WebElement dd:drp)
		{
			System.out.println(dd.getText());
			
		}
		
		for(int i=0;i<drp.size();i++)
		{
			if(drp.get(i).getText().equals("selenium interview questions"))
			{
				drp.get(i).click();
				break;
			}
			
			driver.close();
		}
		
		
	}

}
