package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithBlaze {
	
	public static void main(String[] args) throws InterruptedException {
		
		
       WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        driver.get("https://www.demoblaze.com/");
        
        driver.findElement(By.id("login2")).click();
        
        driver.findElement(By.id("loginusername")).sendKeys("SakshiD");
        
        driver.findElement(By.id("loginpassword")).sendKeys("Amol12345");
        
       driver.findElement(By.xpath("//button[text()='Log in']")).click();
       
       Thread.sleep(30000);
       
       driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
       
	 driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
       
       
       Thread.sleep(3000);
       
       Alert alt = driver.switchTo().alert();
       
       alt.accept();
       
       driver.findElement(By.xpath("//a[text()='Home ']")).click();
       
		 driver.findElement(By.xpath("//img[@src='imgs/iphone_6.jpg']")).click();
		 
		 driver.findElement(By.xpath("//a[@onclick='addToCart(5)']")).click();
		 Thread.sleep(3000);
		 
       Alert alt1=driver.switchTo().alert();
       
		 alt1.accept();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@id='cartur']")).click();
		 driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		 
		 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sakshi");
		 driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		 driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Nashik");
		 driver.findElement(By.xpath("//input[@id='card']")).sendKeys("nhyutreduiolkjhtf");
		 driver.findElement(By.xpath("//input[@id='month']")).sendKeys("April");
		 driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2024");
		 
		 driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary']")).click();
    		   
    
	}

}
