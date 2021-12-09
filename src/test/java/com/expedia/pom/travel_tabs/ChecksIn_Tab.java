package com.expedia.pom.travel_tabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.expedia.base.Hooks.driver;

public class ChecksIn_Tab {

    @FindBy(xpath = "//*[@id='checkInTab']")
    private WebElement checksIn_tab;

    @FindBy(css = "#bookFlightCheckin input")
    private List<WebElement> checksIn_inputField;

    @FindBy(css = "#formSubmitBtn")
    private WebElement search_button;

    @FindBy(css = "div[id='flightCheckInConfNumber_aria']")
    private WebElement confirmationNumber_errorMessage;

    @FindBy(css = "div[id='flightCheckInLastName_aria']")
    private WebElement lastName_errorMessage;

    @FindBy(css = "a[href='https://www.united.com/ual/en/US/fly/travel/airport/process.html']")
    private WebElement checkInDetails_link;

    @FindBy(xpath = "//button[text()='Check in with your MileagePlus number']")
    private WebElement checkInMileAgePlus_link;

    @FindBy(css = "div[class=\"app-components-MileagePlusSignIn-styles__contentContainer--1T7fl\"] input")
    private List<WebElement> checkInMileAgePlus_inputFields;

    public ChecksIn_Tab() {PageFactory.initElements(driver, this);}

    public WebElement getChecksIn_tab() {return checksIn_tab;}

    public WebElement getSearch_button() {return search_button;}

    public WebElement getConfirmationNumber_errorMessage() {return confirmationNumber_errorMessage;}

    public WebElement getLastName_errorMessage() {return lastName_errorMessage;}

    public WebElement getCheckInDetails_link() {return checkInDetails_link;}

    public WebElement getCheckInMileAgePlus_link() {return checkInMileAgePlus_link;}

    public List<WebElement> getCheckInMileAgePlus_inputFields() {return checkInMileAgePlus_inputFields;}

    public boolean verify_allInputsField_and_searchButton_isDisplayed() {
        for (WebElement elements : checksIn_inputField) {
            if (elements.isDisplayed() && search_button.isDisplayed()) {
                return true;
            }
        }
        return false;
    }
}
