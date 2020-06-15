package com.qa.testUtil;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelData {
	
	public static XSSFWorkbook wb;
	
//	public readExcelData(String excelPath) {
	
	public static void excelDataConfig(String excelPath, String sheetName) {
			
			try {
				File src = new File(excelPath);
				FileInputStream fis = new FileInputStream(src);
				wb = new XSSFWorkbook(fis);
			} catch (Exception e) {
				System.out.println("Failed to load workbook due to " + e);
			}
		}
	
	public static int getRowCount(String sheetName) {
		int row = wb.getSheet(sheetName).getLastRowNum();
		row = row+1;
		System.out.println("Row count is " + row);
		return row;
	}
	
	public static int getColumnCount(String sheetName) {
		System.out.println("Start");
		int column = wb.getSheet(sheetName).getRow(0).getLastCellNum();
		System.out.println("Column count is " + column);
		return column;
	}
		
		public static String getStringData(int row, int column, String sheetName) {
//			sheet1 = wb.getSheet(sheetName);
			System.out.println("StringData");
			String string = wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
			return string;	
		}
		
		public static double getIntegerData(int row, int column, String sheetName) { 
			double num = wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
			return num;	
		}

}
