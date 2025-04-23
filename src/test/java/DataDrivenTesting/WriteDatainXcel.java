package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatainXcel {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/TestData/file_example_XLS_11.xls");
		XSSFWorkbook wbk = new XSSFWorkbook();
		XSSFSheet sht = wbk.createSheet();
		
		XSSFRow rw =sht.createRow(0);
		rw.createCell(0).setCellValue("Shubham");
		
		wbk.write(file);
		
		wbk.close();
		file.close();
		}

}
