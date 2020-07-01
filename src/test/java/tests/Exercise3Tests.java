package tests;

import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import page.Exercise3Page;
import utils.testng.listeners.RetryAnalyzer;

import static navigation.ApplicationURLs.Exercise3_URL;

public class Exercise3Tests extends TestBase {

    @Severity(SeverityLevel.TRIVIAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("Exercise 3 - Dropdown list")

    public void chooseColourAndCheck() {
        DriverUtils.navigateToPage(Exercise3_URL);
        Exercise3Page exercise3Page = new Exercise3Page();
        exercise3Page.chooseColour();
        exercise3Page.getActionsAndCheck();
    }
}

