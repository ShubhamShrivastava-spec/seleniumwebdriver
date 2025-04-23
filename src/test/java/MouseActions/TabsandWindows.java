package MouseActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsandWindows {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}

}
