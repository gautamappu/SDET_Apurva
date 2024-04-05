package day5;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_switch {

	public static void main(String[] args) throws InterruptedException {
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
 		else if(title.equals("Selenium - Wikipedia")) {
 			driver.findElement(By.xpath("//a[normalize-space()='Selenium']"));
 		    
			}
			System.out.println(driver.getTitle());
	}
    	for(String windid1:windowids)
    	{
    		String title= driver.switchTo().window(windid1).getTitle();
			if(title.equals("Selenium in biology - Wikipedia"))
			{
				driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']"));
		 		//System.out.println(driver.getTitle());
				Thread.sleep(4000);
			}
			
	}	
    	for(String windid2:windowids)
    	{
    		String title= driver.switchTo().window(windid2).getTitle();
			if(title.equals("Selenium (software) - Wikipedia"))
			{
				driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']"));
			}	
    	}
    	
    	for(String windid3:windowids)
    	{
    		String title= driver.switchTo().window(windid3).getTitle();
			if(title.equals("Selenium dioxide - Wikipedia"))
			{
				driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']"));
		 		
			}	
    	}
    	
    	for(String windid4:windowids)
    	{
    		String title= driver.switchTo().window(windid4).getTitle();
			if(title.equals("Selenium dioxide - Wikipedia"))
			{
				driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']"));
		 		
			}	
    	}
    
	}
	}
	
