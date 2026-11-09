package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir") + "\\TestDataFolder\\BookName_Africa_Asia.xlsx";
		DataFormatter formatter = new DataFormatter();

		try (FileInputStream file = new FileInputStream(path); Workbook workbook = WorkbookFactory.create(file)) {
			Sheet sheet = workbook.getSheet("BookName");
			if (sheet == null) {
				sheet = workbook.getSheetAt(0);
			}

			System.out.println("Sheet name: " + sheet.getSheetName());
			for (Row row : sheet) {
				for (int c = 0; c < row.getLastCellNum(); c++) {
					System.out.print(formatter.formatCellValue(row.getCell(c)) + "\t");
				}
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println("File not found or unable to read: " + path);
			e.printStackTrace();
		}
	}
}