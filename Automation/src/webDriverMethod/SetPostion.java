package webDriverMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPostion {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		Point point = new Point (250,250);
		
		driver.manage().window().setPosition(point);
		
		driver.get("http://www.google.com");
					
	}

}
