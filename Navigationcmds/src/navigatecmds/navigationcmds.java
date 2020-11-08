package navigatecmds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigationcmds {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Testing\\geckodriver 26\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		//Navigation
		driver.navigate().to("https://www.target.com/");
		
		//Navigate Back
		driver.navigate().back();
		
		//Navigate Forward
		driver.navigate().forward();
		
		//Navigate Refresh
		driver.navigate().refresh();
		// TODO Auto-generated method stub

	}

}
