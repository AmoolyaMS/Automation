package HandlingDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	int c = wb.getSheet("invalidlogin").getLastRowNum();
	for (int i = 1; i <= c; i++) {
		String un = wb.getSheet("invalidlogin").getRow(i).getCell(0).getStringCellValue();
		String pwd = wb.getSheet("invalidlogin").getRow(i).getCell(1).getStringCellValue();
		
		System.out.println("username:"+ un + " password:" + pwd);	
		
	}
	int c1 = wb.getSheet("Sheet1").getRow(1).getLastCellNum();
	for (int i = 0; i < c1; i++) {
		String un = wb.getSheet("Sheet1").getRow(1).getCell(i).getStringCellValue();
		System.err.println(un);
		
	}
	int c2 = wb.getSheet("invalidlogin").getLastRowNum();
	for (int i = 1; i <= c2; i++) {
		wb.getSheet("invalidlogin").getRow(i).getCell(2).setCellValue("pass");	
	}
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
}
}
