package com.expedia.steps.regression_steps;

import com.expedia.pom.pages.UnitedAirlinesReservation_Page;
import com.expedia.pom.travel_tabs.book_tab.Book_tab;
import com.expedia.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.print.Book;
import java.util.List;

import static com.expedia.base.Hooks.driver;

public class Flights_Regression_Test {
    @Then("verify there is only departure input field display on the travel section")
    public void verifyThereIsOnlyDepartureInputFieldDisplayOnTheTravelSection() {
        Book_tab book_tab = new Book_tab();
        Common.waitUntil(book_tab.getDepartureDate_inputField());
        boolean result = book_tab.getDepartureDate_inputField().isDisplayed();
        Assert.assertTrue(result);

    }

    @Given("click on roundTrip radio button")
    public void clickOnRoundTripRadioButton() {
        Book_tab book_tab = new Book_tab();
        book_tab.getRoundTrip_radioButton().click();
        Common.waitUntil(book_tab.getDepartureDate_inputField());
    }

    @Then("verify departure and return date input fields display on the travel section")
    public void verifyDepartureAndReturnDateInputFieldsDisplayOnTheTravelSection() {
        Book_tab book_tab = new Book_tab();
        boolean result1 = book_tab.getDepartureDate_inputField().isDisplayed();
        boolean result2 = book_tab.getReturnDate_inputField().isDisplayed();
        Assert.assertTrue(result1 && result2);
    }

    @And("get the value of leaving and destination fields")
    public void getTheValueOfLeavingAndDestinationFields() {
        Book_tab book_tab = new Book_tab();
        String leavingFrom_value = book_tab.getLeavingFrom_inputField().getAttribute("value");
        String goingTo_value = book_tab.getGoingTo_inputField().getAttribute("value");
        System.out.println("before switch leaving from text is =" + leavingFrom_value + "  " + "before switch going to text is = " + goingTo_value);

    }

    @Then("click on the switch button")
    public void clickOnTheSwitchButton() throws InterruptedException {
        Book_tab book_tab = new Book_tab();
        book_tab.getSwitch_button().click();
        Thread.sleep(1000);

    }

    @And("verify leaving and destination are switched")
    public void verifyLeavingAndDestinationAreSwitched() {
        Book_tab book_tab = new Book_tab();
        String leavingFrom_value = book_tab.getLeavingFrom_inputField().getAttribute("value");
        String goingTo_value = book_tab.getGoingTo_inputField().getAttribute("value");
        System.out.println("after switch leaving from text is =" + leavingFrom_value + "  " + "after switch going to text is = " + goingTo_value);
        Assert.assertTrue(leavingFrom_value.contains("Dubai DXB") && goingTo_value.contains("Washington IAD"));
    }


    @Then("verify leaving and destination have correct placeholders")
    public void verifyLeavingAndDestinationHaveCorrectPlaceholders() {
        Book_tab book_tab = new Book_tab();
        String leavingFrom_placeholder = book_tab.getLeavingFrom_inputField().getAttribute("placeholder");
        String goingTo_placeholder = book_tab.getGoingTo_inputField().getAttribute("placeholder");
        System.out.println("leaving from place holder is =" + leavingFrom_placeholder + " " + "going to place holder is =" + goingTo_placeholder);
        Assert.assertTrue(leavingFrom_placeholder.contains("From*") && goingTo_placeholder.contains("To*"));
    }

    @Given("put some value in the leaving from input field")
    public void putSomeValueInTheLeavingFromInputField() {
        Book_tab book_tab = new Book_tab();
        book_tab.getLeavingFrom_inputField().click();
        Common.waitUntil(book_tab.getLeavingFrom_crossBtn());
    }

    @Then("click on the leaving from cross button")
    public void clickOnLeavingFromCrossButton() {
        Book_tab book_tab = new Book_tab();
        book_tab.getLeavingFrom_crossBtn().click();
    }

    @And("verify leaving from field value is removed")
    public void verifyValueIsRemoved() {
        Book_tab book_tab = new Book_tab();
        String value = book_tab.getLeavingFrom_inputField().getAttribute("value");
        Assert.assertTrue(value.isEmpty());
    }

    @Given("put some value in the going to input field")
    public void putSomeValueInTheGoingToInputField() {
        Book_tab book_tab = new Book_tab();
        book_tab.getGoingTo_inputField().click();
        book_tab.getGoingTo_inputField().sendKeys("dubai");
        Common.waitUntil(book_tab.getDubaiAirport_element());
        book_tab.getDubaiAirport_element().click();
        Common.waitUntil(book_tab.getGoingTo_crossBtn());
    }

    @Then("click on the going to cross button")
    public void clickOnTheGoingToCrossButton() {
        Book_tab book_tab = new Book_tab();
        book_tab.getGoingTo_crossBtn().click();
    }

    @And("verify going to field value is removed")
    public void verifyGoingToFieldValueIsRemoved() {
        Book_tab book_tab = new Book_tab();
        String value = book_tab.getGoingTo_inputField().getAttribute("value");
        Assert.assertTrue(value.isEmpty());
    }

    @Given("click on the Advance search button")
    public void clickOnTheAdvanceSearchButton() {
        Book_tab book_tab = new Book_tab();
        UnitedAirlinesReservation_Page unitedAirlinesReservation_page = new UnitedAirlinesReservation_Page();
        String currentUrl = driver.getCurrentUrl();
        book_tab.getAdvancedSearch_button().click();
        System.out.println("before click advanced search button url is : " + currentUrl);
        Common.waitUntil(unitedAirlinesReservation_page.getDepartureDate_inputField());
    }

    @Then("verify separate page is open")
    public void verifySeparatePageIsOpen() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println("after click advanced search button url is : " + currentUrl);
    }

    @And("verify more advanced fields displayed on the page")
    public void verifyMoreAdvancedFieldsDisplayedOnThePage() {
        UnitedAirlinesReservation_Page unitedAirlinesReservation_page = new UnitedAirlinesReservation_Page();
        List<WebElement> inputFields_list = unitedAirlinesReservation_page.getInputFields_list();
        int size = inputFields_list.size();
        Assert.assertEquals(size, 9);
    }

    @Then("verify departure and return date input fields display above the Flexible dates checkbox")
    public void verifyDepartureAndReturnDateInputFieldsDisplayAboveTheFlexibleDatesCheckbox() {
        UnitedAirlinesReservation_Page unitedAirlinesReservation_page = new UnitedAirlinesReservation_Page();
        boolean result1 = unitedAirlinesReservation_page.getReturnDate_inputField().isDisplayed();
        boolean result2 = unitedAirlinesReservation_page.getDepartureDate_inputField().isDisplayed();
        Assert.assertTrue(result1);
    }

    @Then("click on the Flexible dates checkbox")
    public void clickOnTheFlexibleDatesCheckbox() {
        UnitedAirlinesReservation_Page unitedAirlinesReservation_page = new UnitedAirlinesReservation_Page();
        unitedAirlinesReservation_page.getFlexibleDates_checkbox().click();
        Common.waitUntil(unitedAirlinesReservation_page.getMonthDropdown());
    }

    @And("verify Month dropdown display above the Flexible dates checkbox")
    public void verifyMonthDropdownDisplayAboveTheFlexibleDatesCheckbox() {
        UnitedAirlinesReservation_Page unitedAirlinesReservation_page = new UnitedAirlinesReservation_Page();
        boolean monthDropdown = unitedAirlinesReservation_page.getMonthDropdown().isDisplayed();
        Assert.assertTrue(monthDropdown);
    }

    @Given("click on the travelers selector")
    public void clickOnTheTravelersSelector() throws InterruptedException {
        Book_tab book_tab = new Book_tab();
        book_tab.getTravelersSelector_box().click();
        Thread.sleep(4000);
    }

    @Then("click on adults plus button twenty times")
    public void clickOnAdultsPlusButtonTwentyTimes() throws InterruptedException {
        Book_tab book_tab = new Book_tab();
        for (int i = 0; i < 10; i++) {
            book_tab.getAdultTravelersPlus_button().click();
            Thread.sleep(1000);
        }
    }

    @And("verify travelers selector input value is nine")
    public void verifyAdultsTravelersInputValueIsNine() {
        Book_tab book_tab = new Book_tab();
        String text = book_tab.getTravelersSelector_button().getText();
        Assert.assertTrue(text.contains("9 Adults"));
    }


    @Then("click on adults minus button five times")
    public void clickOnAdultsMinusButtonFiveTimes() throws InterruptedException {
        Book_tab book_tab = new Book_tab();
        for (int i = 0; i <= 5; i++) {
            Thread.sleep(500);
            book_tab.getAdultsTravelerMinus_button().click();
        }
    }

    @Then("verify adults travelers input value is one")
    public void verifyAdultsTravelersInputValueIsOne() throws InterruptedException {
        Book_tab book_tab = new Book_tab();
        Thread.sleep(2000);
        String value = book_tab.getAdultsTravelers_inputField().getAttribute("value");
        Assert.assertEquals(value, "1");
    }

    @Then("click on plus button of every traveler option")
    public void clickOnPlusButtonOfEveryTravelerOption() throws InterruptedException {
        Book_tab book_tab = new Book_tab();
        List<WebElement> plusBtn_list = book_tab.getTravelersSelectorPlusBtn_list();
        for (WebElement buttons : plusBtn_list) {
            Thread.sleep(1000);
            buttons.click();

        }
    }

    @And("verify every travelers input fields value are not zero")
    public void verifyEveryTravelersInputFieldsValueAreNotZero() {
        Book_tab book_tab = new Book_tab();
        List<WebElement> fields_list = book_tab.getTravelersSelectorInputFields_list();
        for (WebElement fields : fields_list) {
            String values = fields.getAttribute("value");
            Assert.assertFalse(values.isEmpty());

        }
    }


    @Given("click on the different classes from cabinTypes and verify classes are selected")
    public void clickOnTheDifferentClassesFromCabinTypesAndVerifyClassesAreSelected() throws InterruptedException {
        Book_tab book_tab = new Book_tab();
        List<WebElement> classes_list = book_tab.getCabinTypeClassesOptions_list();
        for (WebElement options : classes_list) {
            book_tab.getCabinTypeDropdown_button().click();
            options.click();
            Thread.sleep(1000);
            String attribute = options.getAttribute("aria-selected");
            Assert.assertEquals(attribute, "true");
        }
    }

    @And("click on the travel with pet button")
    public void clickOnTheTravelWithPetButton() {
        Book_tab book_tab = new Book_tab();
        UnitedAirlinesReservation_Page unitedAirlinesReservation_page = new UnitedAirlinesReservation_Page();
        book_tab.getTravelWithPet_button().click();
        Common.waitUntil(unitedAirlinesReservation_page.getPetsDropdown());

    }

    @Then("verify user is only able to travel with one pet")
    public void verifyUserIsOnlyAbleToTravelWithOnePet() {
        UnitedAirlinesReservation_Page unitedAirlinesReservation_page = new UnitedAirlinesReservation_Page();
        unitedAirlinesReservation_page.getPetsDropdown().click();
        int size = unitedAirlinesReservation_page.getPetDropDownOption_list().size();
        System.out.println(size);
        Assert.assertEquals(size, 2);
    }
}
