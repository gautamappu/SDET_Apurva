package practice;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handling_tables {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/");
		
		WebElement dd= driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select drp =new Select(dd);
		
		drp.selectByValue("Portland");
		
		
		WebElement dd1= driver.findElement(By.xpath("//select[@name='toPort']"));
		Select drp1= new Select(dd1);
		drp1.selectByValue("London");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//no. of rows
		int rows= driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("No.of rows are: "+rows);
		
		//no. of columns
		int columns= driver.findElements(By.tagName("th")).size();
		System.out.println("No. of columns are: "+columns);
		
		//locating the price column
		
		String PriceArray[]= new String[rows];
		for(int r=1;r<=rows;r++)
		{
			String prices= driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			//System.out.println(prices);
		  PriceArray[r-1]=prices;  //adding price to array
		}
		
		//sorting
		for(String arrvalue:PriceArray)
		{
			System.out.println(arrvalue);
		}
		
		Arrays.sort(PriceArray);
		String lp=PriceArray[0];
		System.out.println("the lowest price:" +lp);
		
		//finding smallest number from column
		for(int r=1;r<=rows;r++)
		{
			String prices= driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
		
			if(prices.equals(lp))
			{
				driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
			       break;
			}
		}
		
		//filling the data
		
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Apurva Gautam");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("123 street");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chicago");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("New York");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("187644");
		
	WebElement dd2=	driver.findElement(By.xpath("//*[@id=\"cardType\"]"));
		
		Select drp2 =new Select(dd2);
		drp2.selectByValue("visa");
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("1234 5678 9876 1231");
		driver.findElement(By.id("creditCardYear")).clear();
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2026");
		
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

		
		//validation
		
		String msg= driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
		if(msg.contains("Thank you for your purchase today!"))
		{
			System.out.println("Test Passed");
		}
		else
			System.out.println("Test failed");
	}

}
