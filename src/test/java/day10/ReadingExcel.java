package day10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//reading data-- fileInputStream
//Excel File--->workbook--->sheets--->rows--->cells 
public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\ExcelFiles\\data.xlsx");
	    
		XSSFWorkbook workbook= new XSSFWorkbook(file); //class from apache poi
	
		XSSFSheet sheet= workbook.getSheet("Sheet1"); //name, to access the workbook
	 
		//XSSFSheet sheet= workbook.getSheetAt(0);//index
		
	int rows=sheet.getLastRowNum();
	int col=sheet.getRow(1).getLastCellNum();
	
	System.out.println("The no. of rows are:" +rows);
	System.out.println("The no. of columns are:" +col);
	
	for(int r=0;r<=rows;r++)
	{
  XSSFRow CurrentRow=	sheet.getRow(r);
	
		for(int c=0;c<col;c++)
		{
	   XSSFCell cellValue=	CurrentRow.getCell(c);
	   cellValue.toString();
	   System.out.print(cellValue+ "               " );
		}
		
		System.out.println(); //formatting
	}
	
	workbook.close();
	file.close();
	}

}
