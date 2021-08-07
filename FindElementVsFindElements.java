package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
   
		driver.get("http://frontend.nopcommerce.com/");
		
		//FindElement
		
		Thread.sleep(3000);
		 WebElement searchbox= driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
     	searchbox.sendKeys("xyz");
	
		
        	WebElement ele=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
	        System.out.println(ele.getText());
	        
	        //findElements
	        
	       List< WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
	       System.out.println("Number of element captured:"+links.size());
	}

}
