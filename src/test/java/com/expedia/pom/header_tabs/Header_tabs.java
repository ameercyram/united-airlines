package com.expedia.pom.header_tabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.expedia.base.Hooks.driver;

public class Header_tabs {

    @FindBy(css = "div[role='tablist']>a")
    private List<WebElement> headerTabsLinks_list;

    public Header_tabs() {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getHeaderTabsLinks_list() {
        return headerTabsLinks_list;
    }
}


