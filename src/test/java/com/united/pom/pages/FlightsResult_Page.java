package com.united.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class FlightsResult_Page {

    @FindBy(xpath ="//*[@id='flightResults-content']/div[3]/div")
    private List<WebElement> availableFlight_list;

    @FindBy(css = "div[class='app-components-flifo-ResultsTable-resultsTable__data--cGMzx']>div")
    private List<WebElement> flightStatusResult_list;

    public FlightsResult_Page(){PageFactory.initElements(driver,this);}

    public List<WebElement> getAvailableFlight_list() {return availableFlight_list;}

    public List<WebElement> getFlightStatusResult_list() {return flightStatusResult_list;}
}
