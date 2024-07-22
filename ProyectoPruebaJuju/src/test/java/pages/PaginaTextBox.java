package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaginaTextBox extends BasePage{

    public String fullNameTextBox = "//input[@id='userName']";
    public String emailTextBox = "//input[@id='userEmail']";
    public String currentAddressTextBox = "//textarea[@id='currentAddress']";
    public String permanentAddressTextBox = "//textarea[@id='permanentAddress']";
    public String submitButtonTextBox = "//button[@id='submit']";
    public String informationSubmitted = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[1]";


    public PaginaTextBox(){
        super(driver);
    }

    public void enterInformation(){
        write(fullNameTextBox, "Juan David Ospina");
        write(emailTextBox, "jdo13@gmail.com");
        write(currentAddressTextBox, "Av 30 c sur");
        write(permanentAddressTextBox, "Cra 16 b norte");
    }
    public void clickOnSubmitButtonTextBox() {
        clickElement(submitButtonTextBox);
    }
    

    public String ResultTextBoxFullName() {
        WebElement xpathFullNameTextBox = driver.findElement(By.xpath("//p[@id='name']"));
        String resultFullName = xpathFullNameTextBox.getText();

        return resultFullName;
    }

    public String ResultTextBoxEmail() {
        WebElement xpathEmailTextBox = driver.findElement(By.xpath("//p[@id='email']"));
        String resultEmail = xpathEmailTextBox.getText();

        return resultEmail;

    }
    public String ResultCurrentAddress() {
        WebElement xpathCurrentAddressTextBox = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        String resultCurrentAddress = xpathCurrentAddressTextBox.getText();

        return resultCurrentAddress;

    }
    public String ResultPermanentAddress() {
        WebElement xpathPermanentAddressTextBox = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        String resultPermanentAddress = xpathPermanentAddressTextBox.getText();

        return resultPermanentAddress;

    }

    








    
}