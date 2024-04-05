package day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handle_alert1 {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
	driver.switchTo().alert().accept();
	
	String text=driver.findElement(By.id("result")).getText();
	if(text.equals("You successfully clicked an alert"))
		System.out.println("Test passed");
		else
			System.out.println("Test failed");
		
		}

}
