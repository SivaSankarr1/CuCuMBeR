package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GettingNumericValueFromSheet {
public static void main(String[] args) throws IOException {
//Program to get Numeric Value from sheet		
File file = new File("C:\\Users\\$AM$ANKAR\\Pictures\\Screenshots\\data1.xlsx");
FileInputStream input = new FileInputStream(file);	
Workbook book = new XSSFWorkbook(input);
Sheet sheet1 = book.getSheet("Sheet1");
for(int i=0;i<sheet1.getPhysicalNumberOfRows();i++) {
Row row = sheet1.getRow(i);
for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
Cell cell = row.getCell(j);
//To find cell type
CellType cellType = cell.getCellType();
switch(cellType) {
case STRING:
	String stringCellValue = cell.getStringCellValue();
	System.out.print(stringCellValue+"\t");
break;

case NUMERIC:
	double numericCellValue = cell.getNumericCellValue();
	int x = (int)numericCellValue;
	BigDecimal big = BigDecimal.valueOf(x);
	String stringbig = big.toString();
	System.out.println(stringbig+"\t");
}
}
	System.out.println();
}
}
}