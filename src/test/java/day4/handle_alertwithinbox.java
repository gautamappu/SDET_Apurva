package day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_alertwithinbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("I am a pop up window");
//		alert.accept();
		
	//String text=	driver.findElement(By.id("result")).getText();
//		if(text.equals("You entered: I am a pop up window"))
//			System.out.println("test passed");
//		else
//			System.out.println("test failed");
		
		alert.dismiss();
		String text=	driver.findElement(By.id("result")).getText();
		if(text.equals("You entered: null"))
			System.out.println("test passed");
		else
			System.out.println("test failed");
		
		
		
	}

}
