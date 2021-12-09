package com.expedia.steps.regression_steps;

import com.expedia.pom.pages.CarResults_Page;
import com.expedia.pom.travel_tabs.book_tab.Book_tab;
import com.expedia.pom.travel_tabs.book_tab.Car_Tab;
import com.expedia.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;

import static com.expedia.base.Hooks.driver;

public class Cars_Regression_Test {
    @Given("click on the car tab")
    public void clickOnTheCarTab() {
        Book_tab book_tab = new Book_tab();
        Car_Tab car_tab = new Car_Tab();
        book_tab.getCar_tab().click();
        Common.waitUntil(car_tab.getPickupTime_dropDown());

    }

    @Then("verify car tabs have all related fields")
    public void verifyCarTabsHaveAllRelatedFields() {
        Car_Tab car_tab = new Car_Tab();
        boolean result = car_tab.verifyAllFieldsAreDisplayed();
        Assert.assertTrue(result);
    }

    @And("click on the return car to same location checkbox")
    public void clickOnTheReturnCarToSameLocationCheckbox() throws InterruptedException {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getReturnCerToSameLocation_checkbox().click();
        Thread.sleep(2000);
    }

    @Then("verify dropOff location is displayed")
    public void verifyDropOffLocationIsDisplayed() throws InterruptedException {
        Car_Tab car_tab = new Car_Tab();
        boolean displayed = car_tab.getDropOffLocation_inputField().isDisplayed();
        Assert.assertTrue(displayed);
        Thread.sleep(2000);

    }

    @Then("verify dropOff location is disappeared")
    public void verifyDropOffLocationIsDisappeared() {
        Car_Tab car_tab = new Car_Tab();
        int size = car_tab.getCarTabInputField_list().size();
        Assert.assertEquals(size, 6);
    }


    @And("click on the primary driver age is twenty five checkbox")
    public void clickOnThePrimaryDriverAgeIsTwentyFiveCheckbox() throws InterruptedException {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getPrimaryAgeIs25_checkbox().click();
        Thread.sleep(1000);

    }

    @Then("verify age field is is display")
    public void verifyAgeFieldIsIsDisplay() {
        Car_Tab car_tab = new Car_Tab();
        boolean displayed = car_tab.getAge_inputField().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Then("verify age field is disappeared")
    public void verifyAgeFieldIsDisappeared() {
        Car_Tab car_tab = new Car_Tab();
        int size = car_tab.getCarTabInputField_list().size();
        Assert.assertEquals(size, 6);
    }

    @Then("fill out the rental cars form properly")
    public void fillOutTheRentalCarsFormProperly() throws InterruptedException {
        Car_Tab car_tab = new Car_Tab();
        car_tab.fillOutRentalCarTheForm();
    }

    @And("click on the find cars button")
    public void clickOnTheFindCarsButton() throws InterruptedException {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getFindCars_button().click();
        Thread.sleep(5000);

    }

    @And("verify user is on other tab with results")
    public void verifyUserIsOnOtherTabWithResults() {
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        CarResults_Page carResults_page = new CarResults_Page();
        int size = carResults_page.getCarResults_list().size();
        System.out.println(size);
        Assert.assertTrue(size > 0);
    }


    @And("click on the book with miles checkbox")
    public void clickOnTheBookWithMilesCheckbox() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getBookWithMiles_checkbox().click();
    }

    @And("verify results is shown with miles")
    public void verifyResultsIsShownWithMiles() {
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("Miles only"));
    }

    @Then("enter eighteen age in the age input field")
    public void enterEighteenAgeInTheAgeInputField() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getAge_inputField().sendKeys("18");
    }

    @Then("verify user is able to see that you cannot rent car message")
    public void verifyUserIsAbleToSeeThatYouCannotRentCarMessage() {
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        CarResults_Page carResults_page = new CarResults_Page();
        String text = carResults_page.getCannotRentCar_message().getText();
        Assert.assertTrue(text.contains("Some car rental suppliers do not rent to young drivers."));
    }

    @Then("enter twenty one age in the age input field")
    public void enterTwentyOneAgeInTheAgeInputField() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getAge_inputField().sendKeys("21");
    }

    @Then("verify user is  not able to find any results")
    public void verifyUserIsNotAbleToFindAnyResults() {
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        CarResults_Page carResults_page = new CarResults_Page();
        String text = carResults_page.getCannotRentCar_message().getText();
        Assert.assertTrue(text.contains("We couldn't find any results matching your criteria"));

    }

    @Then("enter twenty two age in the age input field")
    public void enterTwentyTwoAgeInTheAgeInputField() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getAge_inputField().sendKeys("22");
    }


}
