package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {
	
	public static FileInputStream fs;
	public static FileOutputStream fo;
	public static HSSFWorkbook wk;
	public static HSSFSheet sh;
	public static HSSFRow rw;
	public static HSSFCell cl;
	
	public static int getRowCount(String file , String sheet ) throws IOException
	{
		fs=new FileInputStream(file);
		wk = new HSSFWorkbook(fs);
		sh=wk.getSheet(sheet);
		int no=sh.getLastRowNum();
		wk.close();
		fs.close();
		return no;
		
		
	}
	
	public static void setCellData(String file, String Sheet , int row,int cell, String value) throws IOException
	{
		fs=new FileInputStream(file);
		wk= new HSSFWorkbook(fs);
		sh=wk.getSheet(Sheet);
		rw= sh.getRow(row);
		cl=rw.createCell(cell);
		cl.setCellValue(value);
		
		fo=new FileOutputStream(file);
		wk.write(fo);
		
		wk.close();
		fs.close();
		
		
	}
	
	public static String getCellData(String file, String sheet , int row, int cell) throws IOException
	{
	
		
		fs= new FileInputStream(file);
		wk= new HSSFWorkbook(fs);
		sh=wk.getSheet(sheet);
		
		rw=sh.getRow(row);
		System.out.println(rw);
		cl=  rw.getCell(cell);
		return cl.toString();
	}
	

}
