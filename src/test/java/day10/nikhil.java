package day10;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nikhil {
	public static void main(String[] args) throws IOException {

	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
	String file=System.getProperty("user.dir")+"\\ExcelFile\\CitBankData.xlsx";
	int rows=ExcelUtils.getRowCount(file, "Sheet1");
	
	driver.findElement(By.id("mat-input-0")).clear();
	driver.findElement(By.id("mat-input-1")).clear();
	driver.findElement(By.id("mat-input-2")).clear();
	
	for(int i=1;i<=rows;i++) {
	String ida=ExcelUtils.getCellData(file,"Sheet1",i,0);
	String l=ExcelUtils.getCellData(file,"Sheet1",i,1);
	String intrst=ExcelUtils.getCellData(file,"Sheet1",i,2);
	String com=ExcelUtils.getCellData(file,"Sheet1",i,3);
	
	String mv=ExcelUtils.getCellData(file,"Sheet1",i,4);
	
	driver.findElement(By.id("mat-input-0")).sendKeys(ida);
	driver.findElement(By.id("mat-input-1")).sendKeys(l);
	driver.findElement(By.id("mat-input-2")).sendKeys(intrst);
	driver.findElement(By.xpath("//*[@id=\"mat-select-0\"]/div/div[2]")).click();
	List<WebElement> drp=driver.findElements(By.xpath("//*[@id=\"mat-select-0-panel\"]//span"));
         //System.out.println(drp.size());
	
	for(int d=0;d<drp.size();d++) {
		
		//System.out.println(drp.get(d).getText());
	
		if(drp.get(d).getText().equals(com)) {
		
			drp.get(d).click();
			break;
		}
		}
	
	driver.findElement(By.xpath("//*[@id=\"CIT-chart-submit\"]//div[@class=\"mdc-button__ripple\"]")).click();
	String act_v=driver.findElement(By.xpath("//*[@id=\"displayTotalValue\"]")).getText();
	if(mv.equals(act_v)) {
		System.out.println("Test Passed");
		ExcelUtils.setCellData(file, "Sheet",i,6,"Passed");
		ExcelUtils.fillGreenColor(file, "Sheet1",i,6);
	}else {
		ExcelUtils.setCellData(file, "Sheet1",i,6,"Failed");
		ExcelUtils.fillRedColor(file, "Sheet1",i,6);
	}
	
	driver.findElement(By.id("mat-input-0")).clear();
	driver.findElement(By.id("mat-input-1")).clear();
	driver.findElement(By.id("mat-input-2")).clear();
	}
	}
}

