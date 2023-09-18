package pages;

import baseEntities.BasePage;
import models.create_project.Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ProjectsListPage extends BasePage {
    private final By testmoProjectsTitleLocator = By.xpath("//*[@class='page-title__title']");
    private final By popUpLocator = By.xpath("//*[@class='popup__border']");
    private final By addProjectButtonLocator = By.xpath("//*[@class='ui basic compact button']");
    private final By uploadImageWindowLocator = By.xpath("//*[@class='admin-projects-dialog-avatar__action']");
    private final By projectImageLocator = By.xpath("//*[@class='admin-projects-dialog-avatar__avatar']/descendant::img");
    private final By fileUploadLocator = By.xpath("//input[@type='file']");

    //create project locators
    private final By projectNameLocator = By.xpath("//input[@placeholder='Project name']");
    private final By projectSummaryLocator = By.xpath("//*[@data-target='note behavior--maxlength-counter.control']");
    private final By createProjectButtonLocator = By.xpath("//*[@class='ui button primary']");

    private final By createProjectDialogWindowLocator = By.xpath("//*[@class='dialog']");

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

    public WebElement getProjectNameLocator() {
        return $(projectNameLocator);
    }

    public WebElement getProjectSummaryLocator() {
        return $(projectSummaryLocator);
    }

    public WebElement getCreateProjectButtonLocator() {
        return $(createProjectButtonLocator);
    }

    public WebElement getCreateProjectDialogWindowLocator() {
        return $(createProjectDialogWindowLocator);
    }

    public void addProjectButtonClick() {
        getAddProjectButtonLocator().click();
    }

    //загрузка выбранного изорбражения
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

    public void initProjectFields(Project mProject) {
        getProjectNameLocator().sendKeys(mProject.getmName());
        getProjectSummaryLocator().sendKeys(mProject.getmSummary());
        uploadImage(mProject.getmImagePath());
        getCreateProjectButtonLocator().click();
    }
}