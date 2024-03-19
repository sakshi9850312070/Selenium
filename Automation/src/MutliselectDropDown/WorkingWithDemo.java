package MutliselectDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDemo {

	
	public static void main(String[] args) throws InterruptedException {
		

WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
	  driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	
	  driver.findElement(By.id("phone")).sendKeys("9545271374");
	 
	  driver.findElement(By.id("select2"));
		
		driver.findElement(By.id("option12")).click();
		
		driver.findElement(By.id("select3")).click();
		
		driver.findElement(By.id("countryOpt6")).click();
		
		driver.findElement(By.id("select5")).click();
		
		driver.findElement(By.id("StateOpt22")).click();
		
		driver.findElement(By.xpath("//label[text()='City']")).click();
	  
		driver.findElement(By.id("CityOpt2")).click();
		
		WebElement selectquantity=driver.findElement(By.xpath("//select[@id='select7']"));
		    
		    Select s = new Select(selectquantity);
		    
		    for(int i=0;i<5;i++) {
		    	s.selectByIndex(i);
		     	Thread.sleep(1000);
		    }
	  
	  
	
	  
		
	}
}
