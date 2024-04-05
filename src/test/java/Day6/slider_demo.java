package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider_demo {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
       //minimum slider element
//	WebElement e1=	driver.findElement(By.xpath("//*[@id=\"slider-range\"]/div"));
//    System.out.println("location of element after slider"+e1.getLocation());
//	
//       Actions act= new Actions(driver);
//       act.dragAndDropBy(e1, 100, 0).perform();
//       System.out.println("location of element after slider"+e1.getLocation());
	
       //max slider element
		
		WebElement e1=	driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
	    System.out.println("location of element after slider"+e1.getLocation());
		
	       Actions act= new Actions(driver);
	       act.dragAndDropBy(e1,-50, 0).perform();
	       System.out.println("location of element after slider"+e1.getLocation());
	
	}

}
