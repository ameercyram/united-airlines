package com.united.steps.regression_steps;

import com.united.pom.travel_tabs.MyTrips_Tab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MyTrips_Regreesion_Test {
    @Then("verify travel credits link is displayed on My Trips tab")
    public void verifyTravelCreditsLinkIsDisplayedOnMyTripsTab() {
        MyTrips_Tab myTrips_tab = new MyTrips_Tab();
        boolean displayed = myTrips_tab.getTravelCredits_link().isDisplayed();
        Assert.assertTrue(displayed);

    }

    @Then("click on the My Trips search button")
    public void clickOnTheMyTripsSearchButton() {
        MyTrips_Tab myTrips_tab = new MyTrips_Tab();
        myTrips_tab.getSearch_button().click();
    }

    @And("verify user is able to see error message")
    public void verifyUserIsAbleToSeeErrorMessage() {
        MyTrips_Tab myTrips_tab = new MyTrips_Tab();
        boolean displayed = myTrips_tab.getConfirmationNumber_errorMessage().isDisplayed();
        boolean displayed1 = myTrips_tab.getLastName_errorMessage().isDisplayed();
        Assert.assertTrue(displayed && displayed1);

    }

    @Then("verify sign in link is displayed on the My Trips tab")
    public void verifySignInLinkIsDisplayedOnTheMyTripsTab() {
        MyTrips_Tab myTrips_tab = new MyTrips_Tab();
        boolean displayed = myTrips_tab.getSignIn_link().isDisplayed();
        Assert.assertTrue(displayed);
    }
}
