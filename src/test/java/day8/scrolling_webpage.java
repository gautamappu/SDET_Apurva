package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling_webpage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.opencart.com/");

		JavascriptExecutor js=driver;
		
		//scrollpage by pixel
//		
		js.executeScript("window.scrollBy(0,300)","" );
System.out.println(js.executeScript("return window.pageYOffset;",""));

//scrolldown to specific element
//		WebElement India= driver.findElement(By.xpath("//img[@alt='Flag of India']"));
//js.executeScript("arguments[0].scrollIntoView();",India );
	
//scrolldown to end page

//js.executeScript("window.scrollBy(0,document.body.scrollHeight", "");
//System.out.println(js.executeScript("return window.pageYOffset;",""));
//
//	//scrolll upwards
//js.executeScript("window.scrollBy(0,-document.body.scrollHeight", "");
	}

}
