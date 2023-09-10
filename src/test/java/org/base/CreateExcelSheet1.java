package org.base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelSheet1 {
public static void main(String[] args) throws IOException {
//Locate File
	
File file = new File("C:\\Users\\$AM$ANKAR\\Pictures\\Screenshots\\data1.xlsx");	
	Workbook book= new XSSFWorkbook();
//To create sheet
	
	Sheet newSheet = book.createSheet("Sheet1");
// To create row
	
	Row newRow = newSheet.createRow(3);
//To Create cell
	
Cell newCell = newRow.createCell(2);
newCell.setCellValue("Practice");

FileOutputStream output = new FileOutputStream(file);
	//To write Value to the Workbook
book.write(output);

	
}
}
