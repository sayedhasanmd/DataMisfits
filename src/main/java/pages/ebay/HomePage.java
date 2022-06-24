package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-eb']/li[@id='gh-eb-My']/div[1]/a[1]")
    WebElement Mebay;

    @FindBy(xpath = "//a[contains(text(),'Summary')]")
    WebElement Summary;

    @FindBy(xpath ="//img[@id='gh-logo']")
    WebElement ebayHome;

    @FindBy(xpath = "//a[contains(text(),'Recently Viewed')]")
    WebElement reView;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setShopnow(){
        click(Mebay);
    }
public void setSerf(){
        click(ebayHome);
}
public void setPhotos(){
        click(reView);
}
public void setSummary (){
        click(Summary);
}
}
