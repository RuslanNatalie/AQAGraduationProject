package baseEntities;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {
    public BasePage() {
    }

    protected abstract By getPageIdentifier();

    @Description("Check is page opened")
    public void isPageOpened() {
        $(getPageIdentifier()).shouldBe(visible);
    }
}