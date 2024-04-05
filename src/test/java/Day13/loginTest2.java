package Day13;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class loginTest2 {

	WebDriver driver;
	
	loginpage_3 lp;
	
	@BeforeClass
	 void setup() {
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.guru99.com/test/newtours/");
	 }
	
	@Test(priority=2)
	void login() {
		lp.usernameSet("mercury");
		lp.passwordSet("mercury");
		lp.submit();
		
		Assert.assertEquals(driver.getTitle(), "Login: Mercury Tours");
	}
	@Test(priority=1)
	void chkLogo() {
		lp=new loginpage_3(driver);
		Assert.assertTrue(lp.checklogo());
	}
	
	@AfterClass
	void tearup() {
		driver.close();
	}
}
