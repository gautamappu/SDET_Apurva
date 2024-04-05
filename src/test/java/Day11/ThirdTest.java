package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdTest {
	
	ChromeDriver driver; //global variable
	
  @Test(priority=10)
  public void openApp() 
  {
	  driver=new ChromeDriver();//local variable
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     
  }
  @Test(priority=20)
  public void logIn() 
  {
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
  @Test(priority=30)
  public void closeApp() 
  {
	  driver.close();
  }
}
