package com.united.pom.header_tabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class HeaderDeals_Tab {

    @FindBy(xpath = "//span[text()='DEALS']")
    private WebElement headerDeals_link;

    @FindBy(css = "div[class='app-components-GlobalHeader-globalHeader__tabPanelHeaderContainer--2veWq']>div>ul>li>a")
    private List<WebElement> headerDealsLinks_list;

    public HeaderDeals_Tab() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getHeaderDeals_link() {
        return headerDeals_link;
    }

    public List<WebElement> getHeaderDealsLinks_list() {
        return headerDealsLinks_list;
    }
}
