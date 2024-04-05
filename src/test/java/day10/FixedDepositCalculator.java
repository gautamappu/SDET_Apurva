package day10;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");

		String file= System.getProperty("user.dir") +"\\ExcelFiles\\Book1.xlsx"; //path of excel sheet
	
	  int rows= ExcelUtils.getRowCount(file, "Sheet1");
	  
	  //read the data from excel
	  
	  for(int i=1;i<=rows;i++)
	  {
	String princ= ExcelUtils.getCellData(file, "Sheet1", i, 0);
	String RateOfInterst= ExcelUtils.getCellData(file,"Sheet1", i, 1);
	String period1= ExcelUtils.getCellData(file,"Sheet1", i, 2);
	String period2= ExcelUtils.getCellData(file,"Sheet1", i, 3);
	String freq= ExcelUtils.getCellData(file,"Sheet1", i, 4);
	String exp_value= ExcelUtils.getCellData(file,"Sheet1", i, 5);
	
	 //pass the data to application
	
	driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
	driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(RateOfInterst);
	driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
 Select perdrp =new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
 perdrp.selectByVisibleText(period2);
 
Select fredrp =new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
fredrp.selectByVisibleText(freq);
	  
//driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
JavascriptExecutor js= driver;
WebElement calculate_btn= driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"));
js.executeScript("arguments[0].click()", calculate_btn);


String act_mval= driver.findElement(By.xpath("//*[@id=\"resp_matval\"]")).getText();

if(Double.parseDouble(exp_value)==Double.parseDouble(act_mval))
{
	System.out.println("Test passed");
	ExcelUtils.setCellData(file, "Sheet1", i, 7,"passed");
    ExcelUtils.fillGreenColor(file, "Sheet1", i, 7);
}
else
{
	System.out.println("Test failed");
	ExcelUtils.setCellData(file, "Sheet1", i, 7,"failed");
    ExcelUtils.fillRedColor(file, "Sheet1", i, 7);
    
}
//clicking on clear button
Thread.sleep(5000);


WebElement clr_btn=driver.findElement(By.xpath("//img[@class='PL5']"));
js.executeScript("arguments[0].click()", clr_btn);
	  }
	  
	 
	}

}
