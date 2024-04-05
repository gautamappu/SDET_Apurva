package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handle_dropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

		WebElement dd= driver.findElement(By.xpath("//select[@id='country-list']"));
		
		Select drp= new Select(dd);//drop down
		//selecting an option from drop down
		
		drp.selectByVisibleText("India");
//		drp.selectByValue("4");
		//drp.selectByIndex(4);
		
		Thread.sleep(4000);
		WebElement dd1= driver.findElement(By.xpath("//select[@id='state-list']"));
		Select drp2= new Select(dd1);
		
		 //drp2.selectByVisibleText("Delhi");
		drp2.selectByValue("23");
		drp2.selectByIndex(4);
		
		//total no of options in drop down
		
//		List<WebElement> options=drp.getOptions();
//		System.out.println(options.size());
		
		//print the options on console
		
//		for(int i=0;i<options.size();i++)
//		{
//		System.out.println(	options.get(i).getText());
//		}
//		
		
//		for(WebElement op:options)
//			System.out.println( op.getText());
		
//		List<WebElement> options1=drp2.getOptions();
//		System.out.println(options1.size());
//		
//		for(WebElement op1:options1)
//			System.out.println(op1.getText());
		Thread.sleep(5000);
	    driver.close();
	}

}
