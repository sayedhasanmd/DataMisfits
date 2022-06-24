package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothingShoesPages extends CommonAPI {
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[7]/a[1]")
    WebElement ClothingShoes;

    @FindBy(xpath = "ClothingShoesPages")
    WebElement Women;

    @FindBy(xpath = "//a[contains(text(),'See all in Women')]")
    WebElement seeAllWomen;

    public ClothingShoesPages(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setClothingShoes(){
        click(ClothingShoes);
    }
    public void setWomen(){
        click(Women);
    }
    public void setSeeAllWomen(){
        click(seeAllWomen);
    }

}
