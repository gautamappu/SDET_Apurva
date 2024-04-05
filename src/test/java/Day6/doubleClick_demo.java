package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick_demo {

	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		WebElement f1=driver.findElement(By.id("field1"));
		f1.clear();
		f1.sendKeys("Apurva");
		
		WebElement button= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		Actions act= new Actions(driver);
		
		act.doubleClick(button).perform();
		
		Thread.sleep(4000);
		WebElement f2= driver.findElement(By.xpath("//*[@id=\"field2\"]"));
		
		//String text= f2.getText(); //return only innerText
		String text= f2.getAttribute("value"); //return value of mentioned attribute
		
		if(text.equals("Apurva"))
		{
			System.out.println("test is passed");
		}
		else
			System.out.println("test is failed");
	}

}
