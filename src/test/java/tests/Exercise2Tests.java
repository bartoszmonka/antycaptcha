package tests;

import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import page.Exercise1Page;
import page.Exercise2Page;
import utils.testng.listeners.RetryAnalyzer;

import static navigation.ApplicationURLs.Exercise2_URL;

public class Exercise2Tests extends TestBase {

    @Severity(SeverityLevel.TRIVIAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("Exercise 2 - Editbox")

    public void sendMouthAndPressButton() {
        DriverUtils.navigateToPage(Exercise2_URL);

        Exercise2Page exercise2Page = new Exercise2Page();
        Exercise1Page exercise1Page = new Exercise1Page();
        exercise2Page.sendMouth();
        exercise1Page.pressButton1();
        exercise2Page.getActionsAndCheck();


    }
}

