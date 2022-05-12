package package2.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToHashMap {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\Package2\\loginData.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Map");
		int row = sheet.getLastRowNum();

		LinkedHashMap<Object, Object> hmap = new LinkedHashMap<Object, Object>();
		for (int i = 1; i <= row; i++) {
			String key = sheet.getRow(i).getCell(0).getStringCellValue();
			int value = (int) sheet.getRow(i).getCell(1).getNumericCellValue();

			hmap.put(key, value);
		}

		System.out.println(hmap);
	}

}
