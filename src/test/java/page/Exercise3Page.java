package page;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import waits.WaitForElement;

public class Exercise3Page {
    private Logger logger = LogManager.getLogger(Exercise3Page.class);

    @FindBy(id = "s13")
    private WebElement coloursList;

    @FindBy(css = "#trail code")
    private WebElement code;


    public Exercise3Page() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @Step("dropdown choose Verdoro Green colour.")
    public void chooseColour() {
        WaitForElement.waitUntilElementIsVisible(coloursList);
        WebElement coloursListWebElement = coloursList;
        Select coloursDropDown = new Select(coloursListWebElement);
        coloursDropDown.selectByValue("v2");
        logger.info("Select Verdoro Green");
    }

    @Step("check actions are correct,")
    public void getActionsAndCheck() {
        String warningText = code.getText();
        logger.info("Returned warning message was: {}", code);
        AssertJUnit.assertEquals(warningText, "s13:v2");
    }

}