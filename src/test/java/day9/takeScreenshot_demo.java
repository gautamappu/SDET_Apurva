package day9;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenshot_demo {

	public static void main(String[] args) throws IOException {
		
		//ChromeDriver driver= new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.nopcommerce.com/");
		
		//taking full page screenshot
		TakesScreenshot ts= (TakesScreenshot) driver;
//		
//	File src=ts.getScreenshotAs(OutputType.FILE);
//
//	File trg =new File("C:\\Users\\91701\\eclipse-workspace\\Selenium_Maven\\Screenshot\\fullpage.png");
//	
//	FileUtils.copyFile(src, trg);
		
		//capture screenshot for specific area
		
//	WebElement featureproduct=	driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//	File src=featureproduct.getScreenshotAs(OutputType.FILE);
//	File trg =new File("C:\\Users\\91701\\eclipse-workspace\\Selenium_Maven\\Screenshot\\featureproduct.png");
//     FileUtils.copyFile(src, trg);
     
     //capture elements for specific element
    WebElement logo= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
     File src= logo.getScreenshotAs(OutputType.FILE);
     File trg =new File("C:\\Users\\91701\\eclipse-workspace\\Selenium_Maven\\Screenshot\\LOGO.png");
     FileUtils.copyFile(src, trg);
     driver.close();
	
	}

}
