package Day_3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_methods {

	public static void main(String[] args) throws MalformedURLException {
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.navigate().to("https://www.amazon.in/");
		
		URL url =new URL("https://www.amazon.in/");
		driver.navigate().to(url);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
	}

}
