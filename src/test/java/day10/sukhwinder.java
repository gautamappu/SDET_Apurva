package day10;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class sukhwinder {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		String file= System.getProperty(("user.dir")+"\\ExcelFiles\\cellsdata.xlsx");  // path of excel sheet
		
		int rows=ExcelUtils.getRowCount(file, "Sheet1"); //get no. of rows from excel sheet
		
	// read data from excel	
		for (int i=1; i<rows; i++)
		{
			String pi = ExcelUtils.getCellData(file, "Sheet1", i, 0);
			String roi = ExcelUtils.getCellData(file, "Sheet1", i, 1);
			String period1 = ExcelUtils.getCellData(file, "Sheet1", i, 2); //textbox
			String period2 = ExcelUtils.getCellData(file, "Sheet1", i, 3);  //dropdown
			String freq = ExcelUtils.getCellData(file, "Sheet1", i, 4);
			//String mvalue = ExcelUtils.getCellData(file, "Sheet1", i, 5);
			String exp_mvalue =  ExcelUtils.getCellData(file, "Sheet1", i, 5);	//compare		
		
		
	//pass the data in the application
		driver.findElement(By.xpath("//*[@id=\"principal\"]")).sendKeys("pi");
		driver.findElement(By.xpath("//*[@id=\"interest\"]")).sendKeys("roi");
		driver.findElement(By.xpath("//*[@id=\"tenure\"]")).sendKeys("period1");
		Select perdrp= new Select(driver.findElement(By.xpath("//*[@id=\"tenurePeriod\"]")));
		perdrp.selectByVisibleText(period2);
		
		Select fredrp= new Select(driver.findElement(By.xpath("//*[@id=\"frequency\"]")));
		fredrp.selectByVisibleText(freq);
	
		
	//clicking on calculate button
		JavascriptExecutor js = driver;
		WebElement calculate_btn= driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img"));
		js.executeScript("arguments[0].click()", calculate_btn);
		
		String act_mvalue= driver.findElement(By.xpath("//*[@id=\resp_matval\"]/strong")).getText();
		
		if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
		{
			System.out.println("Test Passed");  //printing on console
			
			ExcelUtils.getCellData(file, "Sheet1", i, 7);
			
		}
		
		else
		{
			System.out.println("Test Failed");
			ExcelUtils.setCellData(file, "Sheet1", i, 7, "failed");
			ExcelUtils.fillRedColor(file, "Sheet1", i, 7);			
		}
		Thread.sleep(5000);
		
  //clicking on clear button
		WebElement clear_btn= driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]"));
		js.executeScript("arguments[0].click();",clear_btn);
		
	}
}
}
