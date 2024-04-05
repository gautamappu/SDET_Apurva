package Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_demo {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Apurva");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Gautam");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gautamapurva33@gmail.com");
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("BTES");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@id='register-button']")).click();
		
		driver.close();
		

	}

}
