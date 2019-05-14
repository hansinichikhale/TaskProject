package com.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
public ExcelSheetConfig(String excelpath) {
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			 wb=new XSSFWorkbook(fis);
			 
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 

}
	public String getdata(int sheetNumber,int row,int col) {
		sheet1=wb.getSheetAt(sheetNumber);
		String data=sheet1.getRow(row).getCell(col).getStringCellValue();
		return data;
}
}