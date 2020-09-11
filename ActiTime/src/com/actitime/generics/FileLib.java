package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileLib {
	 public String getPropertyValue( String key) throws IOException {
		 FileInputStream fis=new FileInputStream("./data/commondata1.property.txt");
		 Properties p=new Properties();
		 p.load(fis);
		 String text=p.getProperty(key);
		 return text;
	 }
	 public String getExcelValue(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		 FileInputStream fis=new FileInputStream("./data/textscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	 }

}
