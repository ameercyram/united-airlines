package com.united.pom.tables;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hooks.driver;

public class TravelDates_CalenderTable {

    @FindBy(css = "button[class='app-containers-BookCalendar-bookCalendar__nextIconContainer--308a5']")
    private WebElement CalenderNextArrow_button;

    @FindBy(xpath = "(//td/div/span[text()='15'])[1]")
    private WebElement feb_15_2022_element;

    @FindBy(xpath = "//td/div/span[text()='23']")
    private WebElement feb_25_2022_element;


    @FindBy(css = "tbody>tr>td[aria-label='Thursday, December 30, 2021']")
    private WebElement Dec_30_2021_element;

    @FindBy(css = "tbody>tr>td[aria-label='Tuesday, January 25, 2022']")
    private WebElement Jan_25_2022_element;




    public TravelDates_CalenderTable(){PageFactory.initElements(driver,this);}

    public WebElement getCalenderNextArrow_button() {return CalenderNextArrow_button;}

    public WebElement getFeb_15_2022_element() {return feb_15_2022_element;}

    public WebElement getFeb_25_2022_element() {return feb_25_2022_element;}

    public WebElement getDec_30_2021_element() {return Dec_30_2021_element;}

    public WebElement getJan_25_2022_element() {return Jan_25_2022_element;}
}
