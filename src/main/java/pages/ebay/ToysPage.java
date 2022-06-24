package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToysPage extends CommonAPI {
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[8]/a[1]")
    WebElement Toy;

    @FindBy(xpath = "//span[contains(text(),'Action Figures')]")
    WebElement ActionFigure;

    @FindBy(xpath = "//a[contains(text(),'See all in Action Figures')]")
    WebElement seeActionFigure;

    public ToysPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setToy(){
        click(Toy);
    }
    public void setActionFigure(){
        click(ActionFigure);
    }
    public void setSeeActionFigure(){
        click(seeActionFigure);
    }

}
