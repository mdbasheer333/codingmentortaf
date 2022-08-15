package com.codingmentor.misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExlDemo2 {

	public String[][] getDataFromExcelSheet() throws IOException {

		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Rasheed\\Desktop\\basheer\\MyExcelData.xlsx"));
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("mysheet");
		
		String eXlData[][]=new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			XSSFRow row=sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				XSSFCell cell= row.getCell(j);
				eXlData[i-1][j]=cell.getStringCellValue();
			}	
		}
		
		workbook.close();
		return eXlData;

	}

}
