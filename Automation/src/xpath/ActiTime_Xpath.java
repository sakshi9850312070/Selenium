package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		
		 driver.get("http://127.0.0.1/login.do;jsessionid=1araiffn4cbel");
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		 
		 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		 
		 
		 driver.findElement(By.xpath("//a[@class='content users']")).click();
		 
		 driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Aishuu");
		 
		 
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aishu");
		 
		 driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("Aishu");
		 
		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("sakshi");
		 
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Darekar");
		 
		 driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9545271374");
		 
		 driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("88888888");
		 
		driver.findElement(By.xpath("//input[@type='submit' and @value='   Create User   ']")).click();
		 
		 driver.findElement(By.xpath("//a[@class='logout']")).click();
	}
	
	

}
