package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover_demo {

	public static void main(String[] args) {
	
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
//		WebElement Desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
//		
//		WebElement mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
//
//		Actions act= new Actions(driver);
//		
//		//mouse Hover---- move to element
//		act.moveToElement(Desktops).moveToElement(mac).click().build().perform();
	
	 WebElement laptop= driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
	
	 WebElement windows= driver.findElement((By.xpath("//a[normalize-space()='Windows (0)']")));
	
	 Actions act2= new Actions(driver);
	 
	 act2.moveToElement(laptop).moveToElement(windows).click().build().perform();
	}

}
