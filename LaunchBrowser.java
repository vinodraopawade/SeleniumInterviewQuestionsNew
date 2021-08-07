package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		
		//Chrome Browser
		
	/* System.setProperty("webdriver.chrome.driver", "D:\\JBK PROGRAMS\\SeleniumInterviewQuestionsNew\\ChromeDriver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://frontend.nopcommerce.com/");*/
	 
	 
	//Firefox Browser
		
		/* System.setProperty("webdriver.gecko.driver", "D:\\JBK PROGRAMS\\SeleniumInterviewQuestionsNew\\FirefoxDriver\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("http://facebook.com/");  */
		 
		 
		 //***WebDriver Manager***//
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://frontend.nopcommerce.com/");
	System.out.println("Title of the webpage is:"+driver.getTitle());
	
	System.out.println("Current Url of the webpage is:"+driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	
		   
		
	//	WebDriverManager.firefoxdriver().setup();
	//	WebDriver driver=new FirefoxDriver();
	//	driver.get("http://frontend.nopcommerce.com/");
		

	}

}
