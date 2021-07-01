package pages;

public class BrowserPage extends BasePage {

    public BrowserPage() {
        super(driver);
    }


    public void navigateBrowser() {
        navigateTo("https://demoqa.com/automation-practice-form");
    }


}
