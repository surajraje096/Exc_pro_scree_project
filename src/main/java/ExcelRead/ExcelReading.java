package ExcelRead;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

class ExcelReading {

	public static int count = 0, count1 = 0;
	Workbook book;
	org.apache.poi.ss.usermodel.Sheet sheet1;

	public ExcelReading(String filepath) throws IOException {

		File f = new File(filepath);
		FileInputStream fis = new FileInputStream(f);
		book = WorkbookFactory.create(fis);
		sheet1 = book.getSheetAt(0);
	}

	public int getRowValue() {
		sheet1 = book.getSheetAt(0);

		for (Row row : sheet1) {
			count++;
		}
		System.out.println("Row :" + count);
		return count;
	}

	public int getCellValue() {
		sheet1 = book.getSheetAt(0);
		for (Row row : sheet1) {
			for (Cell c : row) {
				count1++;
			}
			break;
		}
		System.out.println("Cell :" + count1);
		return count1;

	}

	public void getData() {
		sheet1 = book.getSheetAt(0);
		for (int i = 1; i < count - 1; i++) {
			Row r = sheet1.getRow(i);
			

				Cell c = r.getCell(0);
				int no = (int) c.getNumericCellValue();
				
				
				Cell c1 = r.getCell(1);
				String str = c1.getStringCellValue();

				System.out.print(no+"------>"+str);
				
		
			System.out.println();
		}

	}

	/*
	 * public static void main(String[] args) throws IOException {
	 * 
	 * ExcelReading er = new
	 * ExcelReading("D:\\BASIC PROGRAM 150\\Selenium\\ExcelHanding\\src\\demoexcel.xlsx"
	 * ); int x=er.getRowValue(); int y = er.getCellValue();
	 * 
	 * er.getData();
	 * 
	 * }
	 */

}
