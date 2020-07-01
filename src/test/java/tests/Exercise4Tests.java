package tests;

import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import page.Exercise4Page;
import utils.testng.listeners.RetryAnalyzer;

import static navigation.ApplicationURLs.Exercise4_URL;

public class Exercise4Tests extends TestBase {

    @Severity(SeverityLevel.TRIVIAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("Exercise 4 - Radio buttons")

    public void pressButtons() {
        DriverUtils.navigateToPage(Exercise4_URL);
        Exercise4Page exercise4Page = new Exercise4Page();
        exercise4Page.chooseBelugaBrown();
        exercise4Page.chooseDuckEggBlue();
        exercise4Page.verdoroGreen();
        exercise4Page.pinkKong();
        exercise4Page.getActionsAndCheck();
    }
}

