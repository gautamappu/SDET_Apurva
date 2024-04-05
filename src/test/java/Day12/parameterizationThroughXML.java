package Day12;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;

//parallel testing/ cross browser testing

public class parameterizationThroughXML {
	
	WebDriver driver;
  @BeforeClass
  @Parameters({"browser","url"})
   void setup(String br, String appURL) throws InterruptedException {
	  
	  if(br.equals("edge")) {
		  driver=new EdgeDriver();
	  }
	  else
	  {
	  
	  driver= new ChromeDriver();
	  }
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	  driver.get(appURL);
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
  }
  @Test(priority=2)
  void testLogo() {
	  try {
	  boolean logo= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  Assert.assertEquals(logo,true);
	  }
	  catch(Exception e)
	  {
		 Assert.fail(); 
	  }
  }
  @Test(priority=3)
  void testLogin() {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
 
       String exp="OrangeHRM";
       String act=driver.getTitle();
       
       Assert.assertEquals(exp,act);
  }
  
  @Test(priority=1)
  void testHomePageTitle()
  {
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM" ,"Titles are not matached...");
  }
  @AfterClass
  void tearUp() {
	  driver.close();
  }
}
