package com.javabykiran;

import java.io.File;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws Throwable  {
		
	  File fil=new File("C:\\Users\\Pavan\\Desktop\\Book1.xls") ;
	  WritableWorkbook wb=Workbook.createWorkbook(fil);
	  WritableSheet sh=wb.getSheet("sheet1");
	  Label lb=new Label(0,0,"Result");
	  sh.addCell(lb);
	  sh.addCell(new Label(1,0,"Fail"));
	  Number num=new Number(0,1, 0);
	  sh.addCell(num);
	  sh.addCell(new Number(0, 0, 0));
	  wb.write();
	  System.out.println("done");
	  wb.close();


	}
}
