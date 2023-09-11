package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ProjectsListPage extends BasePage {
    private final By testmoProjectsTitleLocator = By.xpath("//*[@class='page-title__title']");
    private final By popUpLocator = By.xpath("//*[@class='popup__border']");
    private final By addProjectButtonLocator = By.xpath("//*[@class='ui basic compact button']");
    private final By dialogWindowLocator = By.xpath("//*[@class='dialog']");
    private final By uploadImageWindowLocator = By.xpath("//*[@class='admin-projects-dialog-avatar__action']");
    private final By uploadImageDialogLocator = By.xpath("//*[@class='dialog dialog--basic dialog--compact']");
    private final By projectImageLocator = By.xpath("//*[@class='admin-projects-dialog-avatar__avatar']/descendant::img");
    private final By fileUploadLocator = By.xpath("//input[@type='file']");

    public ProjectsListPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return testmoProjectsTitleLocator;
    }

    public WebElement getPopUpLocator() {
        return $(popUpLocator);
    }

    public WebElement getAddProjectButtonLocator() {
        return $(addProjectButtonLocator);
    }

    public WebElement getDialogWindowLocator() {
        return $(dialogWindowLocator);
    }

    public WebElement getUploadImageWindowLocator() {
        return $(uploadImageWindowLocator);
    }

    public WebElement getProjectImageLocator() {
        return $(projectImageLocator);
    }

    public boolean isPopUpDisplayed() {
        return $(popUpLocator).shouldBe(visible).isDisplayed();
    }

    public WebElement getFileUploadLocator() {
        return $(fileUploadLocator);
    }

    public void addProjectButtonClick() {
        getAddProjectButtonLocator().click();
    }

    public void uploadImage(String pathToFile) {
        getUploadImageWindowLocator().click();
        getFileUploadLocator().sendKeys(pathToFile);
        synchronized (getWebDriver()) {
            try {
                getWebDriver().wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean checkSuccessUpload() {
        return getProjectImageLocator().getAttribute("src").contains("attachments");
    }
}