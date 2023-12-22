package com.au.carsguide.steps;

import com.au.carsguide.pages.BuyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on {string} tab")
    public void iMouseHoverOnBuySellTab(String buyNSell) throws InterruptedException {
        new BuyPage().mouseHoverBuyAndSellTab(buyNSell);
    }

    @And("I click {string} link")
    public void iClickSearchCarsLink(String searchCars) throws InterruptedException {
        System.out.println(searchCars);
        new BuyPage().searchCarsLink(searchCars);
    }

    @And("I select make {string}")
    public void iSelectMake(String make) {
        new BuyPage().selectMake(make);
    }

    @And("I select model {string}")
    public void iSelectModel(String model) {
        new BuyPage().selectModel(model);
    }

    @And("I select location {string}")
    public void iSelectLocation(String location) {
        new BuyPage().selectLocation(location);
    }

    @And("I select price {string}")
    public void iSelectPrice(String price) {
        new BuyPage().selectPrice(price);
    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new BuyPage().clickOnFindMyNextCar();
    }

    @Then("I should see the make {string} in results")
    public void iShouldSeeTheMakeInResults(String make) {
        Assert.assertEquals(new BuyPage().verifyTheMake(make),make, "Error");
    }

    @Then("I navigate to {string} page")
    public void iNavigateToPage(String typesOfCars) throws InterruptedException {
        new BuyPage().navigateToNewAndUsedSearchCars(typesOfCars);
    }

}
