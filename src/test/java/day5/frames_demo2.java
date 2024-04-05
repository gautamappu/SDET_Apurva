package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_demo2 {

	public static void main(String[] args) {
	
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.switchTo().frame("frm2");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Apurva");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Gautam");
		driver.findElement(By.xpath("//input[@id='femalerb']")).click();
		
		List<WebElement> items= driver.findElements(By.className("bcCheckBox"));
		for(int i=0;i<2;i++)
			items.get(i).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("apurvag121@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");
		driver.findElement(By.id("registerbtn")).click();
	}

}
