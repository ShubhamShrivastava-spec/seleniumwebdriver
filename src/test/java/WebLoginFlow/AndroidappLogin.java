package WebLoginFlow;

 
	
	
	
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.*;

	import java.net.URL;

	public class AndroidappLogin {

	    AndroidDriver<MobileElement> driver;

	    @BeforeClass
	    public void setup() throws Exception {
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("deviceName", "Android Emulator");
	        caps.setCapability("appPackage", "com.olacabs.customer");
	        caps.setCapability("appActivity", "com.olacabs.customer.ui.SplashActivity");
	        caps.setCapability("automationName", "UiAutomator2");
	        caps.setCapability("noReset", true); 
	        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
	    }

	    @Test
	    public void clickContinueWithRide() throws InterruptedException {
	        // Wait for app to load
	        Thread.sleep(5000);

	        // Locate and click "Continue with Ride" button
	      
	        try {
	            MobileElement continueBtn = driver.findElement(By.xpath("//android.widget.Button[contains(@text, 'Continue with Ride')]"));
	            continueBtn.click();
	            System.out.println("Clicked 'Continue with Ride' button");
	        } catch (Exception e) {
	            System.out.println("Button not found: " + e.getMessage());
	        }
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

}
