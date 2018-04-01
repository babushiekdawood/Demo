package common.Action;

import common.UIobject.HomepageObject;
import common.toolbox.Element;
import common.toolbox.Sync;
import org.openqa.selenium.WebDriver;
import com.paulhammant.ngwebdriver.*;

/**
 * Created by Babu on 13-08-2017.
 */
public class Homepageaction extends HomepageObject {
   private NgWebDriver ngWebDriver;
    public Homepageaction(WebDriver driver,NgWebDriver ngwebdriver) {

        super(driver,ngwebdriver);

    }

    public boolean FindaFundTitle() {
        boolean findaFundTitle = false;
        try {
            //ngWebDriver.waitForAngularRequestsToFinish();
            Element.Verify(driver,FindaFundTitle);
            findaFundTitle = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return findaFundTitle;
    }

    public boolean Usertypepopup() {
        boolean usertypepopup = false;
        try {

            Element.Verify(driver,Usertypepopup);
            Element.click(driver,ngwebdriver,Usertypepopupcontinue);
            usertypepopup = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return usertypepopup;
    }

    public boolean FindaFundsearchbox() {
        boolean findaFundsearchbox = false;
        try {

            //Element.click(driver,FindaFundsearchbox);
            Element.click(driver,ngwebdriver,FindaFundsearchbox);
            //Sync.implicitewait();
            findaFundsearchbox = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return findaFundsearchbox;
    }
    public boolean Entersearchtext(String srchtxt) {
        boolean entersearchtext = false;
        try {
            Element.Entervalue(driver,FindaFundsearchbox,srchtxt);
            Element.Returnkey(driver,FindaFundsearchbox);
            entersearchtext = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return entersearchtext;
    }
    public boolean Refreshpage() {
        boolean refreshpage = false;
        try {

            Sync.refreshpage(driver);
            //ngWebDriver.waitForAngularRequestsToFinish();
          // ngWebDriver.waitForAngularRequestsToFinish();
          // ngWebDriver.waitForAngular2RequestsToFinish();
            refreshpage = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return refreshpage;
    }


//    public boolean LoginHomepage(String Firstlastname) {
//
//        WebElement userloggedin = Element.StrVerify(driver,LoggedUsername.findElement(By.))
//                Sync.waitForElement(driver, By.xpath(LoggedUsername., LoggedUsername1);
//        return Element.Verify(driver, userloggedin);
//
//    }
}
