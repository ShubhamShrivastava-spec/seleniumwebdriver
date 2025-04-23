package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement Price= driver.findElement(By.xpath("//div[@class='ui-widget-content']//ul//li[4]"));
		WebElement Box1 = driver.findElement(By.id("amt7"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(Price, Box1).build().perform();
		Thread.sleep(5);
		WebElement  Bank = driver.findElement(By.xpath("//div[@class='ui-widget-content']//ul//li[5]"));
		WebElement Box2= driver.findElement(By.xpath("//div[@id='shoppingCart1']//div//ol[@id='bank']"));
		
		act.dragAndDrop(Bank, Box2).build().perform();
		
		
	}

}
