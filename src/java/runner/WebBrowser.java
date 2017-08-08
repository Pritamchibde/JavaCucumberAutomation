package runner;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class WebBrowser {
    public static WebDriver driver = null;

    @Before
    public static void Initialize() {
        //InternetExplorerDriver
        System.setProperty("webdriver.ie.driver", "C:\\Driver\\IEDriverServer.exe");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("nativeEvents", false);
        caps.setCapability("ensureCleanSession", true);
        driver = new InternetExplorerDriver(caps);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().setScriptTimeout(60000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(60000, TimeUnit.MILLISECONDS);

//        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
//        System.out.println("Test");
//        ChromeOptions options = new ChromeOptions();
//        System.out.println("Test1");
//        options.addArguments("test-type");
//        options.addArguments("start-maximized");
//        options.addArguments("--enable-automation");
//        options.addArguments("--js-flags=--expose-gc");
//        options.addArguments("--enable-precise-memory-info");
//        options.addArguments("test-type=browser");
//        options.addArguments("disable-infobars");
//        System.out.println("Test3");
//        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        System.out.println("Test4");
//        System.out.println(driver);
//        driver.navigate().to("www.google.com");
//        System.out.println("Test5");

        ////FirefoxDriver
        //System.setProperty("webdriver.firefox.marionette","C:\\Driver\\geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.navigate().to("www.google.com");
    }

    @After
    public static void TearDown() {
        driver.quit();
    }


}
