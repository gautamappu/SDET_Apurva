package day9;

import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class headlessTestingDemo {

	public static void main(String[] args) throws InterruptedException {
		
//		//approch-1 simple approach
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--headless=new");
		WebDriver driver= new ChromeDriver(option); //open the browser
		
//		//approch-2  complicated
//		ChromeOptions option= new ChromeOptions();
//		option.addArguments("--headless=new");
//		WebDriver driver= WebDriverManager.chromedriver().capabilities(option).create();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
