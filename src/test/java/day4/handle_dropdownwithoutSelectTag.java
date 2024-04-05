package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_dropdownwithoutSelectTag {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
	
	List<WebElement> lists= driver.findElements(By.xpath("//*[@class=\"multiselect-container dropdown-menu\"]/child::*"));
	System.out.println("The total elements in drop down are: "+ lists.size());
	
	for(WebElement li:lists)
	{
		System.out.println(li.getText());
	}
	
//	for(int i=0;i<lists.size();i++)
//	{
//		System.out.println(lists.get(i).getText());
//	}
	
	//select option from drop down
//	for(int i=0;i<lists.size();i++)
//	{
//	if(	lists.get(i).getText().equals("Python"))
//	{
//		lists.get(i).click();
//	     break;
//	}
	//selecting multiple options:
//	for(int i=0;i<lists.size();i++)
//	{
//		String OptionName=lists.get(i).getText();
//		
//		if(OptionName.equals("Java")|| OptionName.equals("Python"))
//		{
//			lists.get(i).click();
//			
//		}
//	}
	
	for(WebElement op:lists)
	{
		String option=op.getText();
		if(option.equals("Java")|| option.equals("Python")) {
			op.click();
		}
	}
	
	
	}

}
