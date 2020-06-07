package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderr {
 static FileInputStream  fis = null;
 
 public FileInputStream GetFileInputStream() throws FileNotFoundException
 {
	 
	 String FilePath = System.getProperty("user.dir")+"\\src\\test\\java\\data\\Dataa.xlsx";
	 
	 File SrcFile = new File(FilePath);
	 try {
		 fis = new FileInputStream(SrcFile);
		
	} catch (Exception e) {
		System.out.println("Test Data File Not Found please check file path");
	}
	  
	 
	 return fis;
	 
 }
 
 
 public Object[][] GetExcelFile() throws IOException
 {
	 
	 fis = GetFileInputStream();
	 XSSFWorkbook WB = new XSSFWorkbook(fis);
	 XSSFSheet Sheet = WB.getSheetAt(0);
	 
	 
	 int TotalNumbersOfRows =1;
	 int TotalNumbersOfCols = 6;
	 
	 String [][] ArrayExcelData = new String [TotalNumbersOfRows][TotalNumbersOfCols] ;
	 
	 for (int i = 0; i < TotalNumbersOfRows; i++) {
		for (int j = 0; j < TotalNumbersOfCols; j++) {
			XSSFRow  Row = Sheet.getRow(i);
			ArrayExcelData [i][j] = Row.getCell(j).toString();
		}
	}
	 WB.close(); 
	return ArrayExcelData;
	 
 }



}

