package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsgetAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
	WebElement Username=driver.findElement(By.id("Email"));
	Username.clear();
	
	Thread.sleep(3000);
	Username.sendKeys("admin@yourstore.com");
	
	//capturing text from inputbox
	
	System.out.println("Result from getAttribute:"+Username.getAttribute("value"));
	
	System.out.println("Result from getText:"+Username.getText());
	
	
    WebElement login=driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 login-button']"));
	//login.click();
	
     System.out.println("Result from getAttribute:"+login.getAttribute("type"));
     System.out.println("Result from getAttribute:"+login.getAttribute("class"));
	
	System.out.println("Result from getText:"+login.getText());
	
	
	String title=driver.findElement(By.xpath("//div[@class='page login-page']//h1")).getText();
	System.out.println(title);
	}
	
	}
