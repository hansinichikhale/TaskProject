package com.javabykiran;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadByUsingPoi {

	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Users\\Pavan\\Desktop\\Excel.xlsx");
	FileInputStream fis=new FileInputStream(src);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sheet1=wb.getSheetAt(0);
String Data0=sheet1.getRow(0).getCell(0).getStringCellValue();
System.out.println("Data From Excel is"+Data0);

	}

}
