package com.expedia.pom.travel_tabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.expedia.base.Hooks.driver;

public class MyTrips_Tab {

    @FindBy(id = "tripsTab")
    private WebElement myTrips_tab;

    @FindBy(id = "myTripsSubmitBtn")
    private WebElement search_button;

    @FindBy(css = "div[class='app-components-MyTrips-myTrips__tripsData--1uHwJ'] input")
    private List<WebElement> myTrips_inputFields;

    @FindBy(css = "a[href='/en/US/fly/travel/credit.html']")
    private WebElement travelCredits_link;

    @FindBy(css = "#myTripsConfirmationNumber_aria")
    private WebElement confirmationNumber_errorMessage;

    @FindBy(css = "#myTripsLastName_aria")
    private WebElement lastName_errorMessage;

    @FindBy(xpath = "//a[text()='Sign in.']")
    private WebElement signIn_link;

    public MyTrips_Tab() {PageFactory.initElements(driver, this);}

    public WebElement getMyTrips_tab() {return myTrips_tab;}

    public WebElement getSearch_button() {return search_button;}

    public WebElement getTravelCredits_link() {return travelCredits_link;}

    public WebElement getConfirmationNumber_errorMessage() {return confirmationNumber_errorMessage;}

    public WebElement getLastName_errorMessage() {return lastName_errorMessage;}

    public WebElement getSignIn_link() {return signIn_link;}

    public boolean verify_inputFields_and_searchButton() {
        for (WebElement inputs : myTrips_inputFields) {
            if (inputs.isDisplayed() && search_button.isDisplayed()) {
                return true;
            }
        }
        return false;
    }
}
