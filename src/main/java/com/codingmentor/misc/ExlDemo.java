package com.codingmentor.misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExlDemo {

	public static void main(String[] args) throws IOException {

		
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Rasheed\\Desktop\\basheer\\MyExcelData.xlsx"));
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("mysheet");
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);		
		System.out.println(cell.getStringCellValue());
		
		cell=row.getCell(1);
		System.out.println(cell.getStringCellValue());
		
		row=sheet.getRow(1);
		
		cell = row.getCell(0);		
		System.out.println(cell.getStringCellValue());
		
		cell=row.getCell(1);
		System.out.println(cell.getStringCellValue());
		
		row=sheet.getRow(2);
		
		cell = row.getCell(0);		
		System.out.println(cell.getStringCellValue());
		
		cell=row.getCell(1);
		System.out.println(cell.getStringCellValue());
		
		workbook.close();
		

	}

}
