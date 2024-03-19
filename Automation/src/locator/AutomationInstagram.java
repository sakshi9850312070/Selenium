package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationInstagram {
	
	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.instagram.com/");
		 
		 WebElement stf = driver.findElement(By.name("username"));
		 
		 stf.sendKeys("ms_sakshiii_07");
		 
		 WebElement stf2 = driver.findElement(By.name("password"));
	
		 stf2.sendKeys("9777777");
		  //driver.findElement(By.className("_acap"));
		  	 
		 
	}

}
