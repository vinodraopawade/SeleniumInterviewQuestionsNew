package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.bing.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.id("sb_form_q"));
		searchbox.sendKeys("selenium");
		
	List<WebElement>list=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
	
	System.out.println("Size of Auto suggestion:"+list.size());
	
	for(WebElement listitem:list)
	{
		if(listitem.getText().contains("download"))
		{
			listitem.click();
			break;
			
		}
	}
		

	}

}
