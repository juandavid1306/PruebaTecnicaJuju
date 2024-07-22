package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaElements;
import pages.PaginaPrincipal;
import pages.PaginaRadioButton;

public class ElementsRadioButtonSteps {
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaElements elementsPage = new PaginaElements();
    PaginaRadioButton radioButtonPage = new PaginaRadioButton();

    
    @When("I click on Elements and select Radio Button")
    public void selectElementsRadioButton() {
        landingPage.clickOnElegirElements();
        elementsPage.clickRadioButtonButton();

    }
    @And("I click radio button Yes")
    public void clickOnRadioButton()  {
        radioButtonPage.ClickOnRadioButton();
    }

    @Then("I can validate the Radio Button")
    public void validateRadioButton() {

        String resultRadioButton = radioButtonPage.ResultRadioButton();

        Assert.assertEquals("Yes", resultRadioButton);
    }
    
}
