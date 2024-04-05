package day5;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task_2_datePicker {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		WebElement dd= driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		
		Select drp= new Select(dd);
		drp.selectByValue("5");
		
		WebElement dd1= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]"));
		

		Select drp2= new Select(dd1);
		drp2.selectByValue("1998");
		
		String date="6";
		
		List<WebElement> alldates=	driver.findElements(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//td"));
		for(WebElement dates: alldates)
			{
				if(dates.getText().equals(date))
				{
					dates.click();
					break;
				}
			}
		
	}

}
