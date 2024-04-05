package day10;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CD_Calculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		
	String file= System.getProperty("user.dir")+"\\ExcelFiles\\Book2.xlsx";
	
	int rows= ExcelUtils.getRowCount(file, "Sheet1");
	
	driver.findElement(By.id("mat-input-0")).clear();
	driver.findElement(By.id("mat-input-1")).clear();
	driver.findElement(By.id("mat-input-2")).clear();
	
	for(int i=1;i<=rows;i++)
	{
		String Dep=ExcelUtils.getCellData(file, "Sheet1", i, 0);
		String CD=ExcelUtils.getCellData(file, "Sheet1", i, 1);
		String IR=ExcelUtils.getCellData(file, "Sheet1", i, 2);
		String Comp=ExcelUtils.getCellData(file, "Sheet1", i, 3);
		String m_value=ExcelUtils.getCellData(file, "Sheet1", i, 4);
		
		driver.findElement(By.id("mat-input-0")).sendKeys(Dep);
		driver.findElement(By.id("mat-input-1")).sendKeys(CD);
		driver.findElement(By.id("mat-input-2")).sendKeys(IR);

		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c109-4']")).click();
		
		List <WebElement> lists=driver.findElements(By.xpath("//span[@class='mat-option-text'][normalize-space()='Compounded Monthly']"));
		for(int r=0;r<lists.size();r++)
		{
			if(lists.get(r).getText().equals(Comp))
			{
				
				lists.get(r).click();
				break;
			}
		}
		
		JavascriptExecutor js= driver;
	WebElement calculatebtn=driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']"));
		js.executeScript("arguments[0].click()", calculatebtn);
		

		
		
		
		String val= driver.findElement(By.xpath("//*[@id=\"displayTotalValue\"]")).getText();
		
		if(m_value.equals(val))
		{
			System.out.println("Test Passed");
			ExcelUtils.setCellData(file, "Sheet1", i, 6, "passed");
			ExcelUtils.fillGreenColor(file, "Sheet1", i, 6);
		}
		
		else
		{
			System.out.println("Test Failed");
			ExcelUtils.setCellData(file, "Sheet1", i, 6, "Failed");
			ExcelUtils.fillRedColor(file, "Sheet1", i, 6);
		}
		
		driver.findElement(By.id("mat-input-0")).clear();
		driver.findElement(By.id("mat-input-1")).clear();
		driver.findElement(By.id("mat-input-2")).clear();
		
	}
	
		

	}

}
