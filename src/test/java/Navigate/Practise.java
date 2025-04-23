package Navigate;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practise {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("sky");
			
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
			
		   
		List<WebElement> NumberofLinks= driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));
		
		
			System.out.println(NumberofLinks.size());
			 for (int i=0;i<NumberofLinks.size();i++ )
			 {
				System.out.println(NumberofLinks.get(i));
			 }
			
			//driver.findElement(By.linkText("Sky")).click();
			                 
		
			
			
				/*Set<String> WindowID=driver.getWindowHandles();
					for(String IDS : WindowID)
					{
						
						String Title= driver.switchTo().window(IDS).getTitle();
						System.out.println(Title);
						if(Title.equals("Sky - Wikipedia"))
						{
							driver.close();
						}
						
					}*/
			
				
			 
			

}
}
