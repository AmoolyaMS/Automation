package com.actitime.generic;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 *  its a generic class having generic methods used to read data from property file,excel file and write data into excel
 * @author msamo
 */

public class FileLib {
	/**
	 * its a generic method used to read data from property file
	 * @param key
	 * @return String
	 * @throws IOException
	 */
public String readFromProperty(String key) throws IOException
{
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p = new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
	
}
/**
 * its a generic method used to read data from excel file
 * @param sheet
 * @param row
 * @param cell
 * @return String
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String readFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
/**
 * its a generic method used to write data into excel file
 * @param sheet
 * @param row
 * @param cell
 * @param data
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void writeIntoExcel(String sheet,int row,int cell,String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
}
}
