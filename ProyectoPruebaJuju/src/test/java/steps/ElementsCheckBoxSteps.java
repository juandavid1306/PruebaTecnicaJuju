package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaElements;
import pages.PaginaPrincipal;
import pages.PaginaCheckBox;

public class ElementsCheckBoxSteps {
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaElements elementsPage = new PaginaElements();
    PaginaCheckBox checkBoxPage = new PaginaCheckBox();

    
    @When("I click on Elements and select Check box")
    public void selectElementsCheckBox() {
        landingPage.clickOnElegirElements();
        elementsPage.clickCheckBoxButton();

    }
    @And("I click the checks box that i need")
    public void clickOnChecksBox()  {
        checkBoxPage.clickOnFiles();
    }

    @Then("I can validate the checks box")
    public void validateChecksBox() {

        boolean checkBoxesSelected = checkBoxPage.ResultCheckBoxesSelected(false);

        Assert.assertTrue(checkBoxesSelected);
    }
    
}
