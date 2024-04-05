package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_action_demo2 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		driver.findElement(By.xpath("//input[@id='target']"));
		
		Actions act= new Actions(driver);
	   	act.sendKeys(Keys.ENTER).perform();
		
		String text= driver.findElement(By.id("result")).getText();
		if(text.equals("You entered: Enter"))
			System.out.println("test passed");
		else
			System.out.println("test failed");
	}

}
