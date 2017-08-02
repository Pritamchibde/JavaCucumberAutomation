package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import runner.Global;
import runner.WebBrowser;
import Pages.FaceBookPage;

public class FaceBookSteps extends Global{

    WebDriver driver = WebBrowser.driver;
    FaceBookPage faceBookPage = new FaceBookPage();

    @Given("^I login to facebook account$")
    public void iLoginToFacebookAccount() throws Throwable {
        driver.navigate().to(FaceBookUrl);
        Thread.sleep(1000);
        faceBookPage.UserName.clear();
        faceBookPage.UserName.sendKeys(Username);
        faceBookPage.PassWord.clear();
        Thread.sleep(1000);
        faceBookPage.PassWord.sendKeys(Password);
        faceBookPage.LoginBTN.click();
        Thread.sleep(6000);
    }

    @When("^I post a message on the wall$")
    public void iPostAMessageOnTheWall() throws Throwable {
        Thread.sleep(1000);
        faceBookPage.CreatePostBTN.click();
        Thread.sleep(1000);
        faceBookPage.PostTextBox.sendKeys("Hello World!!");
        Thread.sleep(1000);
        faceBookPage.PostBTN.click();
    }

    @Then("^The message should be displayed on the wall$")
    public void theMessageShouldBeDisplayedOnTheWall() throws Throwable {
        Assert.assertTrue(faceBookPage.Message_PostTextBox.isDisplayed());
    }
}
