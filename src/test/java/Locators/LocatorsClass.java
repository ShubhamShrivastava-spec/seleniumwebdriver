package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LocatorsClass {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		//find element to locate the locator , send key is used to enter a string in text field
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//use of by id locator and isDisplayed method is used to find out if a logo or image is displayed or not
		
		Boolean logoactValue =driver.findElement(By.id("logo")).isDisplayed();
		
		// isDisplayed method returns boolean (true or false)
		
		System.out.println(logoactValue);
		
		
		//linktext & partial linktext( Diff b/w them is we use entire letter for linktext and only few letters for partial linktext. Linktext is denoted by anchor tag <a href and a title(where we click) called as linktext.
		// if <a is not present it is not a linktext. Linktext is prefer over partial linktext as partial linktext can refer to many same titles.
		driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Tab")).click();
		
		
		//Tag name and class name is used to locate group of web elements,(how many total no of links or buttons or checkboxes are there
		
		// find elements is used to return multiple elements , above we have used find element for returning single element
		
		
		List<WebElement> headerlist = driver.findElements(By.className("list-inline-item"));
		
		// return type of findelements is list not set because list can have duplicates but in set we cannot save duplicate items
		 
		// Tag name use is as below
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links is"+links);
		
		List<WebElement> Images = driver.findElements(By.tagName("img"));
		System.out.println(" Total no of images are"+ Images);
		
		
		//Scenarios for diff b/w find elements and find element
		// 1.if locator is pointing to one element both will return single element as return type Webelement and list<Webelement>
		//2.if locator is pointing to multiple elements , find element will return first matching element and find elements return list of WebElements
		//3. if locator is pointing to nothing find element return exception (No such element and find elements return 0.

	}

}
