package page;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import waits.WaitForElement;

public class Exercise4Page {
    private Logger logger = LogManager.getLogger(Exercise4Page.class);
    @FindBy(css = "#trail code")
    private WebElement code;
    @FindBy(css = "input[type=radio][name=\"s0\"]:nth-child(2)")
    private WebElement beluga;
    @FindBy(css = "input[type=radio][name=\"s1\"]:nth-child(12)")
    private WebElement duckEggBlue;
    @FindBy(css = "input[type=radio][name=\"s2\"]:nth-child(6)")
    private WebElement verdoroGreen;
    @FindBy(css = "input[type=radio][name=\"s3\"]:nth-child(10)")
    private WebElement pinkKong;

    public Exercise4Page() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @Step("In the group 0 choose Beluga Brown.")
    public void chooseBelugaBrown() {
        WaitForElement.waitUntilElementIsVisible(beluga);
        beluga.click();
        logger.info("Select Beluga Brown");
    }

    @Step("In the group 1 choose Duck Egg Blue.")
    public void chooseDuckEggBlue() {
        duckEggBlue.click();
        logger.info("Select Duck Egg Blue");
    }

    @Step("In the group 2 choose Verdoro Green.")
    public void verdoroGreen() {
        verdoroGreen.click();
        logger.info("Select Verdoro Green");
    }

    @Step("In the group 3 choose Pink Kong.")
    public void pinkKong() {
        WebElement scroll = verdoroGreen;
        scroll.sendKeys(Keys.PAGE_DOWN);
        //WaitForElement.waitUntilElementIsVisible(verdoroGreen);
        pinkKong.click();
        logger.info("Select Pink Kong");
    }

    @Step("check actions are correct,")
    public void getActionsAndCheck() {
        String warningText = code.getText();
        logger.info("Returned warning message was: {}", code);
        AssertJUnit.assertEquals(warningText, "[0, 6, 2, 5]");
    }


}