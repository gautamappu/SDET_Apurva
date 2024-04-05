package day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Write data-- fileInputStream
//Excel File--->workbook--->sheets--->rows--->cells

public class WritingDataToExcel {

	public static void main(String[] args) throws IOException {
		 
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\ExcelFiles\\myfile.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		
		XSSFSheet sheet= workbook.createSheet("Sheet1");
		
		//without for loop
//		XSSFRow row1=sheet.createRow(0);
//		row1.createCell(0).setCellValue("Welcome");
//		row1.createCell(1).setCellValue("To");
//		row1.createCell(2).setCellValue("Automation");
//		
//		XSSFRow row2=sheet.createRow(1);
//		row2.createCell(0).setCellValue("John");
//		row2.createCell(1).setCellValue("Marry");
//		row2.createCell(2).setCellValue("Marsh");
		
		//with for loop
		
		Scanner sc= new Scanner(System.in);
		
		for(int r=0;r<3;r++)
		{
			XSSFRow currentRow= sheet.createRow(r);
			for(int c=0;c<2;c++)
			{
				//currentRow.createCell(c).setCellValue("Welcome");
			    System.out.println("enter the value of cell");
			    String data=sc.next();
			    currentRow.createCell(c).setCellValue(data);
			    
			
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Writing of data is finished");
		
	}

}
