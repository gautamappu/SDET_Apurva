package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement account1 =driver.findElement(By.xpath("//*[@id=\"credit2\"]"));
        WebElement acc= driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
        
        WebElement amount =driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
        WebElement acc1= driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
        
        
        WebElement acount2 =driver.findElement(By.xpath("//*[@id=\"credit1\"]"));
        WebElement acc3= driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
        
        WebElement amount1 =driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
        WebElement acc4= driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
        
        Actions act= new Actions(driver);
        
        act.dragAndDrop(account1, acc).build().perform();
        act.dragAndDrop(amount, acc1).build().perform();
        act.dragAndDrop(acount2, acc3).build().perform();
        act.dragAndDrop(amount1, acc4).build().perform();
	}

}
