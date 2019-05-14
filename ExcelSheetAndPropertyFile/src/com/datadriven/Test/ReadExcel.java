package com.datadriven.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Excel.utility.Read_XLS;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan\\Downloads\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
//		
//	
		File src=new File("C:\\Users\\Public\\ExcelSheetAndPropertyFile\\src\\com\\TestData\\HalfEbayTestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		
		//for xlsx file
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//for xls file
		//HSSFWorkbook wb=new HSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
//		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
//		System.out.println("Data from ExcelSheet="+data0);
		
		int rowcount=sheet1.getLastRowNum();
		System.out.println("Total no of Rows="+rowcount);
		
		
		for(int i=0;i<rowcount;i++) {
			String Data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from excel="+i+" is "+Data0);
		
	}
		
	}

}
