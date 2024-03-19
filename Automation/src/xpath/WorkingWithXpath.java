package xpath;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpath {
	
	public static void main(String[] args) {
		
	      WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 driver.findElement(By.xpath("html/body/d	iv/div/div/div/div/ul/li[2]/a")).click(); 
		
	}

}
