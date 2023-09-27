package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import configuration.ReadProperties;
import helper.DataHelper;
import io.qameta.allure.selenide.AllureSelenide;
import models.UserForUITest;
import org.testng.annotations.*;
import steps.*;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected StartStep mStartStep;
    protected TestmoLoginStep mTestmoLoginStep;
    protected TestmoAuthStep mTestmoAuthStep;
    protected ProjectsListStep mProjectsListStep;
    protected ProjectDetailsStep mProjectDetailsStep;
    protected AdminProjectStep mAdminProjectStep;
    static Logger logger = Logger.getLogger(BaseTest.class);

    @BeforeTest
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        org.apache.log4j.BasicConfigurator.configure();
        initSteps();
        setConfigurationProp();
        open("/");
        logger.info("Browser is started");
    }


    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

    private void setConfigurationProp() {
        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 8000;
        Configuration.browserSize = "1920x1080";
        Configuration.fastSetValue = true;
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
    }

    private void initSteps() {
        mStartStep = new StartStep();
        mTestmoLoginStep = new TestmoLoginStep();
        mTestmoAuthStep = new TestmoAuthStep();
        mProjectsListStep = new ProjectsListStep();
        mProjectDetailsStep = new ProjectDetailsStep();
        mAdminProjectStep = new AdminProjectStep();
    }

    protected void defaultUserLogin(){
        UserForUITest mUser = DataHelper.getFirsCorrectUser();
        mStartStep.loginButtonClick().isPageOpened();
        mTestmoLoginStep.setTestmoAccount(mUser.getTestmoAccount()).isPageOpened();
        mTestmoAuthStep.login(mUser).isPageOpened();
    }
}
