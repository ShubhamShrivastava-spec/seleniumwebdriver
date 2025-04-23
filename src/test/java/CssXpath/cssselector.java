package CssXpath;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cssselector {

	public static void main(String[] args) {
		
    WebDriver driver = new ChromeDriver();
    
     driver.get("https://demo.nopcommerce.com/");
     driver.manage().window().maximize();
     //cssselector with id and tag
     //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Test");
    // driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Test"); If id is unique
     
     //cssselector with classname and tag
     //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Test"); // class name was (search-box-text ui-autocomplete-input) we can remove the name after space
     
     //css selector with attribute
     driver.findElement(By.cssSelector("input.search-box-text[id='small-searchterms']")).sendKeys("test");
     
     // In above line tag , class name and attribute with value has used.
	}

}
