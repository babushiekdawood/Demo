package common.selenium;



import com.paulhammant.ngwebdriver.NgWebDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;



/**
 * Created by in.Babushaik on 7/26/2017.
 */
public class Initial{

    public WebDriver driver;

   @Before
    public void setup() {
       System.out.println("Intialize");

       driver = new Base().getDriver();
       driver.manage().window().maximize();
        //ngWebDriver =new Base().getDriver();

       }

@After
    public void cleanup()  {

            new Base().destroyDriver();
    }
}
