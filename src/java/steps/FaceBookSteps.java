package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import runner.Extension;
import runner.Global;
import runner.WebBrowser;

public class FaceBookSteps extends Global {

    WebDriver driver = WebBrowser.driver;
    Extension extension = new Extension();

    @Given("^I login to facebook account$")
    public void iLoginToFacebookAccount() throws Throwable {
        extension.NavigateToUrl(FaceBookUrl);
        extension.SendKeys(By.id("email"),Username);
        extension.SendKeys(By.id("pass"),Password);
        extension.Click(By.id("loginbutton"));
    }

    @When("^I post a message on the wall$")
    public void iPostAMessageOnTheWall() throws Throwable {
        extension.Click(By.xpath("//span[text()='Create a Post']"));
        extension.SendKeys(By.name("xhpc_message"),"Hello World!!");
        extension.Click(By.xpath("//span[text()='Post']/parent::button"));
    }

    @Then("^The message should be displayed on the wall$")
    public void theMessageShouldBeDisplayedOnTheWall() throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Hello World!!']")).isDisplayed());
    }
}
