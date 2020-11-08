package mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class XYZTest {
	
	  WebDriver driver;
	  
	  
	  @BeforeMethod
	  public void launchurl()
	  {
	   System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Chromedriver 83\\chromedriver_win32\\chromedriver.exe"); 
	  }
	  
	  
	  
	  @Test
	  public void geturl()
	  {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	   System.out.println("welcome to amazon webpage");
	  }
	
}
