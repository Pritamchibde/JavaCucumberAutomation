package runner;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebBrowser {
	public static WebDriver driver = null;
	
   @Before
	public static void Initialize()
	{
		System.setProperty("webdriver.ie.driver","C:\\Driver\\IEDriverServer.exe");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("nativeEvents", false);
		caps.setCapability("ensureCleanSession",true);
		driver=new InternetExplorerDriver(caps);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().setScriptTimeout(60000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(60000, TimeUnit.MILLISECONDS);
		}
	
   @After
	public static void TearDown()
	{
		driver.quit();
	}
	
	
}
