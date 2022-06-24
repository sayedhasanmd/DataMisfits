package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectiblesArtPage extends CommonAPI {

    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[5]/a[1]")
    WebElement mainContent;

    @FindBy(xpath = "//span[contains(text(),'Antiques')]")
    WebElement Antiques;

    @FindBy(xpath = "//span[contains(text(),'Antiques')]")
    WebElement seeAntiques;

    public CollectiblesArtPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setMainContent(){
        click(mainContent);
    }
    public void setAntiques(){
        click(Antiques);
    }
    public void setSeeAntiques(){
        click(seeAntiques);
    }
}
