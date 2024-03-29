package JavascriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDemoApp {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();

		    driver.manage().window().maximize();

		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
		    driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		    
		    driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		    
		    Thread.sleep(2000);
		 
		    
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    
		    js.executeScript("document.getElementById('email').value='sakshidarekar0@gamil.com';");
		    js.executeScript("document.getElementById('name').value='sakshi';");
		    js.executeScript("document.getElementById('password').value='9850312070';");
		    
		    
		    
		    


	}

}
