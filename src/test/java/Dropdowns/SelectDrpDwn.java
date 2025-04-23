package Dropdowns;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDrpDwn {

	


		public static void main(String args[])
		{
			// there are three types of dropdowns - select , bootstrap , hidden dropdown. Select dropdowns have tag as select
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			// Select class is present for select type of dropdowns
			
			WebElement drpdwnEle=driver.findElement(By.xpath("//select[@id='country']"));
			Select drpdwn= new Select(drpdwnEle);
			drpdwn.selectByValue("canada"); // select option from dropdowns
			List<WebElement>all=drpdwn.getOptions();
			System.out.println(all.size());
			for(WebElement option: all)
			{
				System.out.println(option.getText());
			}
			
			
			
		}
	

}
