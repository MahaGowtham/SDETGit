package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelFile {

	public void writeTest(String nameReceived) throws Exception {
		// TODO Auto-generated method stub
		

		FileInputStream fis = new FileInputStream("./credentialfile.xlsx");
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheetAt(0);
		sheet.getRow(1).getCell(1).setCellValue(nameReceived);
		
		FileOutputStream fos = new FileOutputStream("./credentialfile.xlsx");
		wbf.write(fos);
		wbf.close();
		
		 

	}

}
