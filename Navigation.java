package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
			
		driver.get("http://www.snapdeal.com");
		//driver.get("http://www.amazon.com");
		
		driver.navigate().to("http://www.amazon.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().back(); //snapdeal
		driver.navigate().forward();//amazon
		
		driver.navigate().refresh(); //refresh or reload page
	}

}
