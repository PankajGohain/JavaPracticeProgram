package package2.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelPasswordProtected {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\Package2\\loginData.xlsx");
		String password = "test123";

		Workbook wbf = WorkbookFactory.create(fis, password);
		XSSFSheet sheet=(XSSFSheet) wbf.getSheet("Basic");
	}

}
