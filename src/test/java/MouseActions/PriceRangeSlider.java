package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PriceRangeSlider {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://codepen.io/sameernile/pen/VoBJOb");
		driver.switchTo().frame("result");
		//WebElement ele=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		//System.out.println(ele.getLocation());
		
		Actions act = new Actions(driver);
		//act.dragAndDropBy(ele, 70, 63).perform();
		
		WebElement ele2=driver.findElement(By.xpath("//span[2]"));
		System.out.println(ele2.getLocation());
		act.dragAndDropBy(ele2, -100, 63).perform();
	}

}
