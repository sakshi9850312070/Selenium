package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassName {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		   
		driver.get("https://affiliate.flipkart.com/login");
		
		WebElement email = driver.findElement(By.className("form-control"));
		
		email.sendKeys("Abcd@123");
		
		WebElement pass = driver.findElement(By.id("inputPassword"));
		
		pass.sendKeys("12345678");
		
		WebElement pass1=driver.findElement(By.id("submitLogin"));
		pass1.click();

	}

}
