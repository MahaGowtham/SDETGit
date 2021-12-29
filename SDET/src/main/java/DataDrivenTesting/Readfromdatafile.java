package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readfromdatafile {

	public static void main(String[] args) throws IOException {
FileInputStream fis = new FileInputStream("./CommonDataExcelFile.xlsx");
Workbook wbf = WorkbookFactory.create(fis);
Sheet sheet = wbf.getSheet("Sheet1");
Row row = sheet.getRow(2);
Cell cell = row.getCell(0);
String value = cell.getStringCellValue();
System.out.println(value);


	}

}
