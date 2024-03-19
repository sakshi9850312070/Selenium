package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMyntra {
	
	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("jens",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@class='common-checkboxIndicator']")).click();
		
		driver.findElement(By.xpath("//div[@class='common-checkboxIndicator']")).click();
		
	   
	   
	   driver.findElement(By.xpath("//label[@class='common-customCheckbox vertical-filters-label']")).click();
	   
	   driver.findElement(By.xpath("//label[@data-count='9028']")).click();
	   
	   driver.findElement(By.xpath("//label[@class='common-customCheckbox']")).click();
	   
	
		
		
}
}
