package steps;

import org.testng.Assert;
 
import io.cucumber.java.en.*;
import pages.PaginaElements;
import pages.PaginaPrincipal;
import pages.PaginaTextBox;


 
public class ElementsTextBoxSteps {

    
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaElements elementsPage = new PaginaElements();
    PaginaTextBox textBoxPage = new PaginaTextBox();
 
    @Given("I navigate to www.demoqa.com")
    public void iNavigateToDMQA() {
        landingPage.navigateToDemoQa();
    }

    @When("I click on Elements and select Text box")
    public void selectElements() {
        landingPage.clickOnElegirElements();
        elementsPage.clickTextBoxButton();

    }

    @And("I enter the information and click submit")
    public void enterInformationInTextBox() {
        textBoxPage.enterInformation();
        textBoxPage.clickOnSubmitButtonTextBox();

    }
    @Then("I can validate the information in the page")
    public void validateInformationTextBox() {

        String resultFullName = textBoxPage.ResultTextBoxFullName();
        String resultEmail = textBoxPage.ResultTextBoxEmail();
        String resultCurrentAddress = textBoxPage.ResultCurrentAddress();
        String resultPermanentAddress = textBoxPage.ResultPermanentAddress();

        Assert.assertEquals("Name:Juan David Ospina", resultFullName);
        Assert.assertEquals("Email:jdo13@gmail.com", resultEmail);
        Assert.assertEquals("Current Address :Av 30 c sur", resultCurrentAddress);
        Assert.assertEquals("Permananet Address :Cra 16 b norte", resultPermanentAddress);


    }
}