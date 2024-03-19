package MutliselectDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import xpath.WebElement;

public class WorkingWithAssignment {
	
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
	
	driver.findElement(By.className("ico-login")).click();
	
	
	driver.findElement(By.id("Email")).sendKeys("sakshidarekar0@gmail.com",Keys.ENTER);
	
	driver.findElement(By.id("Password")).sendKeys("sakshi@123",Keys.ENTER);
	
	driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[contains(text(),'Books')]")).click();
	
	driver.findElement(By.xpath("//input[@type='button']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()='Health Book'   ]/ancestor::div[@class='description']")).clear();
	
	driver.findElement(By.xpath("//a[text()='Health Book']/ancestor::div[@class='product-item']/descendant::input[@value='Add to cart']")).click();
	
	driver.findElement(By.linkText("shooping cart")).click();

	org.openqa.selenium.WebElement dropdowm = driver.findElement(By.id("CountryId"));
	

	}

}
