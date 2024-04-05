package day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handle_alert {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

		//alert 
		//wait.until(ExpectedConditions.alertIsPresent());
		Alert alert= driver.switchTo().alert();// driver moves to popup
		
		//accept()---click OK
		//dismiss()---click cancel
		//getText()=get the text pop up
		
//		alert.accept();
//		String text=driver.findElement(By.id("result")).getText();
//	    if(text.equals("You clicked: Ok"))
//	    	System.out.println("Test passed");
//	    else
//	    	System.out.println("test failed");
//	
		
		alert.dismiss();
		
		String text=driver.findElement(By.id("result")).getText();
    if(text.equals("You clicked: Cancel"))
	System.out.println("Test passed");
	    else
	    	System.out.println("test failed");
		
	}
	

}
