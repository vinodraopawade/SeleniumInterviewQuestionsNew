package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://orangehrm.com/orangehrm-30-day-trial/");
		
		//Approach 1
		
	/*	Select numberofempdrop=new Select(driver.findElement(By.name("NoOfEmployees")));
		numberofempdrop.selectByVisibleText("16 - 20");
		
		Select Industrydrop=new Select(driver.findElement(By.name("Industry")));
		Industrydrop.selectByVisibleText("Education");

		
		Select CountryDrop=new Select(driver.findElement(By.name("Country")));
		CountryDrop.selectByVisibleText("Aruba");*/
		
		//Approach 2
		
		WebElement noOfEmplys=driver.findElement(By.name("NoOfEmployees"));
		selectOptionFromDropDown(noOfEmplys,"16 - 20");
		
		WebElement Industrydrop=driver.findElement(By.name("Industry"));
		selectOptionFromDropDown(Industrydrop, "Healthcare");
		
		WebElement CountryDrop=driver.findElement(By.name("Country"));
		selectOptionFromDropDown(CountryDrop, "Aruba");
	}
	
	public static void selectOptionFromDropDown(WebElement ele, String value)
	{
		Select drp=new Select(ele);
		List<WebElement>alloptions=drp.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("value"))
			{
				option.click();
				break;
	}
}
	}
}
	