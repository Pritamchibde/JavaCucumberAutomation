package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import runner.WebBrowser;

public class FaceBookPage {

    private WebDriver driver = WebBrowser.driver;
    public FaceBookPage() { PageFactory.initElements(driver, this); }

   @FindBy(how = How.ID, using = "email")
    public WebElement UserName;

    @FindBy(how = How.ID, using = "pass")
    public WebElement PassWord ;

    @FindBy(how = How.ID, using = "loginbutton")
    public WebElement LoginBTN ;

    @FindBy(how = How.XPATH, using = "//span[text()='Create a Post']")
    public WebElement CreatePostBTN ;

    @FindBy(how = How.XPATH, using = "//div[@class='_1mf _1mj']/span/br/parent::span")
    public WebElement PostTextBox ;

    @FindBy(how = How.XPATH, using = "//span[text()='Post']/parent::button")
    public WebElement PostBTN ;

    @FindBy(how = How.XPATH, using = "//p[text()='Hello World!!']")
    public WebElement Message_PostTextBox ;
}
