package com.united.pom.travel_tabs.book_tab;

import com.united.utils.Common;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Car_Tab {

    @FindBy(css = "#bookCarTab-panel input")
    private List<WebElement> carTabInputField_list;

    @FindBy(css = "button[name='pickupTime']")
    private WebElement pickupTime_dropDown;

    @FindBy(css = "button[name='dropoffTime']")
    private WebElement dropOffTime_dropDown;

    @FindBy(css = "button[aria-label='Find cars button.']")
    private WebElement findCars_button;

    @FindBy(css = "input[placeholder='Drop off location']")
    private WebElement dropOffLocation_inputField;

    @FindBy(css = "#showDropOffLocation")
    private WebElement returnCerToSameLocation_checkbox;

    @FindBy(css = "input[name='hideAgeBox']")
    private WebElement primaryAgeIs25_checkbox;

    @FindBy(css = "input[placeholder='Age*']")
    private WebElement age_inputField;

    @FindBy(css = "#bookCarPickupInput")
    private WebElement pickupLocation_inputField;

    @FindBy(css = "div[class='app-components-AutoComplete-Legacy-styles__menu--O3pa1']>div>ul>li")
    private List<WebElement> pickupLocation_list;

    @FindBy(css = "input[name='bookCarPickupDate']")
    private WebElement pickupDate_inputField;

    @FindBy(css = "input[name='bookCarDropoffDate']")
    private WebElement dropOffDate_inputField;

    @FindBy(css = "tbody>tr>td[aria-label='Thursday, December 30, 2021']")
    private WebElement Dec_30_2021_element;

    @FindBy(css = "tbody>tr>td[aria-label='Tuesday, January 25, 2022']")
    private WebElement Jan_25_2022_element;

    @FindBy(xpath = "//span[text()='Book with miles']")
    private WebElement bookWithMiles_checkbox;

    public Car_Tab() {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getCarTabInputField_list() {
        return carTabInputField_list;
    }

    public WebElement getPickupTime_dropDown() {
        return pickupTime_dropDown;
    }

    public WebElement getDropOffTime_dropDown() {
        return dropOffTime_dropDown;
    }

    public WebElement getFindCars_button() {
        return findCars_button;
    }

    public WebElement getDropOffLocation_inputField() {
        return dropOffLocation_inputField;
    }

    public WebElement getReturnCerToSameLocation_checkbox() {
        return returnCerToSameLocation_checkbox;
    }

    public WebElement getAge_inputField() {
        return age_inputField;
    }

    public WebElement getPrimaryAgeIs25_checkbox() {
        return primaryAgeIs25_checkbox;
    }

    public WebElement getBookWithMiles_checkbox() {
        return bookWithMiles_checkbox;
    }

    public boolean verifyAllFieldsAreDisplayed() {
        for (WebElement list : carTabInputField_list) {
            if (list.isDisplayed() && pickupTime_dropDown.isDisplayed() && dropOffTime_dropDown.isDisplayed() && findCars_button.isDisplayed()) {
                return true;
            }
        }
        return false;
    }

    public void fillOutRentalCarTheForm() throws InterruptedException {
        pickupLocation_inputField.click();
        pickupLocation_inputField.sendKeys("dulles");
        Thread.sleep(2000);
        pickupLocation_list.get(0).click();
        Common.waitUntil(pickupDate_inputField);
        pickupDate_inputField.click();
        Thread.sleep(1000);
        Dec_30_2021_element.click();
        dropOffDate_inputField.click();
        Thread.sleep(1000);
        Jan_25_2022_element.click();
        Common.waitUntil(findCars_button);
    }
}
