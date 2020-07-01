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

public class Exercise2Page {
    private Logger logger = LogManager.getLogger(Exercise2Page.class);
    String mouth = "June.";
    @FindBy(id = "t14")
    private WebElement textTable;
    @FindBy(css = "#trail code")
    private WebElement code;


    public Exercise2Page() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @Step("Enter text Mouth. into T14 editbox")
    public void sendMouth() {
        WaitForElement.waitUntilElementIsVisible(textTable);
        textTable.clear();
        textTable.sendKeys(mouth);
        logger.info("send text to table", mouth);
    }

    @Step("check actions are correct,")
    public void getActionsAndCheck() {
        String warningText = code.getText();
        logger.info("Returned warning message was: {}", code);
        AssertJUnit.assertEquals(warningText, "t14:" + mouth +"b1");
    }

}