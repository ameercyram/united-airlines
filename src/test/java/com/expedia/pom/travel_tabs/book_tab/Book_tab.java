package com.expedia.pom.travel_tabs.book_tab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;
import java.util.List;

import static com.expedia.base.Hooks.driver;

public class Book_tab {

    @FindBy(xpath = "//li//h2/span[text()='Book']")
    private WebElement bookTab_link;

    @FindBy(css = "#bookHotelTab")
    private WebElement hotelTab;

    @FindBy(xpath = "//*[@id='bookFlightOriginInput']")
    private WebElement leavingFrom_inputField;

    @FindBy(xpath = "//*[@id='bookFlightForm']/div[2]/div/div[1]/div/div/div[1]/div/button[2]")
    private WebElement leavingFrom_crossBtn;

    @FindBy(xpath = "//*[@id=\"autocomplete-item-0\"]")
    private WebElement dullesAirport_element;

    @FindBy(xpath = "//*[@id=\"bookFlightDestinationInput\"]")
    private WebElement goingTo_inputField;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[2]/div/div[1]/div/div/div[2]/div/button")
    private WebElement goingTo_crossBtn;

    @FindBy(xpath = "//*[@id=\"autocomplete-item-0\"]")
    private WebElement dubaiAirport_element;

    @FindBy(xpath = "//*[@id='bookFlightForm']/div[5]/div/div[1]/div/div/button")
    private WebElement findFlights_button;

    @FindBy(xpath = "//*[@id='bookFlightForm']/div[1]/fieldset/div/label[2]/span[2]")
    private WebElement oneWay_radioBTn;

    @FindBy(xpath = "//*[@id='DepartDate']")
    private WebElement departureDate_inputField;

    @FindBy(id = "ReturnDate")
    private WebElement returnDate_inputField;

    @FindBy(xpath = "//*[@id=\"passengersSlidingInputContainer\"]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]")
    private WebElement departureDate_calender;

    @FindBy(xpath = "(//td/div/span[text()='15'])[1]")
    private WebElement jan15_2022_element;

    @FindBy(xpath = "//*[@id='passengersSlidingInputContainer']/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[1]/button[1]")
    private WebElement prevArrowOnCalender_button;

    @FindBy(xpath = "//div[@id='passengersSlidingInputContainer']/div[2]/div/div")
    private WebElement travelersSelector_box;

    @FindBy(xpath = "//*[@id='passengerMenuId']/div[1]/div[1]/div[1]/div/input")
    private WebElement adultsTravelers_inputField;

    @FindBy(xpath = "//*[@id='passengerMenuId']/div[1]/div[1]/div[1]/div/button[2]")
    private WebElement adultTravelersPlus_button;

    @FindBy(xpath = "(//div[@id='passengerMenuId']/div/div/div/div/button)[1]")
    private WebElement adultsTravelerMinus_button;

    @FindBy(xpath = "//div/div/div/button[text()='+']")
    private List<WebElement> travelersSelectorPlusBtn_list;

    @FindBy(css = "#passengerMenuId input")
    private List<WebElement> travelersSelectorInputFields_list;

    @FindBy(xpath = "//*[@id='passengerMenuId']/div[1]/div[1]/div[3]/div/input")
    private WebElement infantsTravelers_inputField;

    @FindBy(xpath = "//*[@id='passengerMenuId']/div[3]/button[2]")
    private WebElement TravelersBox_crossBtn;

    @FindBy(css = "button[aria-label='Travel with a pet. This link would take you to the advance search page in the section to select the number of pets and flights.']")
    private WebElement travelWithPet_button;

    @FindBy(css = "#bookFlightTab-panel input")
    private List<WebElement> bookTab_inputFields;

    @FindBy(css = "#cabinType")
    private WebElement cabinTypeDropdown_button;

    @FindBy(css = "#cabinType>div")
    private WebElement cabinType_label;

    @FindBy(css = "div>ul[aria-labelledby=\"cabinDescriptor\"]>li[id=\"cabinType_item-1\"]")
    private List<WebElement> CabinTypeClassesOptions_list;

    @FindBy(css = "#bookCarTab")
    private WebElement car_tab;


    @FindBy(xpath = "//span[text()='Roundtrip']")
    private WebElement roundTrip_radioButton;

    @FindBy(css = "#passengerSelector >button")
    private WebElement travelersSelector_button;

    @FindBy(css = "button[aria-label='reverse origin and destination']")
    private WebElement switch_button;

    @FindBy(xpath = "//button/span[text()='Advanced search']")
    private WebElement advancedSearch_button;

    @FindBy(css = "#bookPackageTab")
    private WebElement packages_tab;

    @FindBy(css = "#bookCruiseTab")
    private WebElement cruise_link;


    public Book_tab() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getLeavingFrom_inputField() {return leavingFrom_inputField;}

    public WebElement getLeavingFrom_crossBtn() {return leavingFrom_crossBtn;}

    public WebElement getDullesAirport_element() {
        return dullesAirport_element;
    }

    public WebElement getGoingTo_inputField() {return goingTo_inputField;}

    public WebElement getDubaiAirport_element() {
        return dubaiAirport_element;
    }

    public WebElement getFindFlights_button() {
        return findFlights_button;
    }

    public WebElement getOneWay_radioBTn() {
        return oneWay_radioBTn;
    }

    public WebElement getDepartureDate_inputField() {
        return departureDate_inputField;
    }

    public WebElement getDepartureDate_calender() {
        return departureDate_calender;
    }

    public WebElement getJan15_2022_element() {
        return jan15_2022_element;
    }

    public WebElement getPrevArrowOnCalender_button() {
        return prevArrowOnCalender_button;
    }

    public WebElement getReturnDate_inputField() {
        return returnDate_inputField;
    }

    public WebElement getTravelersSelector_box() {return travelersSelector_box;}

    public WebElement getAdultsTravelers_inputField() {
        return adultsTravelers_inputField;
    }

    public WebElement getInfantsTravelers_inputField() {
        return infantsTravelers_inputField;
    }

    public WebElement getTravelersBox_crossBtn() {
        return TravelersBox_crossBtn;
    }

    public WebElement getBookTab_link() {return bookTab_link;}

    public List<WebElement> getBookTab_inputFields() {
        return bookTab_inputFields;
    }

    public WebElement getCabinTypeDropdown_button() {
        return cabinTypeDropdown_button;
    }

    public WebElement getRoundTrip_radioButton() {return roundTrip_radioButton;}

    public WebElement getTravelersSelector_button() {return travelersSelector_button;}

    public WebElement getSwitch_button() {return switch_button;}

    public WebElement getGoingTo_crossBtn() {return goingTo_crossBtn;}

    public WebElement getAdvancedSearch_button() {return advancedSearch_button;}

    public WebElement getAdultTravelersPlus_button() {return adultTravelersPlus_button;}

    public WebElement getAdultsTravelerMinus_button() {return adultsTravelerMinus_button;}

    public List<WebElement> getTravelersSelectorPlusBtn_list() {return travelersSelectorPlusBtn_list;}

    public List<WebElement> getTravelersSelectorInputFields_list() {return travelersSelectorInputFields_list;}

    public WebElement getCabinType_label() {return cabinType_label;}

    public List<WebElement> getCabinTypeClassesOptions_list() {return CabinTypeClassesOptions_list;}

    public WebElement getTravelWithPet_button() {return travelWithPet_button;}

    public WebElement getHotelTab() {return hotelTab;}

    public WebElement getCar_tab() {return car_tab;}

    public WebElement getPackages_tab() {return packages_tab;}

    public WebElement getCruise_link() {return cruise_link;}

    public boolean verify_allFields_is_displayed() {

        for (WebElement inputFields : bookTab_inputFields) {
            if (inputFields.isDisplayed() && cabinTypeDropdown_button.isDisplayed() && findFlights_button.isDisplayed()) {
                return true;
            }
        }
        return false;
    }
}
