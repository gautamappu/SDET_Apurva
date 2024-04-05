package day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		//approach-1
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("06/06/2024");
//		
	
		//approach-2
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[normalize-space()='Date:']")).click();
		String year="2022";
		String month="May";
		String date="20";
		
		//selecting month and years
		
		while(true)
		{
		String yr=	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
		String mnth=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
		
		
		if(year.equals(yr) && month.equals(mnth))
		{
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//past
		//driver.findElement(By.xpath("//span[@class=ui-icon ui-icon-circle-triangle-e']")).click();//future
		}
		
		//date
//		
//	List<WebElement> alldates=	driver.findElements(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//td"));
//	
//	for(WebElement dates: alldates)
//	{
//		if(dates.getText().equals(date))
//		{
//			dates.click();
//			break;
//		}
//	}
	
//	for(int i=0;i<alldates.size();i++)
//	{
//		if(alldates.get(i).getText().equals(date))
//		{
//			alldates.get(i).click();
//			break;
//		}
	}
		
	}


