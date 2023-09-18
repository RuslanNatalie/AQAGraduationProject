package pages;

import baseEntities.BasePage;
import configuration.ReadProperties;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class TestmoAuthPage extends BasePage {

    private final By testmoAuthLogoLocator = By.xpath("//*[@class='auth-form-frame__logo']");
    private final By testmoLogintButtonLocator = By.xpath("//*[@class='ui primary button']");
    private final By testmoEmailLocator = By.xpath("//input[@placeholder='Email']");
    private final By testmoPasswordLocator = By.xpath("//input[@placeholder='Password']");
    private final By testmoCheckBoxLocator = By.xpath("//*[@class='ui checkbox checked']");
    public TestmoAuthPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return testmoAuthLogoLocator;
    }

    public WebElement getTestmoEmailFieldLocator() {
        return $(testmoEmailLocator);
    }

    public WebElement getTestmoPasswordFieldLocator() {
        return $(testmoPasswordLocator);
    }

    public WebElement getTestmoLogintButtonLocator() {
        return $(testmoLogintButtonLocator);
    }

    public WebElement getTestmoCheckBoxLocator() {
        return $(testmoCheckBoxLocator);
    }

    public void insertTestmoLoginAndPassword(User user) {
        getTestmoEmailFieldLocator().sendKeys(user.getLogin());
        getTestmoPasswordFieldLocator().sendKeys(user.getPassword());
    }

    public void loginButtonClick() {
        getTestmoLogintButtonLocator().click();
    }

    public void disableCheckBox() {
        if (getTestmoCheckBoxLocator().isSelected() == false) {
            getTestmoCheckBoxLocator().click();
        }
    }
}