package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProjectsListPage extends BasePage {
    private final By testmoProjectsTitleLocator = By.xpath("//*[@class='page-title__title']");
    public ProjectsListPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return testmoProjectsTitleLocator;
    }
}