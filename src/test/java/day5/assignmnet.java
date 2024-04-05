package day5;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmnet {
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();
		
		Set <String> windowids=driver.getWindowHandles();	
    	for(String winid: windowids)
	{
		String title= driver.switchTo().window(winid).getTitle();
			if(title.equals("Automation Testing Practice"))
			{
 		Thread.sleep(4000);
				}
			else if(title.equals("Selenium - Wikipedia"))
				
				{
				driver.findElement(By.xpath("//a[normalize-space()='Selenium']"));
				System.out.println(	driver.getTitle());
				}
			
			else if(title.equals("Selenium in biology - Wikipedia"))
			{
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']"));
				System.out.println(	driver.getTitle());
			}
			else if(title.equals("Selenium (software) - Wikipedia"))
			{
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']"));
				System.out.println(	driver.getTitle());
			}
			else if(title.equals("Selenium disulfide - Wikipedia"))
			{
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']"));
				System.out.println(	driver.getTitle());
			}
			else if(title.equals("Selenium dioxide - Wikipedia"))
			{
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']"));
				System.out.println(	driver.getTitle());
			}
			
			
			
			System.out.println(	driver.getTitle());
		}

	}
		
		
		
		
	}


