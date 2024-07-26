package steps;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaElements;
import pages.PaginaLinks;
import pages.PaginaPrincipal;

public class ElementsLinksSteps {
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaElements elementsPage = new PaginaElements();
    PaginaLinks linksPage = new PaginaLinks();

    
    @When("I click on Elements and select Links")
    public void selectElementsLinks() {
        landingPage.clickOnElegirElements();
        elementsPage.clickLinksButton();

    }
    @Then("I click the different links and I can validate the links clicked")
    public void clickOnLinksAndValidate()  {
        
        linksPage.HandleTabs();

        boolean isHeaderDisplayed = linksPage.ResultNewTab(false);

        Assert.assertTrue(isHeaderDisplayed);


    }

    
    
}
