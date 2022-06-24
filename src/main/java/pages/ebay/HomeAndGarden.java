package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAndGarden extends CommonAPI {
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[6]/a[1]")
    WebElement GardenHome;

    @FindBy(xpath = "//span[contains(text(),'Bathroom Accessories & Supplies')]")
    WebElement Bathroom;

    @FindBy(xpath = "//a[contains(text(),'See all in Bathroom Accessories & Supplies')]")
    WebElement seeAllBathroom;

    public HomeAndGarden(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setGardenHome(){
        click(GardenHome);
    }
    public void setBathroom(){
        click(Bathroom);
    }
    public void setSeeAllBathroom(){
        click(seeAllBathroom);
    }
}
