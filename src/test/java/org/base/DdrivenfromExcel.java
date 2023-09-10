package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DdrivenfromExcel {
public static void main(String[] args) throws IOException {
File file = new File("C:\\Users\\$AM$ANKAR\\Pictures\\Screenshots\\data1.xlsx");
FileInputStream inputstream = new FileInputStream(file);
Workbook book =new XSSFWorkbook(inputstream);
Sheet sheet = book.getSheet("Sheet2");
Row row = sheet.getRow(4);
Cell cell = row.getCell(1);
Date dateCellValue = cell.getDateCellValue();
System.out.println(dateCellValue);

}
}
