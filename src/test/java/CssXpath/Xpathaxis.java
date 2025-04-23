package CssXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathaxis {

	public static void main(String[] args) {
		
		// Xpath axis symbol  //self root[attr='value']/relation::tagname
		//parent and ancestor can be only one so we can also use //self root[attr='value']/relation::*
		// to skip all tags in between use // rootnode//targetnode -> //self-root[attr='value']//tagname
		
		// self , parent, ancestor, following, preceding, following sibling, preceding sibling , child , desendent
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("test");	
	//driver.findElement(By.xpath("//input[@id='small-searchterms']/following-sibling::button")).click();
	//Boolean Image= driver.findElement(By.xpath("//div[@class='header-logo']/descendant::img")).isDisplayed();
		//System.out.println(Image);
		//String Name =driver.getTitle();
		//System.out.println(Name);
		//driver.getCurrentUrl()- gives url
		//String Name =driver.getPageSource();- gives source code of the page
		//System.out.println(Name);
		//driver.getWindowHandle() - give id of the current window
		//driver.getWindowHandles() -give id of multiple browser windows
		
	}

}
