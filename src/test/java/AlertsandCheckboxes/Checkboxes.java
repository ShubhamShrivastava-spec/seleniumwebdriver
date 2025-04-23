package AlertsandCheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		
		List<WebElement> Allchecks=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println(Allchecks.size());
		for(int i=1;i<Allchecks.size();i++)
		{
			System.out.println("in for loop");
			Allchecks.get(i).click();
		}
	}
	
	//cjange i to go to different no of check box or to stop at a certain checkbox.
}
