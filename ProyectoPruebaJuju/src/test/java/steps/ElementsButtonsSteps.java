package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaButtons;
import pages.PaginaElements;
import pages.PaginaPrincipal;

public class ElementsButtonsSteps {
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaElements elementsPage = new PaginaElements();
    PaginaButtons buttonsPage = new PaginaButtons();

    
    @When("I click on Elements and select Buttons")
    public void selectElementsButtons() {
        landingPage.clickOnElegirElements();
        elementsPage.clickButtonsButton();

    }
    @And("I click the buttons: Double click me Right click me and Click me")
    public void clickOnButtons()  {

        buttonsPage.DoubleClickElement();
        buttonsPage.RightClickElement();
        buttonsPage.NormalClickButton();
        

    }

    @Then("I can validate the Buttons clicked")
    public void validateButtons() {

        String resultDoubleClickButton = buttonsPage.ResultDoubleClickButton();
        String resultRightClickButton = buttonsPage.ResultRightClickButton();

        Assert.assertNotEquals("You have done a double click", resultDoubleClickButton);
        Assert.assertNotEquals("You have done a right click", resultRightClickButton);
    }
    
}
