package com.crm.qa.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataConfig(String excelpath) throws IOException
	{
		File src= new File(excelpath);
		FileInputStream fis= new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
		
	}
	
	public String getData(int sheetNumber, int row, int col) throws Exception 
	{
		sheet1=wb.getSheetAt(sheetNumber);;
		String data=sheet1.getRow(row).getCell(col).getStringCellValue();
		return data;
		
	}
	
	public int getRowCount(int sheetIndex)
	{
		int row1=wb.getSheetAt(sheetIndex).getLastRowNum();
		row1=row1+1;
		
		return row1;
		
	}

}
