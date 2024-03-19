package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateVistara {
 public static void main(String[] args) throws InterruptedException {
	 
	 
	 WebDriver driver=new ChromeDriver();
	 
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	 
	 driver.get("https://www.airvistara.com/in/en");
	 
		WebElement from=driver.findElement(By.name("flightSearchFrom"));
		from.click();
		from.sendKeys("Pune",Keys.ENTER);
		
		
		//click on destination location
		WebElement to=driver.findElement(By.name("flightSearchTo"));
		to.click();
		to.sendKeys("Delhi",Keys.ENTER);
		
		driver.findElement(By.id("acceptAllBtn")).click();
		
		
		
		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
		
		
		
		driver.findElement(By.xpath("//a[text()='7']")).click();
		
	
		
		driver.findElement(By.xpath("//a[text()='24']")).click();
		
		
		
		
		
		
		driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
		
		
		
		
					
		
}
}