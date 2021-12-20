package com.united.pom.header_tabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class HeaderBook_Tab {

    @FindBy(xpath = "//a/span[text()='BOOK']")
    private WebElement headerBookTab_link;

    @FindBy(css = "div[class='app-components-GlobalHeader-globalHeader__tabPanelHeaderContainer--2veWq'] >div >ul >li>a")
    private List<WebElement> headerBookTabLinks_list;

    @FindBy(xpath = "//div/div/h3[text()='BOOK A FLIGHT']")
    private WebElement bookFlightH3_tag;

    public HeaderBook_Tab() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getHeaderBookTab_link() {
        return headerBookTab_link;
    }

    public List<WebElement> getHeaderBookTabLinks_list() {
        return headerBookTabLinks_list;
    }

    public WebElement getBookFlightH3_tag() {
        return bookFlightH3_tag;
    }
}
