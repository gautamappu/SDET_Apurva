package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class part1 {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

		WebElement dd= driver.findElement(By.xpath("//select[@id='country-list']"));
		Select drp= new Select(dd);
		drp.selectByVisibleText("India");
	}

}
