package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		
		List<WebElement> ListofSearches= driver.findElements(By.xpath("//ul[@class='G43f7e' ]//li//div//div[1]//div[@role='presentation']//span"));
				
		
		for (WebElement Option : ListofSearches)
		{
			System.out.println(Option.getText());
		}

	}

}
