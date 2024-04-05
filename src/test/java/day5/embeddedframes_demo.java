package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class embeddedframes_demo {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
	
		//frame1
		WebElement li=	driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(li);
		driver.findElement(By.name("mytext1")).sendKeys("Welcome");
		
		//frame3
		driver.switchTo().defaultContent();
		WebElement li1=	driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(li1);
		driver.findElement(By.name("mytext3")).sendKeys("hello");

		driver.switchTo().frame(0); //index
		
		driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
		
		//frame-5
		driver.switchTo().defaultContent();
		WebElement f5= driver.findElement(By.xpath("/html/frameset/frame[2]"));
		driver.switchTo().frame(f5);
		driver.findElement(By.name("mytext5")).sendKeys("1234");
	}

}
