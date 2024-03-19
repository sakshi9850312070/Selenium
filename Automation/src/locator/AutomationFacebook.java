package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationFacebook {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		WebElement stf = driver.findElement(By.name("firstname"));
		stf.sendKeys("Sakshi");
		
		WebElement stf1 = driver.findElement(By.name("lastname"));
		stf1.sendKeys("Darekar");
		
		WebElement stf3=driver.findElement(By.name("reg_email__"));
		stf3.sendKeys("sakshidarekar0@gmail.com");
		
		WebElement stfB=driver.findElement(By.name("reg_email_confirmation__"));
		stfB.sendKeys("sakshidarekar0@gmail.com");
		
		
		WebElement stf4=driver.findElement(By.name("reg_passwd__"));
		stf4.sendKeys("Sakshi");
		
		WebElement stf5=driver.findElement(By.id("month"));
		stf5.sendKeys("apr");
		WebElement stf6=driver.findElement(By.id("day"));
		stf6.sendKeys("7");
		WebElement stf7=driver.findElement(By.id("year"));
		stf7.sendKeys("2003");
		
		
		WebElement stf8=driver.findElement(By.cssSelector("input[value='1']"));
		stf8.click();
		
		WebElement stfA=driver.findElement(By.name("websubmit"));
		stfA.click();
				
	}

}
