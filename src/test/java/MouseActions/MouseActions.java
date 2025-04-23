package MouseActions;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement mouseOver=driver.findElement(By.xpath("//div[@class='dropdown']/button"));
		WebElement NextElement=driver.findElement(By.xpath("//div[@class='dropdown']//div[@class='dropdown-content']//a[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(mouseOver).moveToElement(NextElement).click().build().perform();
		
		// for double click
		WebElement DblClick = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		act.doubleClick(DblClick).build().perform();
		
		
		WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(drag, drop).build().perform();
		
		
	}

}
