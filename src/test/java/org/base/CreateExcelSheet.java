package org.base;

	import java.io.File;
	import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.apache.poi.ss.usermodel.Cell;

	public class CreateExcelSheet {
	public static void main(String[] args) throws IOException {

		//To locate File	
		File file = new File("C:\\Users\\$AM$ANKAR\\Pictures\\Screenshots\\data.xlsx");	
	//To get all data in workbook
	//	FileInputStream inputstream = new FileInputStream(file);	
		Workbook book = new XSSFWorkbook();
		//To create sheet in Excel
		Sheet sheet = book.createSheet("Sanitytesting");
		//To create row in sheet
		Row row=sheet.createRow(4);
		//To create cell from the row
		Cell cell=row.createCell(4);
		//To set value to the created cell
		cell.setCellValue("testing");
		FileOutputStream output = new FileOutputStream(file); 
		book.write(output);
		

	}

	}


