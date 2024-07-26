package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaginaWebTables extends BasePage{

    public String addButton = "//button[@id='addNewRecordButton']";
    public String firstNameTextBox = "//input[@id='firstName']";
    public String lastNameTextBox = "//input[@id='lastName']";
    public String emailTextBox = "//input[@id='userEmail']";
    public String ageTextBox = "//input[@id='age']";
    public String salaryTextBox = "//input[@id='salary']";
    public String departmentTextBox = "//input[@id='department']";
    public String submitButton = "//button[@id='submit']";


    public PaginaWebTables(){
        super(driver);
    }

    public void EnterNewRecord(){
        clickElement(addButton);
        write(firstNameTextBox, "Juan David");
        write(lastNameTextBox, "Ospina");
        write(emailTextBox, "jdo13@gmail.com");
        write(ageTextBox, "29");
        write(salaryTextBox, "2000000");
        write(departmentTextBox, "Technology");
        clickElement(submitButton);
    }

    public String ResultTextBoxFirstName() {
        WebElement xpathFirstNameTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]"));
        String resultFirstName = xpathFirstNameTextBox.getText();

        return resultFirstName;
    }

    public String ResultTextBoxLastName() {
        WebElement xpathLastNameTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div[1]/div[2]"));
        String resultLastName = xpathLastNameTextBox.getText();

        return resultLastName;
    }

    public String ResultTextBoxEmail() {
        WebElement xpathEmailTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div[1]/div[4]"));
        String resultEmailName = xpathEmailTextBox.getText();

        return resultEmailName;
    }

    public String ResultTextBoxAge() {
        WebElement xpathAgeTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div[1]/div[3]"));
        String resultAge = xpathAgeTextBox.getText();

        return resultAge;
    }

    public String ResultTextBoxSalary() {
        WebElement xpathSalaryTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div[1]/div[5]"));
        String resultSalary = xpathSalaryTextBox.getText();

        return resultSalary;
    }

    public String ResultTextBoxDepartment() {
        WebElement xpathDepartmentTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div[1]/div[6]"));
        String resultDepartment = xpathDepartmentTextBox.getText();

        return resultDepartment;
    }




}