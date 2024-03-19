package webDriverMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Current_Url {
	
	 public static void main (String [] args) {
		 
   WebDriver driver=new ChromeDriver();
   driver.get("https://paytm.com/"); 
   driver.manage().window().maximize();
   
   String source = driver.getPageSource();
   System.out.println(source);
   
   String actualUrl=driver.getCurrentUrl();
   String expectedUrl="https://paytm.com/";
   if(actualUrl.equals(expectedUrl))
   {
	   System.out.println("TestCase is pass");
   }
   else
   {
	   System.out.println("TestCase is fail");
   }
	
		 
		 String actual_title=driver.getTitle();
		 
		 String epected_title= "Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";
		 
		 if(actual_title.equals(epected_title)) {
			 
			 System.out.println("TestCase is pass");
		 }
		 else 
		 {
			 
			 System.out.println("TestCase is fail");
			 	 
		 }  
		 driver.close();
		 
	 }

}
