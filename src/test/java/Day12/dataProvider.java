package Day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;


public class dataProvider {
	ChromeDriver driver;
  @BeforeClass
  public void setup() {
	  
	 driver =new ChromeDriver();
  }
  @Test(dataProvider="dp")
  void Testlogin(String email, String pass) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
      driver.findElement(By.id("Email")).sendKeys(email);
      driver.findElement(By.id("Password")).sendKeys(pass);
      driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
 
  String exp="nopCommerce demo store";
  String act= driver.getTitle();
  
  Assert.assertEquals(exp, act);
  
  }
  
 
  @AfterClass
  void tearUp() {
	  driver.close();
	  
  }
  
  @DataProvider(name="dp")
  
 String[][] loginData()
  {
	  String[][] data= {{"abc@gmail.com","test"},
			  {"xyz12@gmail.com","123456"},
			  {"mk@gmail.com","test123" }
	  };
	  
	  return data;
  }
}
