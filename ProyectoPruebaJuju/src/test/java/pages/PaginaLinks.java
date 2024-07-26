package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaginaLinks extends BasePage {

    public String linkHome = "//a[@id='simpleLink']";
    public String linkHomewcgrh = "//a[@id='dynamicLink']";
    public String linkCreated = "//a[@id='created']";
    public String linkNoContent = "//a[@id='no-content']";



    public PaginaLinks(){

        super(driver);
    }

    public void clickOnLinkCreated() {
        
        clickElement(linkCreated);
        
    }

    public void clickOnNoContent() {
        
        clickElement(linkCreated);
        
    }

    public String ResultLinkCreated() {
        WebElement xpathResultLinkCreated = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/p[10]"));
        String resultLinkCreated = xpathResultLinkCreated.getText();

        return resultLinkCreated;
    }

    public String ResultLinkNoContent() {
        WebElement xpathLinkNoContent = driver.findElement(By.xpath("//b[contains(text(),'No Content')]"));
        String resultLinkNoContent = xpathLinkNoContent.getText();

        return resultLinkNoContent;
    }

    public void OpenNewTab(){
        clickElement(linkHome);
        clickElement(linkHomewcgrh);
    }

    public void HandleTabs(){
        String mainTab = driver.getWindowHandle();
        String newTab = "";

        System.out.println("Main tab " + mainTab);

        clickElement(linkHome);

        Set<String> handles = driver.getWindowHandles();

        for (String actual : handles){
            System.out.println("-- Handled ID: " + actual);

            if (!actual.equalsIgnoreCase(mainTab)){
                System.out.println("-- Changing Tab --");
                driver.switchTo().window(actual);
                newTab = actual;
            }
        }

    

    }
    public boolean ResultNewTab (boolean isHeaderDisplayed){
        return isHeaderDisplayed = driver.findElement(By.xpath("//header/a[1]/img[1]")).isDisplayed();
    }
}