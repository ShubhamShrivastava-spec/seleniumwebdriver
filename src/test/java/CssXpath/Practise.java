package CssXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement option=driver.findElement(By.xpath("//select[@id='country-list']"));
		Select options = new Select(option);
		List<WebElement>Alloptions=options.getOptions();
		
		System.out.println(Alloptions.size());
		for(WebElement Oneoption : Alloptions )
		{
			System.out.println(Oneoption.getText());
			if(Oneoption.getText().equals("China"))
			{
				Oneoption.click();
			}
		}
		
		//driver.findElement(By.xpath("//select[@id='country-list']")).click();
		List<WebElement> drpdwn= driver.findElements(By.xpath("//select[@id='country-list']//option"));
		 System.out.println(drpdwn.size());

	}

}
