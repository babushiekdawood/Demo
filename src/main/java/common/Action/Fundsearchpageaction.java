package common.Action;

import com.paulhammant.ngwebdriver.NgWebDriver;
import common.UIobject.Fundsearchpageobjects;
import common.toolbox.Element;
import common.toolbox.Sync;
import org.openqa.selenium.WebDriver;

/**
 * Created by Babu on 18-03-2018.
 */
public class Fundsearchpageaction extends Fundsearchpageobjects {

    public Fundsearchpageaction(WebDriver driver, NgWebDriver ngwebdriver) {
        super(driver,ngwebdriver);
    }

    public boolean Fundsearchpagetitle() {
        boolean fundsearchpagetitle = false;
        try {
            Sync.angularwait();
           // Element.Verify(driver,Fundsearchpagetitle);
            Element.Verify(driver,Fundsearchpagetitle);
            fundsearchpagetitle = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return fundsearchpagetitle;
    }

}
