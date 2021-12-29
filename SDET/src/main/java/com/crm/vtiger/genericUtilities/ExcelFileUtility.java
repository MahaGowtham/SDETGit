package com.crm.vtiger.genericUtilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import DataDrivenTesting.ReadDataFromExcelFile;

public class ExcelFileUtility {
	
	ReadDataFromExcelFile rdf = new ReadDataFromExcelFile();
	
	public void openFile() throws Exception {
		FileInputStream fis = new FileInputStream("./credentialfile.xlsx");
	     Workbook wbf = WorkbookFactory.create(fis);
		for(int i=0; i<=1; i++) {
		for(int j=1; j<=10; j++) {
			String value = wbf.getSheet("Sheet1").getRow(j).getCell(i).getStringCellValue();
			System.out.println(value);
		}
	}
	}

}
