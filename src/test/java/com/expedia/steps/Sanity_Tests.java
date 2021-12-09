package com.expedia.steps;

import com.expedia.pom.header_tabs.*;
import com.expedia.pom.pages.Home_Page;
import com.expedia.pom.sections.Footer_Section;
import com.expedia.pom.sections.Header_Section;
import com.expedia.pom.travel_tabs.book_tab.Book_tab;
import com.expedia.pom.travel_tabs.ChecksIn_Tab;
import com.expedia.pom.travel_tabs.FlightStatus_Tab;
import com.expedia.pom.travel_tabs.MyTrips_Tab;
import com.expedia.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.expedia.base.Hooks.driver;

public class Sanity_Tests {
    @Given("click on the language selector button in the header")
    public void clickOnTheLanguageSelectorButtonInTheHeader() {

        Header_Section header_section = new Header_Section();
        header_section.getLanguageSelector_button().click();
        Common.waitUntil(header_section.getSelectLanguage_dropdown());
    }

    @And("click on the select language dropdown")
    public void clickOnTheSelectLanguageDropdown() {
        Header_Section header_section = new Header_Section();
        header_section.getSelectLanguage_dropdown().click();
        Common.waitUntil(header_section.getEspanolLanguage_option());
    }

    @Then("select the desirable option from dropdown")
    public void selectTheDesirableOptionFromDropdown() {
        Header_Section header_section = new Header_Section();
        header_section.getEspanolLanguage_option().click();
        Common.waitUntil(header_section.getLanguageSelector_changeBtn());
        header_section.getLanguageSelector_changeBtn().click();

    }

    @Then("click on the change button")
    public void clickOnTheChangeButton() {
        Header_Section header_section = new Header_Section();
        Common.waitUntil(header_section.getLanguageSelector_button());
    }

    @And("verify the language is changed successfully")
    public void verifyTheLanguageIsChangedSuccessfully() {
        Header_Section header_section = new Header_Section();
        String text = header_section.getLanguageSelector_button().getText();
        Assert.assertTrue(text.contains("Español"));
    }

    @Given("click on the Book tab")
    public void clickOnTheBookTab() {
        Book_tab book_tab = new Book_tab();
        book_tab.getBookTab_link().click();


    }

    @And("verify Book tab displays correct fields")
    public void verifyBookTabDisplaysCorrectFields() {
        Book_tab book_tab = new Book_tab();
        boolean result = book_tab.verify_allFields_is_displayed();
        Assert.assertTrue(result);
    }

    @Then("click on Flight status tab")
    public void clickOnFlightStatusTab() {

        FlightStatus_Tab flightStatus_tab = new FlightStatus_Tab();
        Common.waitUntil(flightStatus_tab.getFlight_status_tab());
        flightStatus_tab.getFlight_status_tab().click();
    }

    @And("verify Flight status tab shows correct fields")
    public void verifyFlightStatusTabShowsCorrectFields() {
        FlightStatus_Tab flightStatus_tab = new FlightStatus_Tab();
        boolean result = flightStatus_tab.verify_allInputs_is_displayed();
        Assert.assertTrue(result);
    }

    @Then("click on the check in tab")
    public void clickOnTheChecksInTab() {
        ChecksIn_Tab checksIn_tab = new ChecksIn_Tab();
        Common.waitUntil(checksIn_tab.getChecksIn_tab());
        checksIn_tab.getChecksIn_tab().click();
        Common.waitUntil(checksIn_tab.getSearch_button());

    }

    @And("verify Checks in tab shows correct fields")
    public void verifyChecksInTabShowsCorrectFields() {
        ChecksIn_Tab checksIn_tab = new ChecksIn_Tab();
        boolean result = checksIn_tab.verify_allInputsField_and_searchButton_isDisplayed();
        Assert.assertTrue(result);
    }

    @Then("click on the My Trips tab")
    public void clickOnTheMyTripsTab() {
        MyTrips_Tab myTrips_tab = new MyTrips_Tab();
        myTrips_tab.getMyTrips_tab().click();
        Common.waitUntil(myTrips_tab.getSearch_button());

    }

    @And("verify My Trips shows correct fields")
    public void verifyMyTripsShowsCorrectFields() {
        MyTrips_Tab myTrips_tab = new MyTrips_Tab();
        boolean result = myTrips_tab.verify_inputFields_and_searchButton();
        Assert.assertTrue(result);
    }

    @Given("verify user is on home page")
    public void verifyUserIsOnHomePage() {

        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.united.com/en/us";
        Assert.assertEquals(currentUrl, expectedUrl);
    }

    @Then("verify info is displayed with links")
    public void verifyInfoIsDisplayedWithLinks() {
        Home_Page home_page = new Home_Page();
        List<WebElement> advisorySection_links = home_page.getAdvisorySection_links();
        for (WebElement links : advisorySection_links) {
            String href = links.getAttribute("href");
            Assert.assertFalse(href.isEmpty());
        }

    }


    @Then("verify all footer section links have href attributes")
    public void verifyAllFooterSectionLinksHaveHrefAttributes() {
        Footer_Section footer_section = new Footer_Section();
        List<WebElement> footerSectionLinks_list = footer_section.getFooterSectionLinks_list();
        for (WebElement links : footerSectionLinks_list) {
            String href = links.getAttribute("href");
            Assert.assertFalse(href.isEmpty());
        }

    }


    @Given("click on the header Book tab")
    public void clickOnTheHeaderBookTab() {
        HeaderBook_Tab headerBook_tab = new HeaderBook_Tab();
        headerBook_tab.getHeaderBookTab_link().click();
        Common.waitUntil(headerBook_tab.getBookFlightH3_tag());
    }

    @And("verify Book tab related links are displayed on the panel")
    public void verify_Book_tab_related_links_are_displayed_on_the_panel() {
        HeaderBook_Tab headerBook_tab = new HeaderBook_Tab();
        List<WebElement> headerBookTabLinks_list = headerBook_tab.getHeaderBookTabLinks_list();
        int size = headerBookTabLinks_list.size();
        Assert.assertEquals(size, 10);


    }

    @Then("click on header My Trips tab")
    public void clickOnHeaderMyTripsTab() throws InterruptedException {
        HeaderMyTrips_Tab headerMyTrips_tab = new HeaderMyTrips_Tab();
        headerMyTrips_tab.getHeaderMyTripsTab_link().click();
        Thread.sleep(2000);
    }

    @And("verify My Trips tab related links are displayed on the panel")
    public void verifyMyTripsRelatedLinksDisplayThere() {
        HeaderMyTrips_Tab headerMyTrips_tab = new HeaderMyTrips_Tab();
        List<WebElement> headerMyTripsTabLink_list = headerMyTrips_tab.getHeaderMyTripsTabLink_list();
        int size = headerMyTripsTabLink_list.size();
        System.out.println(size);
    }

    @Then("click on header Travel tab")
    public void clickOnHeaderTravelTab() throws InterruptedException {
        HeaderTravelInfo_Tab headerTravelInfo_tab = new HeaderTravelInfo_Tab();
        headerTravelInfo_tab.getTravelInfo_link().click();
        Thread.sleep(2000);
    }

    @And("verify Travel tab related links are displayed on the panel")
    public void verifyTravelRelatedLinksDisplayThere() {
        HeaderTravelInfo_Tab headerTravelInfo_tab = new HeaderTravelInfo_Tab();
        List<WebElement> travelInfoLinks_list = headerTravelInfo_tab.getTravelInfoLinks_list();
        for (WebElement links : travelInfoLinks_list) {
            boolean displayed = links.isDisplayed();
            Assert.assertTrue(displayed);
        }
    }

    @Then("click on the header MileAgePlus tab")
    public void clickOnTheHeaderMileAgePlusTab() throws InterruptedException {
        HeaderMileAgePlus_Tab headerMileAgePlus_tab = new HeaderMileAgePlus_Tab();
        headerMileAgePlus_tab.getHeaderMileagePlus_link().click();
        Thread.sleep(2000);
    }

    @And("verify MileAgePlus tab related links are displayed on the panel")
    public void verifyMileAgePlusRelatedLinksDisplayThere() {
        HeaderMileAgePlus_Tab headerMileAgePlus_tab = new HeaderMileAgePlus_Tab();
        List<WebElement> mileagePlusLinks_list = headerMileAgePlus_tab.getMileagePlusLinks_list();
        for (WebElement links : mileagePlusLinks_list) {
            boolean result = links.isDisplayed();
            Assert.assertTrue(result);
        }

    }

    @Then("click on the header Deals tab")
    public void clickOnTheHeaderDealsTab() throws InterruptedException {
        HeaderDeals_Tab headerDeals_tab = new HeaderDeals_Tab();
        headerDeals_tab.getHeaderDeals_link().click();
        Thread.sleep(2000);
    }

    @And("verify Deals tab related links are displayed on the panel")
    public void verifyDealsRelatedLinksDisplayThere() {
        HeaderDeals_Tab headerDeals_tab = new HeaderDeals_Tab();
        List<WebElement> headerDealsLinks_list = headerDeals_tab.getHeaderDealsLinks_list();
        for (WebElement links : headerDealsLinks_list) {
            boolean result = links.isDisplayed();
            Assert.assertTrue(result);
        }
    }

    @Then("click on the header Help tab")
    public void clickOnTheHeaderHelpTab() throws InterruptedException {
        HeaderHelp_Tab headerHelp_tab = new HeaderHelp_Tab();
        headerHelp_tab.getHeaderHelpTab_link().click();
        Thread.sleep(2000);
    }

    @And("verify Help tab related links are displayed on the panel")
    public void verifyHelpRelatedLinksDisplayThere() {
        HeaderHelp_Tab headerHelp_tab = new HeaderHelp_Tab();
        List<WebElement> headerHelpLinks_list = headerHelp_tab.getHeaderHelpLinks_list();
        for (WebElement links : headerHelpLinks_list) {
            boolean result = links.isDisplayed();
            Assert.assertTrue(result);
        }
    }
}
