package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
	WebElement dropcountryele=driver.findElement(By.id("input-country"));
	
	Select dropcountry=new Select(dropcountryele);
	//dropcountry.selectByVisibleText("Denmark");
	dropcountry.selectByValue("12");
	//dropcountry.selectByIndex(13);
	
	//Selecting option dropdown without using method
	List<WebElement>alloptions=dropcountry.getOptions();
	
	for(WebElement option:alloptions){
		if(option.getText().equals("Cuba")){
			option.click();
			break;
		}
	}
	
	
	

	}

}
