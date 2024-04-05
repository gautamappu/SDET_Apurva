package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodingTask_1 {

	public static void main(String[] args) {
		 ChromeDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		 
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 String login= driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']")).getText();
			if(login.contains("Dashboard"))
			{
				System.out.println("Test Passed");
			}
			else
				System.out.println("Test failed");
	}

}
