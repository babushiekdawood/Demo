package common.UIobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.paulhammant.ngwebdriver.*;

/**
 * Created by Babu on 09-08-2017.
 */
public class HomepageObject {
    protected final WebDriver driver;
    protected final NgWebDriver ngwebdriver;

    public HomepageObject(WebDriver driver, NgWebDriver ngwebdriver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.ngwebdriver=ngwebdriver;
    }

   // @FindBy(how = How.XPATH, using = "//a[@title='babuqa21 babuqa21']")
   // public WebElement LoggedUsername;

    @FindBy(how = How.XPATH, using = "//div[@class='header-title'][.='Find a Fund']")
    public WebElement FindaFundTitle;

    @FindBy(how = How.XPATH, using = "//div[@class='fund_lable']//input[@id='pfFundName']")
    public WebElement FindaFundsearchbox1;

    @ByAngularModel.FindBy(rootSelector ="input" , model="$ctrl.searchText")
    public WebElement FindaFundsearchbox;

    @FindBy(how = How.XPATH, using = "//div[@class='dialog-title-bar']")
    public WebElement Usertypepopup;

//@ByAngularModel.FindBy("//")



    @FindBy(how = How.XPATH, using = "//div[@class='cookies dialog-footer-link']//button[.='Continue']")
    public WebElement Usertypepopupcontinue;






    protected String LoggedUsername1 = new StringBuilder()
            .append("//a[@title='babulive21 babulive21'][.='")
            .append("<<F").toString();
}


