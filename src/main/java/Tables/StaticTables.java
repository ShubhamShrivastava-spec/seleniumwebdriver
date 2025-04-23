package Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTables {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int columns= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		/*System.out.println(rows+","+columns);
		WebElement Name =driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[2]"));
		
		System.out.println(Name.getText());
		
		for(int i=2;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText());
			}
		}*/
	
	//condition based print bookname whose author is mukesh
	
	/*for(int i=2; i<=rows;i++)
	{
		
			String item=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
			if(item.equals("Mukesh"))
			{
				System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText());
				System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText());
			}
		
		

	}*/
	
	// Total price calculation
	int count=0;
	for(int i=2; i<=rows;i++)
	{
		
			String item=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
			
				
		     count=Integer.parseInt(item)+count;
		
	}
	
	System.out.println("Total price is"+ count);
	
	}
}
