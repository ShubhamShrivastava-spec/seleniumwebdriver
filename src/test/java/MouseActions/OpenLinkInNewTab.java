package MouseActions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement ele=driver.findElement(By.className("ico-register"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(ele).keyUp(Keys.COMMAND).perform();
		List<String> ids= new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.id("FirstName")).sendKeys("test");
		
		

	}

}
