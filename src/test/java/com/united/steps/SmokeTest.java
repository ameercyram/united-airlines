package com.united.steps;

import com.united.pom.pages.FlightsResult_Page;
import com.united.pom.sections.Travel_Section;
import com.united.pom.tables.TravelDates_CalenderTable;
import com.united.pom.travel_tabs.book_tab.Book_tab;
import com.united.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmokeTest {
    @Given("verify all the tabs on the homepage")
    public void verifyAllTheTabsOnTheHomepage() {
        Travel_Section travel_section = new Travel_Section();
        List<WebElement> travel_tabs = travel_section.getTravel_tabs();
        int size = travel_tabs.size();
        Assert.assertEquals(size, 4);


    }


    @Given("fill out leaving and destination field")
    public void fillOutLeavingAndDestinationField() throws InterruptedException {

        Book_tab book_tab = new Book_tab();
        book_tab.getLeavingFrom_inputField().click();
        Common.waitUntil(book_tab.getLeavingFrom_crossBtn());
        book_tab.getLeavingFrom_crossBtn().click();
        book_tab.getLeavingFrom_inputField().sendKeys("dulles");
        Common.waitUntil(book_tab.getDullesAirport_element());
        book_tab.getDullesAirport_element().click();
        Common.waitUntil(book_tab.getGoingTo_inputField());
        book_tab.getGoingTo_inputField().click();
        book_tab.getGoingTo_inputField().sendKeys("dubai");
        Common.waitUntil(book_tab.getDubaiAirport_element());
        book_tab.getDubaiAirport_element().click();


    }

    @And("click find flights  button")
    public void clickFindFlightsButton() {
        Book_tab book_tab = new Book_tab();
        book_tab.getFindFlights_button().click();
    }

    @Then("verify available flights are displayed")
    public void verifyAvailableFlightsAreDisplayed() throws InterruptedException {
        FlightsResult_Page flightsResult_page = new FlightsResult_Page();
        Thread.sleep(6000);
        List<WebElement> availableFlight_list = flightsResult_page.getAvailableFlight_list();
        int size = availableFlight_list.size();
        System.out.println(size);
        Assert.assertTrue(size > 0);


    }

    @Given("click on one way radio button")
    public void clickOnTheOneWayRadioButton() {
        Book_tab book_tab = new Book_tab();
        book_tab.getOneWay_radioBTn().click();
    }

    @And("select the date")
    public void selectTheDate() throws InterruptedException {
        Book_tab book_tab = new Book_tab();
        book_tab.getDepartureDate_inputField().click();
        Common.waitUntil(book_tab.getDepartureDate_calender());
        book_tab.getPrevArrowOnCalender_button().click();


        book_tab.getJan15_2022_element().click();
        Common.waitUntil(book_tab.getFindFlights_button());


    }

    @And("enter departure and return date")
    public void enterDepartureAndReturnDate() throws InterruptedException {
        Book_tab book_tab = new Book_tab();
        TravelDates_CalenderTable travelDates_calenderTable = new TravelDates_CalenderTable();
        book_tab.getDepartureDate_inputField().click();
        Common.waitUntil(travelDates_calenderTable.getFeb_15_2022_element());
        travelDates_calenderTable.getFeb_15_2022_element().click();
        Common.waitUntil(book_tab.getReturnDate_inputField());
        book_tab.getReturnDate_inputField().click();
        Thread.sleep(2000);
        Common.waitUntil(travelDates_calenderTable.getFeb_15_2022_element());
        travelDates_calenderTable.getFeb_25_2022_element().click();
    }

    @And("choose two adults and one infant  travelers")
    public void chooseTwoAdultsAndOneInfantTravelers() {
        Book_tab book_tab = new Book_tab();
        book_tab.getTravelersSelector_box().click();
        Common.waitUntil(book_tab.getAdultsTravelers_inputField());
        book_tab.getAdultsTravelers_inputField().sendKeys("2");
        Common.waitUntil(book_tab.getInfantsTravelers_inputField());
        book_tab.getInfantsTravelers_inputField().sendKeys("1");
        book_tab.getTravelersBox_crossBtn().click();
    }
}
