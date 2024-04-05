package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CodingTask_3 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		 
		
		Select drp= new Select(driver.findElement(By.xpath("//select[@id='country-list']")));
		drp.selectByVisibleText("China");
		System.out.println( drp.getFirstSelectedOption().getText());

			Thread.sleep(4000);
			Select drp2= new Select(driver.findElement(By.xpath("//select[@id='state-list']")));
			drp2.selectByVisibleText("Beijing");
		System.out.println( drp2.getFirstSelectedOption().getText());
             
	}

}
