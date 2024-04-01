package JavascriptExecuter;

import java.time.Duration;
import java.util.List;

import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class WorkingWithSwagLag {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();

		    driver.manage().window().maximize();

		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
		    driver.get("https://www.Saucedemo.com/");
		    
		    driver.findElement(By.name("user-name")).sendKeys("standard_user");
		    
		    driver.findElement(By.name("password")).sendKeys("secret_sauce");
		    
		     driver.findElement(By.xpath("//input [@id='login-button']")).click();
		   
             driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
          
             Thread.sleep(2000);
          
             driver.findElement(By.id("add_to_cart")).click();
          
             driver.findElement(By.id("shopping_cart_container")).click();
          
            WebElement Verify = driver.findElement(By.xpath("//div[@data-test='inventory-item-price']"));
         
            String actualprice = Verify.getText();
         
            System.out.println(actualprice);
         
            String expectedprice = "$29.99";
        
         if(actualprice.equals(expectedprice)) {
        	 
        	 System.out.println("correct price");
        	 
         }else {
        	 
        	 System.out.println("wrong price");
    	 
         }
         
         driver.findElement(By.name("checkout")).click();
         
         driver.findElement(By.id("first_name")).sendKeys("abc",Keys.TAB);
         
         driver.findElement(By.id("last_name")).sendKeys("xyz",Keys.TAB);
         
         driver.findElement(By.id("postal-code")).sendKeys("123456",Keys.TAB);
         
         driver.findElement(By.id("continue")).click();
         
         driver.findElement(By.id("finish")).click();
         
          
		    
		   
         
         
		 // WebElement Backpack= driver.findElement(By.xpath("//div[@class='inventory_item_name']")).sendKeys(""
		 
          
          

			
			
}
}
