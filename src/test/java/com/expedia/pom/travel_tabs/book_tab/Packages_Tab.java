package com.expedia.pom.travel_tabs.book_tab;

import com.expedia.pom.tables.TravelDates_CalenderTable;
import com.expedia.utils.Common;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.expedia.base.Hooks.driver;

public class Packages_Tab {

    @FindBy(css = "#vacationOriginInput")
    private WebElement leavingFrom_inputField;

    @FindBy(css = "#vacationDestinationInput")
    private WebElement goingTo_inputField;

    @FindBy(css = "input[name='DepartDate']")
    private WebElement departureDate_inputField;

    @FindBy(css = "input[name='ReturnDate']")
    private WebElement returnDate_inputField;

    @FindBy(xpath = "//button/span[text()='Find trips']")
    private WebElement findTrips_button;

    @FindBy(css = "div[role='tooltip']>div>ul>li")
    private List<WebElement> leavingFromLocation_list;

    @FindBy(css = "#vacationDestinationInput-menu>li")
    private List<WebElement> goingToLocation_list;

    @FindBy(css = "ul[aria-labelledby='roomDescriptor']>li")
    private List<WebElement> roomsDropdownOption_list;

    @FindBy(css = "button[name='selectedRooms']>div")
    private WebElement rooms_dropDown;

    @FindBy(css = "li[aria-label='2 rooms']")
    private WebElement twoRoomsDropdown_option;

    @FindBy(css = "#radiofield-item-id-packageType-2")
    private WebElement hotelAndCar_radioButton;

    public Packages_Tab() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getLeavingFrom_inputField() {return leavingFrom_inputField;}

    public WebElement getGoingTo_inputField() {return goingTo_inputField;}

    public WebElement getDepartureDate_inputField() {return departureDate_inputField;}

    public WebElement getReturnDate_inputField() {return returnDate_inputField;}

    public WebElement getFindTrips_button() {return findTrips_button;}

    public List<WebElement> getLeavingFromLocation_list() {return leavingFromLocation_list;}

    public List<WebElement> getGoingToLocation_list() {return goingToLocation_list;}

    public List<WebElement> getRoomsDropdownOption_list() {return roomsDropdownOption_list;}

    public WebElement getRooms_dropDown() {return rooms_dropDown;}

    public WebElement getHotelAndCar_radioButton() {return hotelAndCar_radioButton;}

    public WebElement getTwoRoomsDropdown_option() {return twoRoomsDropdown_option;}

    public void fillOutForm() throws InterruptedException {
        TravelDates_CalenderTable travelDates_calenderTable = new TravelDates_CalenderTable();
        leavingFrom_inputField.click();
        leavingFrom_inputField.sendKeys("dulles");
        Thread.sleep(1000);
        leavingFromLocation_list.get(1).click();
        goingTo_inputField.click();
        goingTo_inputField.sendKeys("miami");
        Common.waitUntil(getGoingToLocation_list().get(1));
        getGoingToLocation_list().get(1).click();
        departureDate_inputField.click();
        Common.waitUntil(travelDates_calenderTable.getDec_30_2021_element());
        travelDates_calenderTable.getDec_30_2021_element().click();
        returnDate_inputField.click();
        travelDates_calenderTable.getJan_25_2022_element().click();
        Common.waitUntil(findTrips_button);
    }
}
