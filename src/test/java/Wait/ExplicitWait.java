package Wait;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExplicitWait {

	public static void main(String args[])
	{
		/*WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // declaration of wait class
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/input[@placeholder='txt']"))); // condition
		// explicit wait return element of webelement type once the element is visible, but will wait for max time i.e. given if element is not present for the element to appear
		// chance of getting exception is always there in all wait commands , we can use try catch block
		
		
		
		//Fluent wait
		
		
	//	Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
	/*	WebElement element = wait2.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath(""));
			}*/
		
	// In fluent wait duration is given and then polling occur after every polling time till it reach the total duration 
	
}
	
}
