package tests;

import baseEntities.BaseTest;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class DeleteProjectTest extends BaseTest {
    private final static String pagePath = "admin/projects";

    @Test(description = "Тест на удаление сущности проекта воспроизводящий дефект - после удаления не обновляется таблица", groups = "negative")
    public void createProjectTest() {
        defaultUserLogin();
        open(WebDriverRunner.getWebDriver().getCurrentUrl() + pagePath);
        mAdminProjectStep.removeLastProjectFromTable();
    }
}
