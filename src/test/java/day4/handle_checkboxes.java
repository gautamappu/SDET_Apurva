package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_checkboxes {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//select the single checkbox
		
		//driver.findElement(By.id("monday")).click();
		
		//count the no. of operations
//		
//		List<WebElement> items= driver.findElements(By.xpath("//*[@class=\"form-check-input\"][@type=\"checkbox\"]"));
//	    System.out.println("The no. of checkboxes are:"+items.size());
	    
	    //select all the check boxes
//	    
//	    for(int i=0;i<=items.size();i++)
//	    {
//	    	items.get(i).click();
//	    }
	    
//	    for(WebElement chk:items)
//	    {
//	    	chk.click();
//	    }
	    
	    //select last two
	    
//	    for(int i=5;i<items.size();i++)
//	    {
//	    	items.get(i).click();
//	    }
	    
	    //select first two
//	    for(int i=0;i<2;i++)
//	    {
//	    	items.get(i).click();
//	    }
	    
	    //unchecked, clear checkboxes
	    
//	    for(int i=0;i<=items.size();i++)
//	    {
//	    	items.get(i).click();
//	    }
//	    Thread.sleep(3000);
//	    
//	    for(int i=0;i<=items.size();i++)
//	    {
//	    	items.get(i).click();
//	    }
	    
	    //unselect first 3
//	    for(int i=0;i<=items.size();i++)
//	    {
//	    	items.get(i).click();
//	    }
//	    
//	    Thread.sleep(4000);
//	    for(int i=0;i<2;i++)
//	    {
//	    	items.get(i).click();
//	    }
//	    //requirement is only to unselect if the check boxes is selected
//	    for(int i=0;i<2;i++)
//	    {
//	    	items.get(i).click();
//	    }
//	    
//	    Thread.sleep(3000);
//	    
//	    for(int i=0;i<items.size();i++) {
//	    	if(items.get(i).isSelected())
//	    	{
//	    		items.get(i).click();
//	    	}
		
		driver.findElement(By.id("female")).click();
	    }
	 
	}


