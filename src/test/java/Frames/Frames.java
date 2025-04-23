package Frames;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
		// For frames we have to first switch to frame to interact with the elements present inside frames.
		// in below line we have taken the web elemnt of frame as there was no id and name and then switch to it 
		
		/*WebElement myframe=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(myframe);
		// now you can interact with elements of frames
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("test");
		
		// now come out of frame to main page
		driver.switchTo().defaultContent();*/
		
	//	WebElement Secondframe =driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	//	driver.switchTo().frame(Secondframe);

	//	driver.findElement(By.xpath("//input[src='mytext2']")).sendKeys("test");
		
		// switch to iframe inside frame
		/*WebElement Frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
	
		driver.switchTo().frame(Frame3);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[normalize-space()='I am a human']")).click();
		
		WebElement Frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		
		driver.switchTo().frame(Frame5);
		
		driver.findElement(By.xpath("//a[@href='https://a9t9.com']")).click();
		//WebElement framepath=driver.findElement(By.xpath("/html[1]/frameset[1]/frame[2]"));
		
		
		
		
		Boolean value =driver.findElement(By.xpath("//img[@src='/Content/Images/ui.vision.logo2.webp']")).isDisplayed();
		System.out.println(value);
		                            
	}

}*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Navigate to the target webpage
        driver.get("https://ui.vision/demo/webtest/frames/");
        
        // Switch to frame_5
        WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);
        
        // Click the link inside frame_5
        WebElement link = driver.findElement(By.xpath("//a[@href='https://a9t9.com']"));
        link.click();
        
        // Validate if the logo is present
        boolean isLogoPresent = driver.findElements(By.xpath("//img[contains(@src, 'ui.vision.logo2.webp')]")).size() > 0;
        
        // Print validation result
        if (isLogoPresent) {
            System.out.println("Logo is present in frame 5 ✅");
        } else {
            System.out.println("Logo is NOT present in frame 5 ❌");
        }
        
        // Switch back to the main content
        driver.switchTo().defaultContent();
        
        // Close the browser
        driver.quit();
    }
}
