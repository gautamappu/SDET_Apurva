package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_tables {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
// find no. of rows
//	int rows=	driver.findElements(By.tagName("tr")).size(); //single table 
//	System.out.println(rows);
	
int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	System.out.println(rows);
	
//	find no of columns
//	int columns= driver.findElements(By.tagName("th")).size(); //for single table
//	System.out.println(columns);
	
	int columns= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	System.out.println(columns);
	
	//show specificdata
    String print=	driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
	System.out.println(print);
	
	//read all data from rows and columns
	
	//System.out.println(BookName+ "    ");
//	for(int r=2;r<=rows;r++)
//	{
//		for(int c=1;c<=columns;c++)
//		{
//		String table=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//		System.out.print(table);
//		}
//		System.out.println("  " + "  " +"  ");
//	}
//	
	
	System.out.println("The books by Amit are ");
	for(int r=2;r<=rows;r++)
	{
		String val=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		if(val.equals("Amit"))
		{
		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
		System.out.println(value);
		}
	}
	//add all prices
	
	//System.out.println("The total price is:");
	int sum=0;
	for(int r=2;r<=rows;r++)
	{
	String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
	sum=sum+Integer.parseInt(price); //typecasting
	}
	System.out.println("Addition of all prices:" +sum); //actual value
	
	if(sum==7100)
	{
		System.out.println("Test is passed");
	}
	else
	{
		System.out.println("Test is failed");
	}
	
	
	}

}
