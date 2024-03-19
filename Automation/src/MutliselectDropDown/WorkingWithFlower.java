package MutliselectDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFlower {
	
	public static void main(String[] args) {
		
 WebDriver driver=new ChromeDriver();
		 
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("///C:/Users/DELL/Documents/flower.html");
		 
		 driver.findElement(By.id("flower"));
		 
		
		 
		 
		 
	}

}
