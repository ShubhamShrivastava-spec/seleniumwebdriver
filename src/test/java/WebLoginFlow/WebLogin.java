package WebLoginFlow;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebLogin {
	
	WebDriver driver;
	
  @Test(priority=1)
  public void opensite() 
  {
	  driver = new ChromeDriver();
	  
	  // go to the site
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  
	  //  maximize the window
	  driver.manage().window().maximize();	   
  }
  
  @Test(priority=2)
  public void enterCrendentials() throws InterruptedException
  {
	  Thread.sleep(10);
	  //get username field
	  driver.findElement(By.id("username")).sendKeys("student");
	  
	  //get password field
	  driver.findElement(By.id("password")).sendKeys("Password123");
  }
  
  
  @Test(priority=3)
  public void clickLogin()
  {
	  //click on Login button
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
      
  }
  
  @Test(priority=4)
  public void verifyLogin()
  {
	  //verify the icon on login
	  driver.findElement(By.xpath("//h1[text()='Logged In Successfully']")).isDisplayed();
	  
	 
  }
  
}
