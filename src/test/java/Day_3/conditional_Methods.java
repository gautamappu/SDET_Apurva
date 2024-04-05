package Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditional_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement Register= driver.findElement(By.xpath("//a[@class='ico-register']"));
		Register.click();
		
//		Boolean display= Register.isDisplayed();
//		System.out.println(display);
//		
		WebElement textbox1= driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement textbox2= driver.findElement(By.xpath("//input[@id='LastName']"));
		
		System.out.println(textbox1.isDisplayed());
		System.out.println("The textbox 1 is enababled:" +textbox1.isEnabled());
		System.out.println("The textbox 2 is enababled:" +textbox2.isEnabled());
		
		WebElement mradiobutton= driver.findElement(By.xpath("//label[@for='gender-female']"));
		System.out.println("The radio button is dispalyed:" +mradiobutton.isDisplayed());
		System.out.println("The radio button is enabled?: " +mradiobutton.isEnabled());
		mradiobutton.click();
		System.out.println("The radio button is selected:" +mradiobutton.isSelected());
		
	}

}
