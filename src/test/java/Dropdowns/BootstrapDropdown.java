package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		
		//bootstrap dropdown won't have select tag but will have another tag like button,div
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); // find first element and click to open the dropdown
		//driver.findElement(By.xpath("//input[@value='CSS']")).click(); // already selected so gets unselected
		
		//get all options in a list
		
	    List<WebElement> options= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	    
	    System.out.println(options.size());
	    //Print all options
	    
	   /* for(WebElement Option: options)
	    {
	    	System.out.println(Option.getText());
	    }*/
	    
	    //select a particular option
	    
	    for(WebElement Option: options)
	    {
	    	if(Option.getText().equals("Java")|| Option.getText().equals("CSS"))
	    	{
	    		Option.click();
	    	}
	    }
	}

}
