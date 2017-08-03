package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.Global;
import runner.WebBrowser;

public class TicketShalaSteps extends Global {

    WebDriver driver = WebBrowser.driver;

    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String url) throws Throwable {
        driver.navigate().to(url);
    }

    @When("^I click on Hotels$")
    public void iClickOnHotels() throws Throwable {
        driver.findElement(By.xpath("//p[text()=' Hotels ']")).click();
    }

    @And("^Select destination \"([^\"]*)\"$")
    public void selectDestination(String arg0) throws Throwable {
        java.util.Date date=new java.util.Date();
    }

    @And("^Select future start date and end date$")
    public void selectFutureStartDateAndEndDate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Select \"([^\"]*)\" rooms and \"([^\"]*)\" guests$")
    public void selectRoomsAndGuests(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Click on Search$")
    public void clickOnSearch() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
