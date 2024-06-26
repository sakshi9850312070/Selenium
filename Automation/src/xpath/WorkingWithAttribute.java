package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAttribute {
	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com/");
		 
		 driver.switchTo().activeElement().sendKeys("Phoebe Buffay",Keys.ENTER);
		 
		 driver.findElement(By.xpath("//canvas[@class='lNPNe']")).click();
		 
	}

}
