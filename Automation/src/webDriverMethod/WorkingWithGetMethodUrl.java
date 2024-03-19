package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetMethodUrl {
public static void main(String[]args) {
	WebDriver driver=new ChromeDriver();
	 driver.get("https://paytm.com/");
	 driver.manage().window().maximize();
	 String source = driver.getPageSource();
	 System.out.println(source);
	 String actualUrl = driver.getCurrentUrl();
	 String expectedUrl = "https://paytm.com/";
	 if(actualUrl.equals(expectedUrl)) {
		 System.out.println ("TestCase is pass");
	 }else
		 System.out.println("TestCase is fail");
	 }
	 
}
	


