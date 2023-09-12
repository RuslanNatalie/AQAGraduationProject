package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import configuration.ReadProperties;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.*;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected StartStep mStartStep;
    protected TestmoLoginStep mTestmoLoginStep;
    protected TestmoAuthStep mTestmoAuthStep;
    protected ProjectsListStep mProjectsListStep;

    static Logger logger = Logger.getLogger(BaseTest.class);

    @BeforeMethod
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        org.apache.log4j.BasicConfigurator.configure();

        initSteps();
        setConfigurationProp();
        open("/");
        logger.info("Browser is started");
    }

    private void setConfigurationProp() {
        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 8000;
        Configuration.browserSize = "1920x1080";
        Configuration.fastSetValue = true;
        Configuration.headless = false;
    }

    private void initSteps() {
        mStartStep = new StartStep();
        mTestmoLoginStep = new TestmoLoginStep();
        mTestmoAuthStep = new TestmoAuthStep();
        mProjectsListStep = new ProjectsListStep();
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}