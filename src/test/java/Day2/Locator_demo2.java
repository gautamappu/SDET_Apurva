package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locator_demo2 {

	public static void main(String[] args) {
	 
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		
		// total number of sliders on the page
	List <WebElement> sliders =driver.findElements(By.className("homeslider-container"));
   System.out.println("The slide contains total images: "+ sliders.size());
	 
   //total no of images on the page---tag
   List<WebElement> image= driver.findElements(By.tagName("img"));
    System.out.println("the total images on the page is:" +image.size());
    
    List<WebElement> links=driver.findElements(By.tagName("a"));
    System.out.println("the total links on the page is:" +links.size());
    
	}

}
