package AlertsandCheckboxes;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//driver.switchTo().alert().accept(); // for simple alerts with ok
		
		//2 is confirmation alert with Ok and cancel , for ok accept is used and for cancel we use dismiss
		
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		//Thread.sleep(5000);
		//driver.switchTo().alert().dismiss();
		
		// .alert return alert type object that can be saved 
		
		//Alert myalert = driver.switchTo().alert();
		//System.out.println( myalert.getText());
		
		// 3rd is prompt alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myalert =driver.switchTo().alert();
		myalert.sendKeys("welcome");
		myalert.accept();
	}
}
