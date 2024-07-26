package steps;

import org.testng.Assert;
 
import io.cucumber.java.en.*;
import pages.PaginaElements;
import pages.PaginaPrincipal;
import pages.PaginaWebTables;


 
public class ElementsWebTablesSteps {

    
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaElements elementsPage = new PaginaElements();
    PaginaWebTables webTablesPage = new PaginaWebTables();

    @When("I click on Elements and select Web Tables")
    public void selectElements() {
        landingPage.clickOnElegirElements();
        elementsPage.clickWebTablesButton();

    }

    @And("I click Add button and create a new record")
    public void createNewRecord() {
        webTablesPage.EnterNewRecord();

    }
    @Then("I can validate the new record")
    public void validateInformationTextBox() {

        String resultFirstName = webTablesPage.ResultTextBoxFirstName();
        String resultLastName = webTablesPage.ResultTextBoxLastName();
        String resultEmail = webTablesPage.ResultTextBoxEmail();
        String resultAge = webTablesPage.ResultTextBoxAge();
        String resultSalary = webTablesPage.ResultTextBoxSalary();
        String resultDepartment = webTablesPage.ResultTextBoxDepartment();

        Assert.assertEquals("Juan David", resultFirstName);
        Assert.assertEquals("Ospina", resultLastName);
        Assert.assertEquals("jdo13@gmail.com", resultEmail);
        Assert.assertEquals("29", resultAge);
        Assert.assertEquals("2000000", resultSalary);
        Assert.assertEquals("Technology", resultDepartment);
    }
}
