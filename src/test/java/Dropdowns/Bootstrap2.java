package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bootstrap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement drpdwnEle=driver.findElement(By.xpath("//select[@id='colors']"));
		
		
		Select drpdwn= new Select(drpdwnEle);
		drpdwn.selectByValue("red");
		
		drpdwn.selectByValue("yellow");
		
		List<WebElement>all=drpdwn.getOptions();
		
		for(WebElement option: all)
		{
			if(option.getText().equals("Green"))
			{
				option.click();
			}
		}
		

	}

}
