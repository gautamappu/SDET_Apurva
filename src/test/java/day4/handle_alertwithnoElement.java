package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_alertwithnoElement {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String message=driver.findElement(By.cssSelector("div[class='example'] p")).getText();
		
		if(message.contains("Congratulations"))
			System.out.println("test passed");
		else
			System.out.println("test failed");
		
		driver.close();

	}

}
