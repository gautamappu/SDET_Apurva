package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_demo5 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		
		//absolute x-path
//		
//	String text=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/h2/a")).getText();
//		System.out.println(text);
		
		//relative
		
	String text=	driver.findElement(By.xpath("//a[normalize-space()='Apple MacBook Pro 13-inch']")).getText();
	System.out.println(text);
//	
//	String text=driver.findElement(By.xpath("//*[@xpath=\"1\"]")).getText();
//	System.out.println(text);
	
	driver.close();
	}

}
