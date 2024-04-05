package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frame_demo1 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
//		
 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("hello frames");
////		//Approach-1------using id
//		driver.switchTo().frame("frm1");
		
		//approach-2----using web element
		WebElement frame1=driver.findElement(By.xpath("//*[@id=\"frm1\"]"));
		driver.switchTo().frame(frame1);
		
		WebElement drp= driver.findElement(By.xpath("//select[@id='course']"));
		
		Select drpdwn= new Select(drp);

		drpdwn.selectByVisibleText("Java");
		
		
	}

}
