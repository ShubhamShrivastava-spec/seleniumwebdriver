import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://books-pwakit.appspot.com/");
		
		SearchContext src=driver.findElement(By.xpath("//book-app[@apptitle='BOOKS']")).getShadowRoot();
		
		src.findElement(By.cssSelector("#input")).sendKeys("okay");
	}

}
