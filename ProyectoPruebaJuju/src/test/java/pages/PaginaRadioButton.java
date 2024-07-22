package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaginaRadioButton extends BasePage {

    public String radioButtonYes = "//label[contains(text(),'Yes')]";

    public PaginaRadioButton(){

        super(driver);
    }

    public void ClickOnRadioButton() {
        
        clickElement(radioButtonYes);
        
    }

    public String ResultRadioButton() {
        WebElement xpathResultRadioButton = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
        String resultCurrentAddress = xpathResultRadioButton.getText();

        return resultCurrentAddress;

    }

    
    
}
