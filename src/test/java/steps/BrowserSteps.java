package steps;

import io.cucumber.java.en.Given;
import pages.BrowserPage;

public class BrowserSteps {

    BrowserPage browser = new BrowserPage();

    @Given("^I open automation practice form$")
    public void navigate() {
        browser.navigateBrowser();

    }



}