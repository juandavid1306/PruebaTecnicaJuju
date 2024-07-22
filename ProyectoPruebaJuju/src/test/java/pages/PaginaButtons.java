package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PaginaButtons extends BasePage {

    public String clickButton = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]";

    public PaginaButtons(){

        super(driver);
    }

    public void DoubleClickElement(){
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton);
    }

    public void RightClickElement(){
        WebElement rightClickButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickButton).build().perform();
    }

    public void NormalClickButton(){
        clickElement(clickButton);
    }


    public String ResultDoubleClickButton() {
        WebElement xpathResultDoubleClickButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/p[1]"));
        String resultDoubleClickButton = xpathResultDoubleClickButton.getText();

        return resultDoubleClickButton;

    }

    public String ResultRightClickButton() {
        WebElement xpathResultRightClickButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/p[2]"));
        String resultRightClickButton = xpathResultRightClickButton.getText();

        return resultRightClickButton;

    }
    public String ResultNormalClickButton() {
        WebElement xpathNormalDoubleClickButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/p[3]"));
        String resultNormalClickButton = xpathNormalDoubleClickButton.getText();
        

        return resultNormalClickButton;

    }

    
    
}
