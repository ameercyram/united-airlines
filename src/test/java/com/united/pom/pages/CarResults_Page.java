package com.united.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class CarResults_Page {

    @FindBy(css = "#ct-availability-list>div")
    private List<WebElement> carResults_list;

    @FindBy(css = "div>p[ng-bind='::$ctrl.i18n($ctrl.custom.msg)']")
    private WebElement cannotRentCar_message;


    public CarResults_Page(){PageFactory.initElements(driver,this);}

    public List<WebElement> getCarResults_list() {return carResults_list;}

    public WebElement getCannotRentCar_message() {return cannotRentCar_message;}
}
