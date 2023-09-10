package org.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
public class TogetAlldataFromExcel {
public static void main(String[] args) throws IOException {
File file = new File("C:\\Users\\$AM$ANKAR\\Pictures\\Screenshots\\Class Notes\\20.12.2022\\dummydata.xlsx");
FileInputStream inputStream =new FileInputStream(file);
Workbook book = new XSSFWorkbook(inputStream);
Sheet sheet = book.getSheet("Sheet1");
for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
	Row row =sheet.getRow(i);
	for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
		Cell cell=row.getCell(j);
		String stringCellValue = cell.getStringCellValue();
		System.out.print(stringCellValue+"\t");
				
	}
	System.out.println();
}

}
}
