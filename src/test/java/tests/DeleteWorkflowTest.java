package tests;

import baseEntities.BaseTest;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class DeleteWorkflowTest extends BaseTest {
    private final static String pagePath = "admin/workflows";

    @Test(description = "Тест на удаление сущности", groups = "positive")
    public void deleteWorkflowTest() {
        defaultUserLogin();
        open(WebDriverRunner.getWebDriver().getCurrentUrl() + pagePath);
        Assert.assertTrue(mAdminProjectStep.removeWorkflowFromTable(), "Ошибка удаления");
    }
}
