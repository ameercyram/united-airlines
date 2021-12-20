package com.united.pom.travel_tabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class FlightStatus_Tab {

    @FindBy(id = "statusTab")
    private WebElement flight_status_tab;

    @FindBy(css = "#flightStatusModel input")
    private List<WebElement> flightStatus_inputFields;

    @FindBy(id = "datesDropdown")
    private WebElement dates_dropDown;

    @FindBy(xpath = "//button/span[text()='Search']")
    private WebElement search_button;

    @FindBy(css = "#flightStatusOriginInput")
    private WebElement leavingFrom_inputField;

    @FindBy(css = "#flightStatusDestinationInput")
    private WebElement goingTo_inputField;

    @FindBy(css = "#flightStatusOriginInput-menu>li")
    private List<WebElement> leavingFromLocation_list;

    @FindBy(css = "#flightStatusDestinationInput-menu>li")
    private List<WebElement> goingToLocation_list;

    @FindBy(css = "input[name='flightStatusModel.flightNumber']")
    private WebElement flightNumber_inputField;

    @FindBy(css = "div[id='flightStatusModel.flightNumber_aria']")
    private WebElement Error_message;

    @FindBy(css = "p[class='app-components-FlightNotFoundMessage-flightNotFoundMessage__message--KSn-O']")
    private WebElement wrongFlightNumberError_message;


    public FlightStatus_Tab() {PageFactory.initElements(driver, this);}

    public WebElement getFlight_status_tab() {return flight_status_tab;}

    public WebElement getDates_dropDown() {return dates_dropDown;}

    public WebElement getSearch_button() {return search_button;}

    public List<WebElement> getFlightStatus_inputFields() {return flightStatus_inputFields;}

    public WebElement getLeavingFrom_inputField() {return leavingFrom_inputField;}

    public WebElement getGoingTo_inputField() {return goingTo_inputField;}

    public List<WebElement> getLeavingFromLocation_list() {return leavingFromLocation_list;}

    public List<WebElement> getGoingToLocation_list() {return goingToLocation_list;}

    public WebElement getFlightNumber_inputField() {return flightNumber_inputField;}

    public WebElement getError_message() {return Error_message;}

    public WebElement getWrongFlightNumberError_message() {return wrongFlightNumberError_message;}


    public boolean verify_allInputs_is_displayed() {
        for (WebElement inputFields : flightStatus_inputFields) {
            if (inputFields.isDisplayed() && dates_dropDown.isDisplayed() && search_button.isDisplayed()) {
                return true;
            }

        }
        return false;
    }
}
