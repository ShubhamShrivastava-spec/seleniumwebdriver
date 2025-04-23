package FileUpload;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		String Firstfile="/Users/shubhamshrivastava/Downloads/Payslip 2025020.pdf";
		String Secondfile="/Users/shubhamshrivastava/Downloads/Payslip 2025010.pdf";
				
				driver.findElement(By.id("filesToUpload")).sendKeys(Firstfile+"\n"+Secondfile);
		
		List<WebElement> files=driver.findElements(By.xpath("//ul[@id='fileList']//li"));
		
		for(WebElement file:files)
		{
			
		if(file.getText().equals("Payslip 2025020.pdf")|| file.getText().equals("Payslip 2025010.pdf"))
		{
			System.out.println("File is present");
		}
		}

}
}
