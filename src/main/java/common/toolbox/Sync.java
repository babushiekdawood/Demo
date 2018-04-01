package common.toolbox;

import com.google.common.base.Function;
import com.paulhammant.ngwebdriver.NgWebDriver;
import common.selenium.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


/**
 * Created by Babu on 10-08-2017.
 */
public class Sync extends Base {

    public Sync() throws Exception {
    }

    public static void implicitewait(){

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

    public static void Explicitewait(WebDriver driver, WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElement(WebDriver driver, By by){

    }
    public WebElement fluentWait(final By locator){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);


        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });

        return foo;

    };
public static void angularwait(){
    ngwebdriver.waitForAngularRequestsToFinish();
}
    public static void refreshpage(WebDriver driver){
        driver.navigate().refresh();

    }

}
