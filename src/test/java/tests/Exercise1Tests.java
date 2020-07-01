package tests;

import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import page.Exercise1Page;
import page.Exercise2Page;
import utils.testng.listeners.RetryAnalyzer;

import static driver.manager.DriverUtils.navigateToPage;
import static navigation.ApplicationURLs.Exercise1_URL;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Exercise1Tests extends TestBase {

    @Severity(SeverityLevel.TRIVIAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("Exercise 1 - Three buttons")

    public void pressButtons() {
        DriverUtils.navigateToPage(Exercise1_URL);
        Exercise1Page exercise1Page = new Exercise1Page();
        exercise1Page.pressButton2();
        exercise1Page.pressButton1();
        exercise1Page.pressButton1();
        exercise1Page.getActionsAndCheck();

    }
}

