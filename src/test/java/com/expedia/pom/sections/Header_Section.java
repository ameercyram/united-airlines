package com.expedia.pom.sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.expedia.base.Hooks.driver;

public class Header_Section {

    @FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/div[5]/header/div/div/div[1]/div/div/div/div[2]/nav/ul/li[1]/div/div/button")
    private WebElement languageSelector_button;

    @FindBy(id = "localization-language-selector")
    private WebElement selectLanguage_dropdown;

    @FindBy(id="localization-language-selector_item-2")
    private WebElement espanolLanguage_option;

    @FindBy(xpath = "//div/button[text()='Cambiar']")
    private WebElement LanguageSelector_changeBtn;

    public Header_Section(){PageFactory.initElements(driver,this);}

    public WebElement getLanguageSelector_button() {return languageSelector_button;}

    public WebElement getSelectLanguage_dropdown() {return selectLanguage_dropdown;}

    public WebElement getEspanolLanguage_option() {return espanolLanguage_option;}

    public WebElement getLanguageSelector_changeBtn() {return LanguageSelector_changeBtn;}
}
