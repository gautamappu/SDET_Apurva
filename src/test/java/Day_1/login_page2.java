package Day_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class login_page2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver1= new ChromeDriver();
		
		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver1.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver1.findElement(By.name("password")).sendKeys("admin1234");
		Thread.sleep(3000);
		driver1.findElement(By.className("oxd-button")).click();
		
		String act_title= driver1.getTitle();
		String ex_title="OrangeHRM";
		
		if(act_title.equals(ex_title))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		driver1.close();

	}

}
