package com.expedia.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

import static com.expedia.base.Hooks.driver;

public class Home_Page {

    @FindBy(css = "div>span>a")
    private List<WebElement> advisorySection_links;



    public Home_Page(){PageFactory.initElements(driver,this);}

    public List<WebElement> getAdvisorySection_links() {return advisorySection_links;}
}
