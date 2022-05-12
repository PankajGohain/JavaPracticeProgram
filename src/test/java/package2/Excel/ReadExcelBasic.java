package package2.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.print.DocFlavor.STRING;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelBasic {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\Package2\\loginData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Basic");
		int row = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();

		System.out.println(row + "         " + cols);

		for (int i = 0; i < row; i++) {

			XSSFRow r = sheet.getRow(i); // from which row we want to fetch data

			for (int j = 0; j < cols; j++) {
				
				XSSFCell cell = r.getCell(j);

				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				case FORMULA:
					System.out.print(cell.getNumericCellValue());
					break;
				}
				System.out.print("|");
			}
			System.out.println();
		}

		wb.close();
		fis.close();

	}

}
