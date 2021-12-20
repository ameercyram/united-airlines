package com.united.pom.header_tabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class HeaderMileAgePlus_Tab {

    @FindBy(xpath = "//span[text()='MILEAGEPLUS® PROGRAM']")
    private WebElement headerMileagePlus_link;

    @FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/div[5]/header/div/div/div[1]/div/div/div/div[2]/nav/div/div[1]/div/div[2]")
    private WebElement mileAgePlusDisplayPanel_element;

    @FindBy(css = "div[class='app-components-GlobalHeader-globalHeader__tabPanelHeaderContainer--2veWq'] >div>ul>li>a")
    private List<WebElement> mileagePlusLinks_list;

    public HeaderMileAgePlus_Tab() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getHeaderMileagePlus_link() {
        return headerMileagePlus_link;
    }

    public WebElement getMileAgePlusDisplayPanel_element() {
        return mileAgePlusDisplayPanel_element;
    }

    public List<WebElement> getMileagePlusLinks_list() {
        return mileagePlusLinks_list;
    }
}
