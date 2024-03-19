package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithNukri {
	
	public static void main(String[] args) {
		
		   WebDriver driver=new ChromeDriver();
		 
	    	driver.manage().window().maximize();
	    	
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    	
	    	driver.get("http://www.naukri.com");
	    	
	    	driver.findElement(By.id("register_Layer")).click();
	    	
	    	driver.findElement(By.xpath("//input[@class='formInput mandatory __input']")).sendKeys("Sakshi");
	    	
	    	
	    	driver.findElement(By.id("email")).sendKeys("sakshidarekar0@gmail.com");
	    	
	    	driver.findElement(By.id("password")).sendKeys("Sakshi@123");
	    	
	    	driver.findElement(By.id("mobile")).sendKeys("9545271374");
	    	
	    	driver.findElement(By.xpath("(//div[@tabindex='0'])[2]")).click();
	    	
	    	driver.findElement(By.xpath("//span[text()='Pune']")).click();

			//click on check box
			driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']")).click();
			
			//click on register
			driver.findElement(By.xpath("//button[text()='Register now']")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			//enter email
			driver.findElement(By.id("usernameField")).sendKeys("sakshi@gmail.com");
			//Enter pwd
			driver.findElement(By.id("passwordField")).sendKeys("Sakshu");
			//click on login button
			driver.findElement(By.xpath("//button[text()='Login']")).click();
				
		 
		 
		
		
	}

}
