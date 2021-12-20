package com.united.steps.regression_steps;

import com.united.pom.travel_tabs.ChecksIn_Tab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class CheckIn_Regression_Test {
    @Then("click on the check in search button")
    public void clickOnTheCheckInSearchButton() {
        ChecksIn_Tab checksIn_tab = new ChecksIn_Tab();
        checksIn_tab.getSearch_button().click();
    }

    @And("verify error message is displayed")
    public void verifyErrorMessageIsDisplayed() {
        ChecksIn_Tab checksIn_tab = new ChecksIn_Tab();
        boolean displayed1 = checksIn_tab.getLastName_errorMessage().isDisplayed();
        boolean displayed2 = checksIn_tab.getConfirmationNumber_errorMessage().isDisplayed();
        Assert.assertTrue(displayed1 && displayed2);
    }

    @Then("click on the check in details link")
    public void clickOnTheCheckInDetailsLink() {
        ChecksIn_Tab checksIn_tab = new ChecksIn_Tab();
        checksIn_tab.getCheckInDetails_link().click();
    }

    @And("verify user is able to see correct page")
    public void verifyUserIsAbleToSeeCorrectPage() {
        ChecksIn_Tab checksIn_tab = new ChecksIn_Tab();
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Check-in and Airport Processing Times"));
    }

    @Then("click on the  check in MilesPlus link")
    public void clickOnTheCheckInMilesPlusLink() throws InterruptedException {
        ChecksIn_Tab checksIn_tab = new ChecksIn_Tab();
        checksIn_tab.getCheckInMileAgePlus_link().click();
        Thread.sleep(2000);
    }

    @And("verify it navigates to the correct page")
    public void verifyItNavigatesToTheCorrectPage() {
        ChecksIn_Tab checksIn_tab = new ChecksIn_Tab();
        int size = checksIn_tab.getCheckInMileAgePlus_inputFields().size();
        Assert.assertEquals(size, 3);

    }
}
