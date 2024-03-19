package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElement {
	
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 
	
		
 driver.manage().window().maximize();
		 
		 driver.get("https://Flipkart.com");
		 
		 driver.findElement(By.name("q")).sendKeys("ipad",Keys.ENTER);
		
		
		List<WebElement>ipadName =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		
		
	
		for(WebElement name:ipadName)
		{
			System.out.println(name.getText());
	}
		
	}
}


