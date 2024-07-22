package pages;

public class PaginaElements extends BasePage {

    private String textBoxButton = "//span[normalize-space()='Text Box']";
    private String checkBoxButton = "//span[normalize-space()='Check Box']";
    private String radioButtonButton = "//span[normalize-space()='Radio Button']";
    private String webTablesButton = "//span[normalize-space()='Web Tables']";
    private String buttonsButton = "//span[normalize-space()='Buttons']";
    private String linksButton = "//span[normalize-space()='Links']";
    private String uploadAndDownloadButton = "//span[normalize-space()='Upload and Download']";

    public PaginaElements(){
        super(driver);
    }

    public void clickTextBoxButton(){
        clickElement(textBoxButton);
    }
    public void clickCheckBoxButton(){
        clickElement(checkBoxButton);
    }
    public void clickRadioButtonButton(){
        clickElement(radioButtonButton);
    }
    public void clickWebTablesButton(){
        clickElement(webTablesButton);
    }
    public void clickButtonsButton(){
        clickElement(buttonsButton);
    }
    public void clickLinksButton(){
        clickElement(linksButton);
    }
    public void clickUploadAndDownloadButton(){
        clickElement(uploadAndDownloadButton);
    }
    
}
