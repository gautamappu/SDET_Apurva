package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver(); //open the browser
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");// pass the url
		
         driver.findElement(By.name("userName")).sendKeys("mercury");
         driver.findElement(By.name("password")).sendKeys("mercury");
         driver.findElement(By.name("submit")).click();
         
       String act_title= driver.getTitle();
       String exp_title="Login: Mercury Tours";
       
       System.out.println(act_title);
       if(act_title.equals(exp_title))
       {
    	   System.out.println("Test is passed");
       }
       else
       {
    	   System.out.println("Test is failed");
       }
         
         driver.close(); //close the browser
	}

}
