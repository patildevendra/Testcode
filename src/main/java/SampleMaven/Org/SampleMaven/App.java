package SampleMaven.Org.SampleMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class App 
{ 
	WebDriver wd=null;

	
	@Test
	void Method1()    
    {      System.out.println(Thread.currentThread().getId());
       	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing Project\\Selenium\\BrowserDriver\\chromedriver.exe");
         wd = new ChromeDriver();
         wd.get("https://www.amazon.in/");     
         wd.close();
    }
    
    @Test
	void Method2() {
    	System.out.println(Thread.currentThread().getId());
      	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing Project\\Selenium\\BrowserDriver\\chromedriver.exe");
        wd = new ChromeDriver();
        wd.get("https://www.flipkart.com/"); 
		wd.close();
	}
	
}
