package CssXpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssSelectorPractise {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 
		
		 
		//for search button
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Ariel");
		
		
		WebElement element = 	driver.findElement(By.xpath("(//a[@class='oleBil'])[4]"));
                  element.click();
    
		
       
		
		
	//  driver.findElement(By.cssSelector("img._2puWtW[alt='Kilos']")).click();
	 //Boolean value= driver.findElement(By.cssSelector("img.W5mR4e[title='Flipkart']")).isDisplayed();	  
	 
	// System.out.println(value);
		
		
	}

}
