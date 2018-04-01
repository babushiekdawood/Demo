package common.toolbox;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by in.Babushaik on 8/4/2017.
 */
public class Element  {

    public static boolean click(WebDriver driver,NgWebDriver ngwebdriver, WebElement element) {
        boolean blResult = false;
        try {
            element.isDisplayed();

            element.click();
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public static boolean Verify(WebDriver driver,WebElement element) {
        boolean blVerify = false;
        try {

            element.isDisplayed();
            //strtxt.toString();
           // blVerify = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blVerify;
    }

//public static boolean StrVerify(WebDriver driver,WebElement element, String strtxt ) {
//
//
//    boolean blVerify = false;
//
//
//    if(userloggedin.equals(strtxt)) {
//        blVerify = true;
//    }
//    return blVerify;
//
//}

    public static boolean Elementwait(WebDriver driver, WebElement element) {
        boolean blVerify = false;
        try {

            element.isDisplayed();
            blVerify = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blVerify;
    }

    public static boolean Entervalue(WebDriver driver, WebElement element, String Entervalue) {
        boolean blentervalue = false;
        try {
            element.isDisplayed();
            element.click();
            element.sendKeys(Entervalue);
            blentervalue = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blentervalue;
    }

    public static boolean Returnkey(WebDriver driver, WebElement element) {
        boolean returnkey = false;
        try {

            element.sendKeys(Keys.RETURN);
            returnkey = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnkey;
    }
}
