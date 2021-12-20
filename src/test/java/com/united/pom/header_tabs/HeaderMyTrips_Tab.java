package com.united.pom.header_tabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class HeaderMyTrips_Tab {

    @FindBy(xpath = "//span[text()='MY TRIPS']")
    private WebElement headerMyTripsTab_link;

    @FindBy(css = "div[class='app-components-GlobalHeader-globalHeader__tabPanelHeaderContainer--2veWq'] >div >ul >li>a")
    private List<WebElement> headerMyTripsTabLink_list;

    public HeaderMyTrips_Tab(){PageFactory.initElements(driver,this);}

    public WebElement getHeaderMyTripsTab_link() {return headerMyTripsTab_link;}

    public List<WebElement> getHeaderMyTripsTabLink_list() {return headerMyTripsTabLink_list;}
}
