package common.UIobject;

import com.paulhammant.ngwebdriver.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Babu on 18-03-2018.
 */
public class Fundsearchpageobjects {
    protected final WebDriver driver;
    protected final NgWebDriver ngwebdriver;

    public Fundsearchpageobjects(WebDriver driver,NgWebDriver ngwebdriver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.ngwebdriver=ngwebdriver;
    }

    @FindBy(how = How.XPATH, using = "//div[@id='fundSearchResults']")
    public WebElement Fundsearchpagetitle;



    //div[@id='fundSearchResults']
}
