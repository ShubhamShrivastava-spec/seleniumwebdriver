package ScreenshotsandChromeOptions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot sh= (TakesScreenshot)driver; // assigning driver object to takescreenshoy interface variable after upcasting
		
		File SourceFile=sh.getScreenshotAs(OutputType.FILE);// screenshot saved somewhere in memory
		
		File TargetFile = 	new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");// created a location for screenshot in current project by System.getProperty
		
		SourceFile.renameTo(TargetFile); // copying from souce memory place to our location
		
		
		//capture the screenshot of specific element
		
		WebElement ele=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File Source2=ele.getScreenshotAs(OutputType.FILE);
		File Target2=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage2.png");
		Source2.renameTo(Target2);
		
		

	}

}
