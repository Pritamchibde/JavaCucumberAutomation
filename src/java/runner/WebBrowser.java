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
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
capabilities.setCapability(enableNativeEvents);
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
		capabilities.setCapability(InternetExplorerDriver.
				INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		capabilities.setCapability(capabilities.);


		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");

		//it is used to initialize the IE driver
		WebDriver driver = new InternetExplorerDriver(capabilities);

		driver.manage().window().maximize();

		driver.get("http://gmail.com");



		InternetExplorerOptions options= new InternetExplorerOptions();
		options.enableNativeEvents(0);
		options.enableNativeEvents()=false;
		options.ignoreZoomSettings()=true;
		 System.setProperty("webdriver.ie.driver","C:\\Driver\\IEDriverServer.exe");

		 driver=new InternetExplorerDriver();
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
