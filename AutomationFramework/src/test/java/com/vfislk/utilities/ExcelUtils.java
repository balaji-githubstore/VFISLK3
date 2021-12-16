package com.vfislk.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static Object[][] getSheetIntoObjectArray(String fileDetail,String sheetName) throws IOException 
	{
		FileInputStream file = new FileInputStream(fileDetail);

		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		DataFormatter format = new DataFormatter();
		
		Object[][] arr = new Object[rowCount - 1][cellCount];

		for (int r = 1; r < rowCount; r++) {
			for (int c = 0; c < cellCount; c++) {
				String cellValue = format.formatCellValue(sheet.getRow(r).getCell(c));
				arr[r - 1][c] = cellValue;
			}
		}
		
		book.close();
		return arr;
	}

	//log the result in excel
	
}
