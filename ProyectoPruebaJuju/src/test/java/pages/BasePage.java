package pages;
 
// Importaciones necesarias
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class BasePage {
    
    protected static WebDriver driver;
    
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
 
    
    static {
        WebDriverManager.chromedriver().setup();
 
        
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }
 
    
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }
 
    
    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void closeBrowser(){
        driver.quit();
    }

    public WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
 
    public void clickElement(String locator){
        Find(locator).click();
    }

    public void write(String locator, String keysToSend){
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }

   

    



 
}
