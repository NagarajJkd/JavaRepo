package com.zoho.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Library {
	
	public String getPropertyData(String key) throws IOException {
			
					FileInputStream fis=new FileInputStream("./data/commondata.property");
					Properties p=new Properties();
				p.load(fis);
					String data = p.getProperty(key);
					return data;
	}
	
	public String getExcellData(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
					FileInputStream fiS=new FileInputStream("./data/testscript.xlsx");
					Workbook wb = WorkbookFactory.create(fiS);
					String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
					return data;
	}
	
	public void setExcellVale(String sheetname, int cell, String value) throws EncryptedDocumentException, IOException {
					FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
					Workbook wb = WorkbookFactory.create(fis);
					int row = wb.getSheet("").getLastRowNum();
					wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
					FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
					wb.write(fos);
					wb.close();
			
	}

}
