package Wait;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WaitMethods {

	public static void main(String[] args) {
		//To resolve synchronization problem
		//thread.sleep() and wait commands
		//thread.sleep is java method
		// No such element exception comes with synchronization , element not found for incorrect locator
		//thread.sleep(3000);
		//adv -easy to use 
		//disadv- will always wait for time given even if the element is present in less time.
		//implicit wait - 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait
		// implicit wait is always put at the start of code after creating driver instance. now it will applicable for every statement till you close your driver.
		//In implicit wait if element appear after 2 min then it will not wait for max timeout given.
		//exception can occur if element appear after time given
		driver.close();
		

	}

}
