package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.Condition;
import elements.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class AdminProjectPage extends BasePage {

    private int startTableRowSize = 0;
    private final By testProjectsTableLocator = By.xpath("//*[@data-target='components--table.table']");
    private final By removeProjectDialogLocator = By.xpath("//*[@class='dialog dialog--negative dialog--compact']");
    private final By approveRemoveCheckBoxLocator = By.xpath("//*[@class='ui checkbox']");
    private final By approveRemoveButtonLocator = By.xpath("//*[@class='ui negative button']");

    public AdminProjectPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return testProjectsTableLocator;
    }

    public WebElement getRemoveProjectDialogLocator() {
        return $(removeProjectDialogLocator);
    }

    public WebElement getApproveRemoveCheckBoxLocator() {
        return $(approveRemoveCheckBoxLocator);
    }

    public WebElement getApproveRemoveButtonLocator() {
        return $(approveRemoveButtonLocator);
    }

    public void parseTable() {
        Table table = new Table(testProjectsTableLocator);
        startTableRowSize= table.getRowSize();
        if (startTableRowSize > 1) {
            table.getCell(table.getColumns().size() - 2, startTableRowSize - 1).getAsUIElement().click();
        }
    }

    public void isDialogVisible() {
        $(getRemoveProjectDialogLocator()).shouldBe(Condition.visible);
    }

    private void disableCheckBox() {
        if (getApproveRemoveCheckBoxLocator().isSelected() == false) {
            getApproveRemoveCheckBoxLocator().click();
        }
    }

    private void removeButtonClick() {
        $(getRemoveProjectDialogLocator()).shouldBe(Condition.enabled);
        getApproveRemoveButtonLocator().click();
    }

    public void removeProject() {
        disableCheckBox();
        removeButtonClick();
    }
}