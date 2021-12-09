package com.expedia.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.expedia.base.Hooks.driver;

public class PackagesResult_Page {

    @FindBy(css = "div[class='HotelsList__StyledHotelsList-sc-1epc8tr-1 kKhicP']>div")
    private List<WebElement> packagesSearchResult_list;

    public PackagesResult_Page(){PageFactory.initElements(driver,this);}

    public List<WebElement> getPackagesSearchResult_list() {return packagesSearchResult_list;}
}
