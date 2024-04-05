package day8;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class interactwithElementsJS {

	public static void main(String[] args) {
		
		//ChromeDriver driver= new ChromeDriver();  //object of chrome class
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");

		JavascriptExecutor js=(JavascriptExecutor) driver;
		
	WebElement inputbox= driver.findElement(By.id("name"));
	js.executeScript("arguments[0].setAttribute('value','John')", inputbox); //javascript
	
	WebElement inputbox1= driver.findElement(By.id("email"));
	js.executeScript("arguments[0].setAttribute('value','abc@gmail.com')", inputbox1);

	WebElement inputbox2= driver.findElement(By.id("phone"));
	js.executeScript("arguments[0].setAttribute('value','9876543210')", inputbox2);
	
	//radio button click
	WebElement female=driver.findElement(By.id("female"));
	js.executeScript("arguments[0].click()", female);
	
	//checkboxes
	WebElement days= driver.findElement(By.id("saturday"));
	js.executeScript("arguments[0].click()", days);
	
	//button
	//WebElement button= driver.findElement(By.xpath("//input[@id='FSsubmit']"));
	//js.executeScript("arguments[0].click()", button);
	
	//dropdown
	WebElement dd= driver.findElement(By.xpath("//*[@id=\"country\"]"));
	js.executeScript("arguments[0].click()", dd);
	
	String optionValue = "usa";
	String script="argumentts[0].value=''"+optionValue+ "';";
	
	((JavascriptExecutor) driver).executeScript(script,dd);
	
	String SelectedOption= (String) js.executeScript("return arguments[0].value", dd);
	System.out.println("selected option:"+SelectedOption);
	
	
	
	}

}
