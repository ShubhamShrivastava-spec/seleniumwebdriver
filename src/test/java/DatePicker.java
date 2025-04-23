import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://dummy-tickets.com/buyticket");
		//driver.findElement(By.xpath("//input[contains(@class,'suggestion-input')]")).sendKeys("India");
		//driver.findElement(By.xpath("//form[@id='flight_oneway']//div[@class='col-sm-12 p-0 suggestion-container']//input[@name='source"));
		
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
		
		 WebElement fromField = wait.until(ExpectedConditions.elementToBeClickable(By.id("from")));
	        fromField.sendKeys("India");

	        // Wait for the option "Indianapolis International Airport" to appear
	        WebElement airportOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//li[contains(text(), 'Indianapolis International Airport')]")
	        ));

	        // Click the option
	        airportOption.click();
	}

}
