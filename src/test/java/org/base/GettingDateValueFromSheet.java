package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GettingDateValueFromSheet {
public static void main(String[] args) throws IOException {
//Program to Amend cell Value from sheet		
File file = new File("C:\\Users\\$AM$ANKAR\\Pictures\\Screenshots\\data1.xlsx");
FileInputStream input = new FileInputStream(file);	
Workbook book = new XSSFWorkbook(input);
Sheet sheet2 = book.getSheet("Sheet2");
for(int i=0;i<sheet2.getPhysicalNumberOfRows();i++) {
Row row = sheet2.getRow(i);
for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
Cell cell = row.getCell(j);
//To find cell type
CellType cellType = cell.getCellType();
switch(cellType) {
case STRING:
	String stringCellValue = cell.getStringCellValue();
	if(stringCellValue.equals("mobile")) {
		cell.setCellValue("Phone");
		FileOutputStream output = new FileOutputStream(file);
		book.write(output);
	}
	String stringCellValue2 = cell.getStringCellValue();
	System.out.print(stringCellValue2+ "\t");
	break;
case NUMERIC:
	if(DateUtil.isCellDateFormatted(cell)) {
		Date date = cell.getDateCellValue();
		SimpleDateFormat format = new SimpleDateFormat("dd/MMMM/yyyy");
		String format2 = format.format(date);
		System.out.print(format2+ "\t");
	}
	else {	
	double numericCellValue = cell.getNumericCellValue();
	int x = (int)numericCellValue;
	BigDecimal big = BigDecimal.valueOf(x);
	String stringbig = big.toString();
	System.out.print(stringbig+ "\t");
}
}
	System.out.println();
}
}
}
}