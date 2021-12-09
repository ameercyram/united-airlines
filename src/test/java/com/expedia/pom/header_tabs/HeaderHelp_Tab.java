package com.expedia.pom.header_tabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.expedia.base.Hooks.driver;

public class HeaderHelp_Tab {

    @FindBy(xpath = "//span[text()='HELP']")
    private WebElement headerHelpTab_link;

    @FindBy(css = "div[class='app-components-GlobalHeader-globalHeader__tabPanelHeaderContainer--2veWq']>div>ul>li>a")
    private List<WebElement> headerHelpLinks_list;


    public HeaderHelp_Tab() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getHeaderHelpTab_link() {
        return headerHelpTab_link;
    }

    public List<WebElement> getHeaderHelpLinks_list() {
        return headerHelpLinks_list;
    }
}
