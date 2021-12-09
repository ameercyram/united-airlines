package com.expedia.pom.travel_tabs.book_tab;

import com.expedia.utils.Common;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.expedia.base.Hooks.driver;

public class Hotel_Tab {

    @FindBy(css = "#bookHotelTab-panel input")
    private List<WebElement> inputFields_list;

    @FindBy(css = "button[aria-label='Find hotels button.']")
    private WebElement findHotels_button;

    @FindBy(css = "button[name='roomsDropdown']>div")
    private WebElement numberOfRooms_dropDown;

    @FindBy(css = "input[name='bookHotelModel.passengers']")
    private WebElement travelers_inputField;

    @FindBy(id = "Adults plusBtn")
    private WebElement adults_plus_icon;

    @FindBy(id = "Children plusBtn")
    private WebElement children_plus_icon;

    @FindBy(css = "ul[aria-labelledby='roomsDropdown_label-0']>li")
    private List<WebElement> rooms_list;

    @FindBy(id = "bookHotelInput")
    private WebElement goingTo_inputField;

    @FindBy(css = "input[name='bookHotelCheckinDate']")
    private WebElement checkIn_inputField;

    @FindBy(css = "input[aria-label='Checkout']")
    private WebElement checkOut_input_field;

    @FindBy(css = "tbody>tr>td[aria-label='Monday, December 20, 2021']")
    private WebElement Dec_20_2021_element;

    @FindBy(css = "tbody>tr>td[aria-label='Friday, December 31, 2021']")
    private WebElement Dec_31_2021_element;

    @FindBy(css = "#bookHotelInput-menu")
    private List<WebElement> goingTo_locations_list;


    public Hotel_Tab() {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getInputFields_list() {
        return inputFields_list;
    }

    public WebElement getFindHotels_button() {
        return findHotels_button;
    }

    public WebElement getNumberOfRooms_dropDown() {
        return numberOfRooms_dropDown;
    }

    public WebElement getTravelers_inputField() {
        return travelers_inputField;
    }

    public WebElement getAdults_plus_icon() {
        return adults_plus_icon;
    }

    public WebElement getChildren_plus_icon() {
        return children_plus_icon;
    }

    public List<WebElement> getRooms_list() {
        return rooms_list;
    }

    public boolean verifyAllFieldsAreDisplayed() {

        for (WebElement i : inputFields_list) {
            if (i.isDisplayed() && findHotels_button.isDisplayed() && numberOfRooms_dropDown.isDisplayed()) {
                return true;
            }

        }
        return false;
    }

    public void fillOutForm() throws InterruptedException {
        goingTo_inputField.click();
        Thread.sleep(500);
        goingTo_inputField.sendKeys("lasvegas");
        Thread.sleep(2000);
        goingTo_locations_list.get(0).click();
        Thread.sleep(1000);
        checkIn_inputField.click();
        Common.waitUntil(Dec_20_2021_element);
        Dec_20_2021_element.click();
        Thread.sleep(500);
        checkOut_input_field.click();
        Thread.sleep(500);
        Dec_31_2021_element.click();
        Common.waitUntil(findHotels_button);
    }
}
