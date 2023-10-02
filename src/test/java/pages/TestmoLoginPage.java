package pages;

import baseEntities.BasePage;
import configuration.ReadProperties;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class TestmoLoginPage extends BasePage {

    private final By testmoAccountButtonLocator = By.xpath("//*[@class='login-choice__selection__option']");
    private final By testmoAccountEmailFieldLocator = By.xpath("//*[@class='input']");
    private final By testmoGOButtonLocator = By.xpath("//*[@class='button is-success']");

    public TestmoLoginPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return testmoAccountButtonLocator;
    }

    public WebElement getTestmoAccountButtonLocatorButton() {
        return $(testmoAccountButtonLocator);
    }

    public WebElement getTestmoAccountEmailFieldLocator() {
        return $(testmoAccountEmailFieldLocator);
    }

    public WebElement getTestmoGOButtonLocator() {
        return $(testmoGOButtonLocator);
    }

    @Step("click on area login button")
    public void loginAccountAreaClick() {
        getTestmoAccountButtonLocatorButton().click();
    }

    @Step("insert testmo account")
    public void insertTestmoAccount(String testmoAccount) {
        getTestmoAccountEmailFieldLocator().sendKeys(testmoAccount);
    }

    @Step("click on go button")
    public void goButtonClick() {
        getTestmoGOButtonLocator().click();
    }
}