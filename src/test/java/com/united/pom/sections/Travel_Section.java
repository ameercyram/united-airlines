package com.united.pom.sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Travel_Section {

    @FindBy(css = "ul[class='app-components-BookTravel-bookTravel__travelNav--3RNBj'] >li")
    private List<WebElement> travel_tabs;





    public Travel_Section(){PageFactory.initElements(driver,this);}

    public List<WebElement> getTravel_tabs() {return travel_tabs;}


}
