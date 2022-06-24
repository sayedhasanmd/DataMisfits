package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.InvalidLoginPage;
import pages.ebay.loginPage;

public class InvalidloginPage extends CommonAPI {
    @Test
    public void InvalidLoginCred() {
        InvalidLoginPage Ilogin = new InvalidLoginPage(getDriver());
      //  loginPage Login = new loginPage(getDriver());
        Ilogin.Signinup();
        waitFor(6);
        Ilogin.enterEmail("kevinsundep@gmal.com");
        Ilogin.Cbutton();
       // Ilogin.enterPassword("Testin123");
        //Ilogin.enterPasswordSignInBtn();
        //waitFor(7);
        Ilogin.logoBTn();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }

}
