package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		
	
		
		Thread.sleep(2000); // Wait for page to load

        // Find the username and password input fields
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));

        // Enter credentials
        usernameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");

        // Find and click the login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class, 'oxd-button')]") );
        loginButton.click();
        
        
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']"));
        
         
                                   
	}

}
