package package2.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

	@Test(dataProvider = "login")
	public void userPass(String username, String password) {

		System.out.print(username);
		System.out.println(password);
	}

	@DataProvider(name = "login")
	public Object[][] testlogin() throws IOException {
		Object[][] arrayOfData = getExcelData();
		return arrayOfData;
	}

	public String[][] getExcelData() throws IOException {
		String data[][] = null;
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\Package2\\loginData.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rownum = sheet.getLastRowNum();
		int colnum = sheet.getRow(0).getLastCellNum();

		data = new String[rownum][colnum];
		XSSFRow row;
		XSSFCell cell;

		for (int i = 0; i < rownum; i++) {
			for (int j = 0; j < colnum; j++) {

				row = sheet.getRow(i+1);
				cell = row.getCell(j);
				data[i][j] = cell.getStringCellValue();

			}
		}

		return data;

	}
}
