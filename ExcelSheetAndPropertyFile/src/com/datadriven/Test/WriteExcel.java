package com.datadriven.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Excel.utility.Read_XLS;

public class WriteExcel {

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
		
		sheet1.getRow(0).createCell(4).setCellValue("pass");
		sheet1.getRow(1).createCell(4).setCellValue("pass");
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
	}

}
