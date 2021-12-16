package com.vfislk.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoExcelTest {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("src/test/resources/testdata/OpenEmrData.xlsx"); // location

		XSSFWorkbook book = new XSSFWorkbook(file); // open
		XSSFSheet sheet = book.getSheet("invalidCredentialTest"); // sheet

		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(cellCount);
		
		DataFormatter format = new DataFormatter();

		Object[][] main = new Object[rowCount - 1][cellCount];

		for (int r = 1; r < rowCount; r++) {
			for (int c = 0; c < cellCount; c++) {
				String cellValue = format.formatCellValue(sheet.getRow(r).getCell(c));
				System.out.println(cellValue);
				main[r - 1][c] = cellValue;
			}
		}

		System.out.println();

	}
}
