package page;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import waits.WaitForElement;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class Exercise1Page {
    private Logger logger = LogManager.getLogger(Exercise1Page.class);

    @FindBy(id = "btnButton1")
    private WebElement btnButton1;

    @FindBy(id = "btnButton2")
    private WebElement btnButton2;

    @FindBy(css = "#trail code")
    private WebElement code;

    public Exercise1Page() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @Step("press button 1")
    public void pressButton1() {
        WaitForElement.waitUntilElementIsVisible(btnButton1);
        btnButton1.click();
        logger.info("press Button1");
    }

    @Step("press button 2")
    public void pressButton2() {
        WaitForElement.waitUntilElementIsVisible(btnButton2);
        btnButton2.click();
        logger.info("press Button2");
    }

    @Step("check actions are correct,")
    public void getActionsAndCheck() {
        String warningText = code.getText();
        logger.info("Returned warning message was: {}", code);
        AssertJUnit.assertEquals(warningText, "b2b1b1");
    }

}