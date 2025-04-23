import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		
	 	List<WebElement> list= driver.findElements(By.tagName("a"));
		
	 	for(WebElement ele : list)
	 	{
	 		String link=ele.getAttribute("href");
	 		
	 		if(link.isEmpty()||link==null)
	 		{
	 			
	 			System.out.println("link is not present");
	 			continue;
	 		}
	 		try
	 		{
	 		
	 		URL newurl= new URL(link);
	 		HttpURLConnection conn	=(HttpURLConnection)newurl.openConnection();
	 		conn.connect();
	 		
	 		if(conn.getResponseCode()>=400)
	 		{
	 			System.out.println("Its a broken link");
	 		}
	 		else
	 		{
	 			System.out.println("Its not a broken link");
	 		}
	 	}catch(Exception e)
	 		{
	 		
	 		}
	 	}
	 	
	 	
	 	
	}

}
