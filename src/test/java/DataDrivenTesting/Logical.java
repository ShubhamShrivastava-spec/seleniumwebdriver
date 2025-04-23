package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logical {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		String Filepath = System.getProperty("user.dir")+"/TestData/file_example_XLS_10.xls";
		
		                
		
        String data = Utility.getCellData(Filepath, "Sheet1", 2,1);
		driver.findElement(By.id("name")).sendKeys(data);
	}

}
