package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Get_Method {
	
  public static void main (String [] args) {
	
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.airvistara.com/");
	  
	  
	  String actual_title=driver.getTitle();
	  
	  
	  String expected_title="Book Flights & Check In Online | Vistara";

	  if(actual_title.equals(expected_title))
	  {
		  System.out.println("TestCase is pass");
	  }
	  else
	  {
		  System.out.println("TestCase is fail");
	  }
		  
	  }
	  
	  
  }
	  
 