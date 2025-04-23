package CssXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		
		//Diff b/w absolute and partial xpath 
		// absolute xpath traverse from root node of html , partial xpath jumps directly by using attribute
		// in absolute xpath we use single slash and in partial xpath we use // slash to jump through many tags
		//absolute xpath can change with continous dev thats why we use partial xpath as attribute used in partial xpath will remain same.
		
		// how to write your own xpath --> //tag[@attr='value'] or //*[@attr='value']
		
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("test");
		
		// xpath with multiple attributes
		
		driver.findElement(By.xpath("//input[@name='search'][@placeholder='search']")).sendKeys(args);
		
		//and /or operator with xpath
		driver.findElement(By.xpath("//input[@name = 'search'] and [@placeholder= 'search']")).sendKeys("text");
		
		// and operator will check both options , or operator will see if any of one option is true then statement is true
		
		// inner text. -> link text is always inner text but inner text can not be link text
		
		driver.findElement(By.xpath("//*[text()='Macbook']")).click();
		String value =driver.findElement(By.xpath("//h3[@text='Featured']")).getText();
		System.out.println(value);
		
		//contains and start with , in contain pattern can be any where in between 
		 driver.findElement(By.xpath("//input[contains(@id,'sea')]")).sendKeys("text");
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'sea')]")).sendKeys("Test");
        
        //contains and start with can help to handle dynamic elements like if a button is changing - you can use or and contains if some elements are same
        
        
        // chained xpath - if your target element doesn't have attributes then start with that parent that have attributes
       Boolean image = driver.findElement(By.xpath("//div[@id='logo'/a/img]")).isDisplayed();
       System.out.println(image);
       
       // div[contains(text(),'')] - will go for a inner text like <div></div>
       // div[contains(.,'')] - this dot also represents text()
       
       // Difference between css and xpath -> in css we can go top down only while xpath is multidirectional
       
       
  }
}