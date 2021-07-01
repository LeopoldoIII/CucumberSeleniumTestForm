package steps;

import cucumber.api.java.en.*;
import org.junit.Assert;
import pages.BasePage;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GenericSteps extends BasePage {

    public GenericSteps() {
        super(driver);
    }

    @And("I click on {string} button")
    public void iClickOnButton(String text) {
        clickElement(String.format("//button[contains(text(),'%s')]", text));
    }

    @And("I select {string} from dropDown menu")
    public void iSelectOnDropDownMenu(String text) {
        selectDropDownByText(text);
    }

    @And("I insert {string} on field {string}")
    public void iInsertOnField(String text, String locator) {
        write(String.format("//input[@placeholder='%s']", locator), text);
    }


    @When("I click on {string} radio button")
    public void iClickOnRadio(String arg0) {
        clickElement(String.format("//div[contains(@class,'custom-control')][contains(., '%s')]", arg0));
    }

    @And("I click on {string} checkbox")
    public void iClickOnCheckbox(String arg0) {
        clickElement(String.format("//div[contains(@class,'custom-checkbox')][contains(., '%s')]", arg0));
    }

    @And("I upload file")
    public void iUploadFile() throws URISyntaxException {
        // String file = null;
        URL url = getClass().getClassLoader().getResource("src/resources/file.jpg");
        URI uri = url.toURI();
        java.io.File file = new File(uri);
        String path = file.getAbsolutePath();
        uploadFile("//input[contains(@class,'form-control-file')]", path);
    }

    @Then("I verify {string}")
    public void iVerify(String arg0) {
        Assert.assertEquals(arg0,textFromElement("//div[contains(@class,'modal-title h4')]"));
        //div[contains(@class,'modal-title h4')][text()='Thanks for submitting the form']
    }
}
