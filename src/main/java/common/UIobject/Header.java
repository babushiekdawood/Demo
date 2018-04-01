package common.UIobject;

import com.paulhammant.ngwebdriver.ByAngularButtonText;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by in.Babushaik on 4/21/2017.
 */
public class Header {
protected final WebDriver driver;
    protected final NgWebDriver ngwebdriver;

    public Header(WebDriver driver, NgWebDriver ngwebdriver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
        this.ngwebdriver=ngwebdriver;
    }

    @FindBy(how = How.XPATH, using = "//div[@class='logo']//img[@alt='FE Trustnet']")
    protected WebElement TrustnetLogo;
    @FindBy(how = How.ID, using = "LoginForm_UserName")
    protected WebElement Username;
    @FindBy(how = How.ID, using = "LoginForm_Password")
    protected WebElement password;
    @FindBy(how = How.XPATH, using = "//button[@type='submit'][.='LOGIN']")
    protected WebElement Loginbtn;

    /*public Header clicklogin(){

        Loginheaderbtn.click();
        return PageFactory.initElements(driver,Header.class);

    }*/

}

