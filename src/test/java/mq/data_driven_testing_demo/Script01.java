package mq.data_driven_testing_demo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Script01 {

	
	@Test
	public void test_method01(){
		try {
			Workbook workbook = new XSSFWorkbook("src//test//resources//data.xlsx");
			Sheet sheet = workbook.getSheet("data");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			System.out.println(cell.getStringCellValue());
			workbook.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
