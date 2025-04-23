package AlertsandCheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://testautomationpractice.blogspot.com/");
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
        driver.get("https://mypage.rediff.com/login/dologin");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
      
        Thread.sleep(5000);
        
        driver.switchTo().alert().accept();
        
	}

}
