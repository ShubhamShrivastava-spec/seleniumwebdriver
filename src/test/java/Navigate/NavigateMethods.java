package Navigate;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

import org.openqa.selenium.WebDriver;

public class NavigateMethods {

	public static void main(String[] args) {
		
      WebDriver driver = new ChromeDriver();
      
      driver.navigate().to("https://demo.nopcommerce.com/");
      //navigate.to method works same as get method but can take url and url obj as parameter
      //  URL myurl = new URL("https://demo.nopcommerce.com/");
      //driver.navigate().to(myurl);
      driver.navigate().back(); // if you click on an item on a webpage that will take you to some other page and now you want to go back to last page then use this command.
      
      driver.navigate().forward();// again to go to last page that come after clock , these two command can also be use if we open two url.
      driver.navigate().refresh(); // to refresh the page
	}

}

