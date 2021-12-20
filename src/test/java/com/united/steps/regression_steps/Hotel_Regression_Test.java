package com.united.steps.regression_steps;

import com.united.pom.pages.HotelsResult_Page;
import com.united.pom.travel_tabs.book_tab.Book_tab;
import com.united.pom.travel_tabs.book_tab.Hotel_Tab;
import com.united.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Hotel_Regression_Test {
    @Given("click on the Hotel tab")
    public void clickOnTheHotelTab() throws InterruptedException {
        Book_tab book_tab = new Book_tab();
        book_tab.getHotelTab().click();
        Thread.sleep(1000);
    }

    @And("verify hotel tab has all the related fields")
    public void verifyHotelTabHasAllTheRelatedFields() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        Common.waitUntil(hotel_tab.getFindHotels_button());
        boolean result = hotel_tab.verifyAllFieldsAreDisplayed();
        Assert.assertTrue(result);
    }

    @And("verify one traveler and one room is selected by default")
    public void verifyOneTravelerAndOneRoomIsSelectedByDefault() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        String rooms = hotel_tab.getNumberOfRooms_dropDown().getText();
        String travelers = hotel_tab.getTravelers_inputField().getAttribute("value");
        Assert.assertEquals(rooms, "1 room");
        Assert.assertEquals(travelers, "1 adult");

    }

    @And("click on the travelers field")
    public void clickOnTheTravelersField() throws InterruptedException {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.getTravelers_inputField().click();
        Thread.sleep(2000);
    }

    @Then("click on each plus buttons of adults and children ten times")
    public void clickOnEachPlusButtonsOfAdultsAndChildrenTenTimes() throws InterruptedException {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        for (int i = 0; i <= 10; i++) {
            hotel_tab.getAdults_plus_icon().click();
            Thread.sleep(1000);
        }

        for (int i = 0; i <= 10; i++) {
            hotel_tab.getChildren_plus_icon().click();
            Thread.sleep(1000);
        }
    }


    @And("verify only total sixteen travelers are selected")
    public void verifyOnlyTotalSixteenTravelersAreSelected() throws InterruptedException {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        Thread.sleep(2000);
        String value = hotel_tab.getTravelers_inputField().getAttribute("value");
        Assert.assertEquals(value, "16 travelers");
    }


    @Then("click on the rooms dropdown")
    public void clickOnTheRoomsDropdown() throws InterruptedException {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.getNumberOfRooms_dropDown().click();
        Thread.sleep(1000);
    }

    @And("verify user can only select eight rooms")
    public void verifyUserCanOnlySelectEightRooms() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        int size = hotel_tab.getRooms_list().size();
        System.out.println("maximum number of rooms are : " + size);
        Assert.assertEquals(size, 8);
    }

    @Then("select two rooms")
    public void selectTwoRooms() throws InterruptedException {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.getRooms_list().get(1).click();
        Thread.sleep(1000);
    }

    @And("verify travelers field is disappeared")
    public void verifyTravelersFieldIsDisappeared() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        Assert.assertFalse(hotel_tab.getTravelers_inputField().isDisplayed());

    }

    @And("fill out the fields correctly")
    public void fillOutTheFieldsCorrectly() throws InterruptedException {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.fillOutForm();

    }

    @Then("click on the find hotels button")
    public void clickOnTheFindHotelsButton() throws InterruptedException {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.getFindHotels_button().click();
        Thread.sleep(3000);
    }

    @And("verify user is able to see different results")
    public void verifyUserIsAbleToSeeDifferentResults() {
        HotelsResult_Page hotelsResult_page = new HotelsResult_Page();
        int size = hotelsResult_page.getHotelsResult_list().size();
        Assert.assertFalse(size < 0);
    }
}
