package Navigate;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		// Click on a link of page to go to new page 
		driver.findElement(By.xpath("/a[target='_blank']")).click();
		// set of window ids received
		Set<String> Ids = driver.getWindowHandles();
		//convert set to list because get function is available in list only
		List<String> ListIds = new ArrayList(Ids);
		String Id1 = ListIds.get(0);
		String Id2 = ListIds.get(1);
		
		
		//switch to method used to switch to the window of given id
		driver.switchTo().window(Id1);
		
		// we can use loop also , will not need to convert to list and can use set directly
		for(String LoopIds:Ids)
		{
			String Title=driver.switchTo().window(LoopIds).getTitle();
			if(Title.equals("OrangeHRM"))
			{
				System.out.println("Correct");
			}
		}
		
		//close to close one of the browser windows
		
		for(String LoopIds:Ids)
		{
			String Title=driver.switchTo().window(LoopIds).getTitle();
			if(Title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}
	}

}
