package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_tables {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/admin/");
		
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		//customers
			driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		    driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		String text= driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
         
		int total=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		System.out.println("The total number of pages:" +total);
		
		for(int p=1;p<=5;p++)
		{
			if(total>1)
			{
				WebElement page=driver.findElement(By.xpath("(//ul[@class='pagination'])//li"));
				System.out.println("active pages:" +page.getText());
				page.click();
				Thread.sleep(5000);
			}
			
		}
	}

}
