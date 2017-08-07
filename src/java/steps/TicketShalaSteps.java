package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.Extension;
import runner.Global;
import runner.WebBrowser;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TicketShalaSteps extends Global {

    WebDriver driver = WebBrowser.driver;
    Extension extension = new Extension();

    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String url) throws Throwable {
        extension.NavigateToUrl(url);
    }

    @When("^I click on Hotels$")
    public void iClickOnHotels() throws Throwable {
        extension.Click(By.xpath("//p[text()=' Hotels ']"));
    }

    @And("^Select destination \"([^\"]*)\"$")
    public void selectDestination(String arg0) throws Throwable {
        extension.SendKeys(By.id("hotelsearch"), "Malaysia");
        extension.Click(By.xpath("//ul/li/a/strong[text()='Malaysia']"));
    }

    @And("^Select future start date and end date$")
    public void selectFutureStartDateAndEndDate() throws Throwable {
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        String CheckIn = ft.format(cal.getTime());
        cal.add(Calendar.DATE, 3);
        String CheckOut = ft.format(cal.getTime());
        extension.SendKeys(By.id("checkin"),CheckIn);
        extension.SendKeys(By.id("checkout"),CheckOut);
    }

    @And("^Select \"([^\"]*)\" rooms and \"([^\"]*)\" guests$")
    public void selectRoomsAndGuests(String arg0, String arg1) throws Throwable {
        extension.SelectElementByText(By.id("room"),"2 Rooms");
        extension.SelectElementByText(By.id("room"),"4 Guests");
    }

    @And("^Click on Search$")
    public void clickOnSearch() throws Throwable {
       extension.Click(By.xpath("//button[contains(text(),'Search')]"));
    }

}
