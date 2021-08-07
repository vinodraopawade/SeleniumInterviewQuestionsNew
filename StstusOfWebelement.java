package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public
class StstusOfWebelement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://frontend.nopcommerce.com/");
		driver.manage().window().maximize();
		
	/*	WebElement searchstore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println("Display staus:"+searchstore.isDisplayed());
		System.out.println("Display staus:"+searchstore.isEnabled());
		
		//isSelected
     	WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
     	WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		
		System.out.println(male.isSelected()); //false
	    System.out.println(female.isSelected()); //false
	    
	    male.click();
	    System.out.println(male.isSelected()); //true
	    System.out.println(female.isSelected()); //false
	    
	    female.click();
	    System.out.println(male.isSelected()); //true
	    System.out.println(female.isSelected()); //true */
	    
	}

}
