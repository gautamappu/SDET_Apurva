package Day_3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_methods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("The title of the page is:" + driver.getTitle());
	 
        System.out.println("The url of the page is:" +driver.getCurrentUrl());
        
        System.out.println("The HTML code of page is" +driver.getPageSource());
        
        String windowid= driver.getWindowHandle();
        System.out.println("The window id is:" +windowid);
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set <String> windowids= driver.getWindowHandles();
        for(String winid:windowids)
        {
        	System.out.println("The window id of clicked page is:"+winid);
        }
	
	}

}
