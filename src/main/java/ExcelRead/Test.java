package ExcelRead;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;

public class Test {

	public static void main(String[] args) throws IOException {
		
		ExcelReading er = new ExcelReading("D:\\BASIC PROGRAM 150\\Selenium\\ExcelHanding\\src\\demoexcel.xlsx");
		er.getRowValue();
		er.getCellValue();
		er.getData();
		
		
		
	}

}
