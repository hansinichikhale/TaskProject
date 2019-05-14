package com.javabykiran;

import com.lib.ExcelSheetConfig;

public class ReadExcelFromLib {

	public static void main(String[] args) {
		ExcelSheetConfig excel=new ExcelSheetConfig("C:\\Users\\Public\\ExcelSheetAndPropertyFile\\src\\com\\TestData\\HalfEbayTestData.xlsx");
System.out.println(excel.getdata(0, 3, 1));
	}

}
