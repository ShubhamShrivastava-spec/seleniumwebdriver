package FirstDay;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationTest {

	public static void main(String[] args) {
		
            // ChromeDriver driver = new ChromeDriver();
             WebDriver driver = new ChromeDriver();
             
             // To open any url we use get method
             
           //  driver.get("https://demo.opencart.com/");
             
            // To get the title of a page we use getTitle method
             
         //  String act_title=  driver.getTitle();
           
           // To validate use .equals method
       /*    if (act_title.equals("Your Store"))
           {
        	   System.out.println("Test case Passed");
           }
           else
           {
        	   System.out.println("Test case Failed");
           }
           */
           // At the end of program alwayse quit driver object by close method or quit method
           
        //   driver.close();
         //  driver.quit();
          
            
	}

}
