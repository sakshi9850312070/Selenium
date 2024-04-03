package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithConfirm {
	
	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		
		//click on alert box button
		
		driver.findElement(By.id("buttonAlert5")).click();
		
		Alert alt = driver.switchTo().alert();
		
		
     	Thread.sleep(3000);
     	alt.dismiss();
     
		
	}

}
