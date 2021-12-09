package com.expedia.pom.header_tabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.expedia.base.Hooks.driver;

public class HeaderTravelInfo_Tab {

    @FindBy(xpath = "//span[text()='TRAVEL INFO']")
    private WebElement travelInfo_link;

    @FindBy(css = "div[class='app-components-GlobalHeader-globalHeader__tabPanelHeaderContainer--2veWq']>div>ul>li>a")
    private List<WebElement> travelInfoLinks_list;

    public HeaderTravelInfo_Tab() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getTravelInfo_link() {
        return travelInfo_link;
    }

    public List<WebElement> getTravelInfoLinks_list() {
        return travelInfoLinks_list;
    }
}
