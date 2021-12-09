package com.expedia.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.expedia.base.Hooks.driver;

public class UnitedAirlinesReservation_Page {

    @FindBy(css = "fieldset[class='atm-c-fieldset atm-u-margin-bottom-none'] input")
    private List<WebElement> inputFields_list;

    @FindBy(xpath = "//*[@id='originInput39']")
    private WebElement leavingFrom_inputField;

    @FindBy(id = "DepartDate")
    private WebElement departureDate_inputField;

    @FindBy(id = "ReturnDate")
    private WebElement returnDate_inputField;

    @FindBy(css = "input[name='Flexible']")
    private WebElement flexibleDates_checkbox;

    @FindBy(css = "#petCabinType62")
    private WebElement monthDropdown;

    @FindBy(css = "select[name='bookFlightModel.advancedSearch.petCabin']")
    private WebElement petsDropdown;

    @FindBy(css = "select[name='bookFlightModel.advancedSearch.petCabin'] option ")
    private List<WebElement> petDropDownOption_list;

    public UnitedAirlinesReservation_Page(){PageFactory.initElements(driver,this);}

    public List<WebElement> getInputFields_list() {return inputFields_list;}

    public WebElement getLeavingFrom_inputField() {return leavingFrom_inputField;}

    public WebElement getDepartureDate_inputField() {return departureDate_inputField;}

    public WebElement getReturnDate_inputField() {return returnDate_inputField;}

    public WebElement getFlexibleDates_checkbox() {return flexibleDates_checkbox;}

    public WebElement getMonthDropdown() {return monthDropdown;}

    public WebElement getPetsDropdown() {return petsDropdown;}

    public List<WebElement> getPetDropDownOption_list() {return petDropDownOption_list;}
}
