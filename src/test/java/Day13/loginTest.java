package Day13;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class loginTest {
	
	WebDriver driver;
	//loginPage lp;
	loginpage2 lp;
	
	@BeforeClass
	void setUp() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(9000);
	}
	
	@Test(priority=2)
	void testLogin()
	{
		lp.setUserName("Admin");
		lp.setPasswordName("admin123");
		lp.ClickButton();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority=1)
	void logo_Check()
	{
		//lp=new loginPage(driver);
		lp=new loginpage2(driver);
		Assert.assertEquals(lp.checkLogo(),true);
	}
	
	@AfterClass
	void TearDown()
	{
		driver.close();
	}
	

}
