package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WorkingWithnetflix {
	public static void main(String[] args) {

	      WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.netflix.com/in");
		driver.findElement(By.xpath("//a[@id='signIn']")).click();
			
		 
		 driver.get("https://www.netflix.com/login");
		 driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("sakshidarekar0@gmail.com");
		 
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sakshi98");	
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
				
		 
	}