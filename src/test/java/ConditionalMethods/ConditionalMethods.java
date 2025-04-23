package ConditionalMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		//Boolean Enable=driver.findElement(By.xpath("//button[@id='register-button']")).isEnabled();
		//System.out.println(Enable);
		Boolean Value =driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println(Value);
		String register =driver.findElement(By.xpath("//div[@class='page-title']/child::h1")).getText();
		System.out.println(register);
		
		//close() - will close single browser that too the primary window where we were working
		//quit()- will close multiple browser window
	}

}
