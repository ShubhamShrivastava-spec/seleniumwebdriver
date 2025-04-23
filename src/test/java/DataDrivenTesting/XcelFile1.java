package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelFile1 {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/TestData/file_example_XLS_10.xls");
		
		HSSFWorkbook wbk= new HSSFWorkbook(file);

		HSSFSheet sh= wbk.getSheet("Sheet1");
		
		int noOfRows =sh.getLastRowNum();
		int noOfCells=sh.getRow(1).getLastCellNum();
		
		System.out.println(noOfRows );
		
		for (int i=0; i< 10 ;i++)
		{
			HSSFRow rw=sh.getRow(i);
			for (int j=0;j<noOfCells;j++)
			{
				System.out.println(rw.getCell(j).toString());
			}
		}
		
		wbk.close();
		file.close();
		
		
	}

}
