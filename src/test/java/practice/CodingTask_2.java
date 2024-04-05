package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodingTask_2 {
	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://www.amazon.in/");
	
	
		 driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][normalize-space()='Customer Service']")).click();
		 
		 Thread.sleep(5000);
		 
		
	        Set <String> windowids= driver.getWindowHandles();
	        for(String winid:windowids)
	        {
	        	System.out.println("The window id of clicked page is:"+winid);
	        	System.out.println(driver.getCurrentUrl());
	        	
	     }
	}
	}
