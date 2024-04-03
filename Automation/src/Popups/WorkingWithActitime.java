package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithActitime {
	
	public static void main(String[] args) {
		
 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		
		 driver.get("http://127.0.0.1/login.do;jsessionid=1araiffn4cbel");
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		 
		 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		 
		driver.findElement(By.xpath("//td[@class='navItem relative']")).click();
		
}}
