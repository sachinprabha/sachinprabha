package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFormat {

	public static void main(String[] args) throws IOException {
		
		
		
		File f =new File("C:\\Users\\sachin prabha\\eclipse-workspace\\AsampleMvn\\excel\\class1.xlsx");
	
		FileInputStream fins = new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fins);
		
		Sheet sh =w.getSheet("sheet1");
		Row r=sh.getRow(1);
		Cell c=r.getCell(1);
		System.out.println(c);
		
		
	}
	}
	
	

