package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage extends CommonAPI {
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[4]/a[1]")
    WebElement ElectronicsPag;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[4]/div[2]/div[1]/nav[1]/ul[1]/li[1]/a[1]")
    WebElement mera;
    @FindBy(xpath = "//span[contains(text(),'3D Printers & Supplies')]")
    WebElement printer;

    public ElectronicsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setElectronicsPag(){
        click(ElectronicsPag);
    }
public void setMera(){
        click(mera);
}
public void setPrinter(){
        click(printer);
}
}
