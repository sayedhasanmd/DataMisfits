package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
public class HomePageTest extends CommonAPI {
    @Test
    public void homeTest(){
        HomePage HMT = new HomePage(getDriver());
        HMT.setShopnow();
       // HMT.setSummary();

       // HMT.setSerf();
        //HMT.setShopnow();
        //HMT.setPhotos();

        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }
    @Test
    public void summary(){
        HomePage HMT = new HomePage(getDriver());
        HMT.setSummary();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());




    }
    @Test
    public void serf(){
        HomePage HMT = new HomePage(getDriver());
        HMT.setShopnow();
        HMT.setSerf();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }
    @Test
    public void photos(){
        HomePage HMT = new HomePage(getDriver());
        HMT.setPhotos();

        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());



    }

}
