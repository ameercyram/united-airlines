package com.united.steps.regression_steps;

import com.united.pom.pages.PackagesResult_Page;
import com.united.pom.travel_tabs.book_tab.Book_tab;
import com.united.pom.travel_tabs.book_tab.Packages_Tab;
import com.united.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.united.base.Hooks.driver;

public class Packages_Regression_Test {
    @Given("click on the packages tab")
    public void clickOnThePackagesTab() {
        Book_tab book_tab = new Book_tab();
        Packages_Tab packages_tab = new Packages_Tab();
        book_tab.getPackages_tab().click();
        Common.waitUntil(packages_tab.getFindTrips_button());

    }

    @And("fill out all the fields correctly")
    public void fillOutAllTheFieldsCorrectly() throws InterruptedException {
        Packages_Tab packages_tab = new Packages_Tab();
        packages_tab.fillOutForm();
    }

    @Then("click on the find trips button")
    public void clickOnTheFindTripsButton() {
        Packages_Tab packages_tab = new Packages_Tab();
        packages_tab.getFindTrips_button().click();
    }

    @And("verify user is able to see different search results")
    public void verifyUserIsAbleToSeeDifferentSearchResults() {
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        PackagesResult_Page packagesResult_page = new PackagesResult_Page();
        int size = packagesResult_page.getPackagesSearchResult_list().size();
        Assert.assertTrue(size > 0);

    }

    @Given("click on the packages rooms dropdown")
    public void clickOnThePackagesRoomsDropdown() throws InterruptedException {
        Packages_Tab packages_tab = new Packages_Tab();
        packages_tab.getRooms_dropDown().click();
    }

    @Then("verify dropdown display up to four rooms")
    public void verifyDropdownDisplayUpToFourRooms() {
        Packages_Tab packages_tab = new Packages_Tab();
        List<WebElement> list = packages_tab.getGoingToLocation_list();
        for (WebElement options : list) {
            boolean displayed = options.isDisplayed();
            Assert.assertTrue(displayed);
        }
    }

    @And("click on the two rooms option")
    public void clickOnTheTwoRoomsOption() throws InterruptedException {
        Packages_Tab packages_tab = new Packages_Tab();
        packages_tab.getTwoRoomsDropdown_option().click();
        Thread.sleep(2000);
    }

    @Then("verify rooms container display two rooms")
    public void verifyRoomsContainerDisplayTwoRooms() {
        Packages_Tab packages_tab = new Packages_Tab();
        String text = packages_tab.getRooms_dropDown().getText();
        Assert.assertTrue(text.contains("rooms"));
    }

    @And("verify flight and hotel spinning icon display on the result page")
    public void verifyFlightAndHotelSpinningIconDisplayOnTheResultPage() {

    }

    @Given("verify rooms dropdown is displayed on hotels and flight option")
    public void verifyRoomsDropdownIsDisplayedOnHotelsAndFlightOption() {
        Packages_Tab packages_tab = new Packages_Tab();
        boolean displayed = packages_tab.getRooms_dropDown().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Then("click on the flight and car radio button")
    public void clickOnTheFlightAndCarRadioButton() throws InterruptedException {
        Packages_Tab packages_tab = new Packages_Tab();
        packages_tab.getHotelAndCar_radioButton().click();
        Thread.sleep(1000);
    }

    @And("verify rooms is not displayed on the tab")
    public void verifyRoomsIsNotDisplayedThere() {
        Packages_Tab packages_tab = new Packages_Tab();
        boolean displayed = packages_tab.getRooms_dropDown().isDisplayed();
        Assert.assertFalse(displayed);

    }

    @Given("click on the cruise link")
    public void clickOnTheCruiseLink() {
        Book_tab book_tab = new Book_tab();
        book_tab.getCruise_link().click();
    }

    @Then("verify user is on United Cruises page")
    public void verifyUserIsOnUnitedCruisesPage() {
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("United Cruises"));

    }
}
