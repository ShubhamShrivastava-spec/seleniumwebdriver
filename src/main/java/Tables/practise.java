package Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practise {

	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.blazedemo.com/");
		
		driver.manage().window().maximize();
		WebElement Ele= driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select item= new Select(Ele);
		item.selectByValue("Boston");
		
		WebElement Ele2= driver.findElement(By.xpath("//select[@name='toPort']"));
		Select item2 = new Select(Ele2); 
		item2.selectByValue("London");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(5000);
		int NoOfRows= driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		 System.out.println(NoOfRows);
		 
		Double GreaterPrice=0.0;
		
		for(int i=1;i<=(NoOfRows-1);i++)
		{
		 String Price= driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]/td[6]")).getText();
		 
		String Price2= Price.replace("$", " ");
		 System.out.println(Price2);
		Double Price3= Double.parseDouble(Price2);
		 if (GreaterPrice<Price3)
		 {
			 GreaterPrice=Price3;
		 }
		
		}
		System.out.println(GreaterPrice);
		
		for(int i=1;i<=(NoOfRows-1);i++)
		{
		 String Price= driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]/td[6]")).getText();
		 String Price2= Price.replace("$", " ");
		 Double Price3= Double.parseDouble(Price2);
		 if (GreaterPrice.equals(Price3))
		 {
			 System.out.println("inside loop");
			 driver.findElement(By.xpath("//table[@class='table']//tr[\"+i+\"]/td[1]")).click();
			 break;
		 }
		}
		
		driver.findElement(By.id("inputName")).sendKeys("Shubham");
		driver.findElement(By.id("address")).sendKeys("memnagar");
		driver.findElement(By.id("city")).sendKeys("Ahmedabad");
		driver.findElement(By.name("state")).sendKeys("Gujrat");
		driver.findElement(By.name("zipCode")).sendKeys("12345");
		WebElement cardDrpdwn= driver.findElement(By.xpath("//select[@name='cardType']"));
		Select newDrpdwn = new Select(cardDrpdwn);
		newDrpdwn.selectByValue("dinersclub");
		driver.findElement(By.xpath("//input[@placeholder='John Smith']")).sendKeys("Shubham");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Boolean ele=driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).isDisplayed();
		System.out.println(ele);
		
		
	}
}
