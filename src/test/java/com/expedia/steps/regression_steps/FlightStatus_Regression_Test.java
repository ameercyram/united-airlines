package com.expedia.steps.regression_steps;

import com.expedia.pom.pages.FlightsResult_Page;
import com.expedia.pom.travel_tabs.FlightStatus_Tab;
import com.expedia.pom.travel_tabs.book_tab.Book_tab;
import com.expedia.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.awt.print.Book;

public class FlightStatus_Regression_Test {
    @Given("click on the flight status tab")
    public void clickOnTheFlightStatusTab() {
        FlightStatus_Tab flightStatus_tab = new FlightStatus_Tab();
        flightStatus_tab.getFlight_status_tab().click();
    }

    @Then("click on the leaving from input field and enter location")
    public void clickOnTheLeavingFromInputFieldAndEnterLocation() throws InterruptedException {
//        FlightStatus_Tab flightStatus_tab = new FlightStatus_Tab();
//        flightStatus_tab.getLeavingFrom_inputField().click();
//        flightStatus_tab.getLeavingFrom_inputField().clear();
//        Thread.sleep(1000);
//        flightStatus_tab.getLeavingFrom_inputField().click();
//        flightStatus_tab.getLeavingFrom_inputField().sendKeys("dulles");
//        Common.waitUntil(flightStatus_tab.getLeavingFromLocation_list().get(1));
//        flightStatus_tab.getLeavingFromLocation_list().get(1).click();
    }

    @And("click on the going to input field and enter location")
    public void clickOnTheGoingToInputFieldAndEnterLocation() {
        FlightStatus_Tab flightStatus_tab = new FlightStatus_Tab();
        flightStatus_tab.getGoingTo_inputField().click();
        flightStatus_tab.getGoingTo_inputField().sendKeys("newyork");
        Common.waitUntil(flightStatus_tab.getGoingToLocation_list().get(1));
        flightStatus_tab.getGoingToLocation_list().get(1).click();
    }

    @Then("click on the search button")
    public void clickOnTheSearchButton() throws InterruptedException {
        FlightStatus_Tab flightStatus_tab = new FlightStatus_Tab();
        flightStatus_tab.getSearch_button().click();
        Thread.sleep(3000);
    }

    @And("verify user is able to see result on different page")
    public void verifyUserIsAbleToSeeResultOnDifferentPage() {
        int size = new FlightsResult_Page().getFlightStatusResult_list().size();
        Assert.assertTrue(size > 0);

    }

    @And("enter characters in the flight number field")
    public void enterCharactersInTheFlightNumberField() {
        FlightStatus_Tab flightStatus_tab = new FlightStatus_Tab();
        flightStatus_tab.getFlightNumber_inputField().click();
        flightStatus_tab.getFlightNumber_inputField().sendKeys("jjjj");
    }

    @Then("verify flight number field does not accept characters")
    public void verifyFlightNumberFieldDoesNotAcceptCharacters() {
        FlightStatus_Tab flightStatus_tab = new FlightStatus_Tab();
        boolean displayed = flightStatus_tab.getError_message().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @And("enter random number in the flight number field")
    public void enterRandomNumberInTheFlightNumberField() {
        FlightStatus_Tab flightStatus_tab = new FlightStatus_Tab();
        flightStatus_tab.getFlightNumber_inputField().click();
        flightStatus_tab.getFlightNumber_inputField().sendKeys("0000");
    }

    @And("verify user should see invalid flight number message")
    public void verifyUserShouldSeeInvalidFlightNumberMessage() {
        FlightStatus_Tab flightStatus_tab = new FlightStatus_Tab();
        String text = flightStatus_tab.getWrongFlightNumberError_message().getText();
        Assert.assertTrue(text.contains("The number you entered is not a valid flight number"));
    }
}
