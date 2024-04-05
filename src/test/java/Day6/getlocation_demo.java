package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation_demo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(7000);
	WebElement logo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
	System.out.println("the value before maximize"+	logo.getLocation());
	driver.manage().window().maximize();
	
	System.out.println("the value after maximize"+	logo.getLocation());

	driver.manage().window().minimize();
	System.out.println("the value after minimize"+	logo.getLocation());
	
	driver.manage().window().fullscreen();
	System.out.println("the value after full screen"+	logo.getLocation());
	
	Point p= new Point(77,35);
	driver.manage().window().setPosition(p);
	System.out.println("the value  of element after setting the position of webpage"+	logo.getLocation());
	
	p=new Point(100,200);
	driver.manage().window().setPosition(p);
	System.out.println("the value  of element after setting the position of webpage"+	logo.getLocation());
	
	}

}
