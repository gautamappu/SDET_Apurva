package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodingTask_4 {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set <String> windowids=driver.getWindowHandles();	

		for(String winid:windowids)
		{
	     String title= driver.switchTo().window(winid).getTitle();
		if(title.equals("Human Resources Management Software | OrangeHRM"))
		{
			driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
			System.out.println(	driver.getTitle());
		}
		else if(title.equals("OrangeHRM"))
		{
			driver.findElement(By.name("username")).sendKeys("12345");
		}
		    System.out.println(driver.getTitle());
		}

	}

}
