package common.Action;

import com.paulhammant.ngwebdriver.*;
import common.UIobject.Header;
import common.selenium.Propertyreader;
import common.toolbox.Element;
import common.toolbox.Sync;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by in.Babushaik on 8/4/2017.
 */
public class Headeraction extends Header {
    public static String Url = new Propertyreader().readProperty("Url");
    //private NgWebDriver ngwebdriver;

    public Headeraction(WebDriver driver,NgWebDriver ngwebdriver) {
        super(driver, ngwebdriver);

    }



    public boolean ClickloginpopupLogin() {
        boolean ClickloginpopupLogin = false;
        try {

            Element.click(driver, ngwebdriver,Loginbtn);
            ClickloginpopupLogin = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return ClickloginpopupLogin;
    }

//    public boolean Loginpopupverify() {
//        boolean loginpopupupverify = false;
//        try {
//
//            Element.click(driver, Loginpopupheading);
//            loginpopupupverify = true;
//        } catch (Exception e){
//            System.out.println(e);
//        }
//        return loginpopupupverify;
//
//    }
    public boolean Homepage() {

        boolean homepage = false;
        {
            try {
                Sync.angularwait();
                //driver.navigate().to(Url);
               // driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
               // ngwebdriver.waitForAngularRequestsToFinish();
                //ngwebdriver.waitForAngular2RequestsToFinish();
             // driver.get(Url);
                //driver.get("http://localhost:8080/");
                ///driver.findElement(By.xpath("//div[@class='logo']"));
                Sync.Explicitewait(driver,TrustnetLogo);
                Element.Verify(driver,TrustnetLogo);
                homepage = true;
            } catch (Exception e)
                {
                System.out.println(e);
                }
            return homepage;
        }
    }


    public boolean EnterUsername(String uname) {
        boolean enterUsername = false;
        {
            try {

                Element.Entervalue(driver, Username, uname);

                enterUsername = true;
            } catch (Exception e) {
                System.out.println(e);
            }
            return enterUsername;

        }
    }
    public boolean EnterPassword(String Pass) {
        boolean enterPassword = false;
        {
            try {

                Element.Entervalue(driver, password, Pass);

                enterPassword = true;
            } catch (Exception e) {
                System.out.println(e);
            }
            return enterPassword;

        }
    }}
