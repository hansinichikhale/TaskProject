package com.javabykiran;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelSheet {

	public static void main(String[] args) throws JXLException, Throwable {
File file=new File("h:\\login.xls");
Workbook wk=Workbook.getWorkbook(file);
Sheet sh=wk.getSheet(0);
int cols =sh.getColumns();
System.out.println("No of coloumns="+cols);
int row=sh.getRows();
System.out.println("No of rows="+row);
for(int i = 0;i<row-1;i++) {
for(int j = 0;j<cols;j++) {
	System.out.println("i" +i);
	System.out.println("j" +j);
	Cell cell=sh.getCell(0, 0);
	System.out.println(cell.getContents());

	}
}
}
}