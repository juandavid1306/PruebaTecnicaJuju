package pages;

import org.openqa.selenium.By;

public class PaginaCheckBox extends BasePage {

    public String deployAllFilesButtom = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]/*[1]";
    public String notesCheckBox = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[3]";
    public String workSpaceCheckBox = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]";
    public String officeCheckBox = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]";
    public String wordFileCheckBox = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]";

    public PaginaCheckBox(){

        super(driver);
    }

    public void clickOnFiles() {
        
        clickElement(deployAllFilesButtom);
        clickElement(notesCheckBox);
        clickElement(workSpaceCheckBox);
        clickElement(officeCheckBox);
        
    }

    public boolean ResultCheckBoxesSelected (boolean checkBoxesSelected){
        return checkBoxesSelected = driver.findElement(By.xpath("//div[@id='result']")).isDisplayed();
    }

    
    
}
