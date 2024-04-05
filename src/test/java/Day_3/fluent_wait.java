package Day_3;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluent_wait {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	             FluentWait wait = new FluentWait(driver);
			      wait.withTimeout(Duration.ofSeconds(30));
			       wait.pollingEvery(Duration.ofSeconds(5));
			       wait.ignoring(NoSuchElementException.class);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.close();
	}

}
