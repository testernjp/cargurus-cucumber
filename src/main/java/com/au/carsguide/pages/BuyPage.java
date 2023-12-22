package com.au.carsguide.pages;

import com.au.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuyPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuyPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement buyNSellElement;

    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Search Cars']")
    WebElement searchCarsLink;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='All new & used cars']")
    WebElement newAndUsedCarsElement;
    @CacheLookup
    @FindBy(id = "makes")
    WebElement makesElement;
    @CacheLookup
    @FindBy(id = "models")
    WebElement modelElement;
    @CacheLookup
    @FindBy(id = "locations")
    WebElement locationElement;

    @CacheLookup
    @FindBy(id = "priceTo")
    WebElement priceElement;
    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement findMyNextCarElement;
    @CacheLookup
    @FindBy(xpath = "//h3[normalize-space()='Make']")
    WebElement makesElementOnResults;
    @CacheLookup
    @FindBy(css = "div[class='makeFilter'] div[class='mmvs']")
    WebElement makesFilterResult;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedCarsElement;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='All used cars']")
    WebElement allUsedCarsElement;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='All new cars']")
    WebElement allNewCarsElement;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findADealerElement;
    @CacheLookup
    @FindBy(xpath = "//h3[normalize-space()='Authorised Dealer For']")
    WebElement authorisedDealersElement;


    public void mouseHoverBuyAndSellTab(String buyNSell) throws InterruptedException {
        log.info("mouse hover on Buy n Sell :" +buyNSellElement.toString());
        mouseHoverToElement(buyNSellElement);
        Thread.sleep(2000);
    }
    public void searchCarsLink(String searchCars) throws InterruptedException {
        log.info("searchCarsLink :" +searchCarsLink.toString());
        Thread.sleep(3000);
        if(searchCars.contains("Search Cars")){
            mouseHoverToElementAndClick(searchCarsLink);
        } else if(searchCars.contains("Dealer")){
            mouseHoverToElementAndClick(findADealerElement);
        }
        else {
            mouseHoverToElementAndClick(usedCarsElement);
        }}
    public void navigateToNewAndUsedSearchCars(String typesOfCars) throws InterruptedException {
        log.info("navigateToNewAndUsedSearchCars :" + newAndUsedCarsElement.toString());
        if (typesOfCars.contains("new & used")) {
            Thread.sleep(2000);
            clickOnElement(newAndUsedCarsElement);
        } else if (typesOfCars.contains("new")) {
            clickOnElement(allNewCarsElement);
        } else if (typesOfCars.contains("used")) {
            clickOnElement(allUsedCarsElement);
        } else if (typesOfCars.contains("dealers")){
            clickOnElement(authorisedDealersElement);
        }
        else {
            System.out.println("Select one type");
        }
    }
    public void selectMake(String make){
        log.info("navigateToNewAndUsedSearchCars :" +makesElement.toString());
        selectByVisibleTextFromDropDown(makesElement, make);
    }
    public void selectModel(String model){
        log.info("selectModel :" +makesElement.toString());
        selectByVisibleTextFromDropDown(modelElement, model);
    }
    public void selectLocation(String location){
        log.info("selectLocation :" +locationElement.toString());
        selectByVisibleTextFromDropDown(locationElement, location);
    }
    public void selectPrice(String price){
        log.info("selectPrice :" +priceElement.toString());
        selectByVisibleTextFromDropDown(priceElement, price);
    }
    public void clickOnFindMyNextCar(){
        log.info("clickOnFindMyNextCar :" +findMyNextCarElement.toString());
        clickOnElement(findMyNextCarElement);
    }
    public String verifyTheMake(String make){
        //clickOnElement(makesElementOnResults);
        return getTextFromElement(makesFilterResult);
    }
    public void clickOnAllUsedCars(String usedCars){
        clickOnElement(allUsedCarsElement);
    }
}