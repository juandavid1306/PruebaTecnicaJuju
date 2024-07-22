package pages;
 
public class PaginaPrincipal extends BasePage {

    private String elegirElements = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]";

 
    public PaginaPrincipal() {
        super(driver);
    }
 
    public void navigateToDemoQa() {
        navigateTo("https://demoqa.com/");
        

    }

    public void clickOnElegirElements() {
        clickElement(elegirElements);
    }
 
} 
