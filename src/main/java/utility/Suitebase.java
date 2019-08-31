package utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import configuration.PropReader;

public class Suitebase {
	
	PropReader pr = new PropReader();
	public static WebDriver driver;
	public static Logger log =Logger.getLogger("SuiteBase");
	
	
	@BeforeTest
	public void browserLaunch() throws IOException{
		try {
			String broswer = pr.getPropertyValue("browser");
			if(broswer.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			else if(broswer.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.driver",".\\Drivers\\geckodrover.exe");
				driver = new FirefoxDriver();
			}
			else if (broswer.equalsIgnoreCase("IE")){
				System.setProperty("webdriver.ie.driver", ".\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else{
				log.info("No valid browser");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(pr.getPropertyValue("url"));
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
	}
	
	
	
	
	
	
	
	

}
