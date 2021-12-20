package com.united.pom.sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Footer_Section {

    @FindBy(css = "footer a")
    private List<WebElement> footerSectionLinks_list;

    public Footer_Section(){PageFactory.initElements(driver,this);}

    public List<WebElement> getFooterSectionLinks_list() {return footerSectionLinks_list;}
}
