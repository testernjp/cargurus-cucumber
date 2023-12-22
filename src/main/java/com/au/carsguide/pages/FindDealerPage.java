package com.au.carsguide.pages;

import com.au.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FindDealerPage extends Utility {

    private static final Logger log = LogManager.getLogger(FindDealerPage.class.getName());


    @CacheLookup
    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > section:nth-child(2) > div:nth-child(3) > div:nth-child(3) > div:nth-child(7) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")
    List<WebElement> dealerElements;
    public String checkDealerNamesAvailable(String dealerNames){
        List<WebElement> dealer = dealerElements;
        //ArrayList<String> dealernames = new ArrayList<>();
        log.info("check dealers name :" +dealerElements.toString());
        for(WebElement e : dealer){
            if (e.getText().contains(dealerNames)) {
                System.out.println("Dealers :"+e.getText());
                break;
            }
        }return dealerNames;
    }
}
