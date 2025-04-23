package AlertsandCheckboxes;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlealertwithwait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		

		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//create object of wait and then you can get the alert object without switch to command use that alert object now to accept alert
		
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();
		
		
		//authenticated pop-up
		//https://the-internet.herokuapp.com/basic_auth
			
		//insert username and password to deal with such authenticated pop-up's
		
		//https://username:password@the-internet.herokuapp.com/basic_auth
		
		}

}
