package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		
		for(int i=1;i<=4;i++)
		{
		List<WebElement> NewList=driver.findElements(By.xpath("//ul[@class='pagination']//li["+i+"]"));
		
		for(WebElement ele : NewList)
		{
			ele.click();
		}
		int rows=driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
		
		
		for(int j=1;j<rows;j++)
		{
			System.out.println("In loop");
		driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+j+"]/td[4]//input")).click();
		
		}
		}
        
	}

}
