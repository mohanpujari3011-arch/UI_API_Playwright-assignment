package Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataSheet {
	
	public String DataImport(int row,int Cell) throws IOException {
	
String path = System.getProperty("user.dir")
        + File.separator + "Data"
        + File.separator + "TestLoginData.xlsx";
	FileInputStream fis = new FileInputStream(path);

	try (XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row1 = sheet.getRow(row);
		String cellValue = row1.getCell(Cell).toString();

		return cellValue;
	}

	
}
}
