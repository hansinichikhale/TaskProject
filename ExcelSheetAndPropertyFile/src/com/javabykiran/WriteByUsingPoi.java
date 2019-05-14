package com.javabykiran;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteByUsingPoi {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet();
		sh.createRow(0).createCell(0).setCellValue("Result");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Public\\ExcelSheetAndPropertyFile\\writefile.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println("Sucessfully done");

	}

}
