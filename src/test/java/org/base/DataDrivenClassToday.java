package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class DataDrivenClassToday {
public static void main(String[] args) throws IOException {

	//To locate File	
	File file = new File("C:\\Users\\$AM$ANKAR\\Pictures\\Screenshots\\Class Notes\\20.12.2022\\dummydata.xlsx");	
//To get all data in workbook
	FileInputStream inputstream = new FileInputStream(file);	
	Workbook book = new XSSFWorkbook(inputstream);
	Sheet sheet = book.getSheet("Sheet1");
	
	Row row=sheet.getRow(3);
	
	Cell cell=row.getCell(1);
	String stringCellValue = cell.getStringCellValue();
	System.out.println(stringCellValue);

}

}
