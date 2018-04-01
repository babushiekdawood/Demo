package common.selenium;


import common.Action.Fundsearchpageaction;
import common.Action.Headeraction;
import common.Action.Homepageaction;
import common.UIobject.Header;
import cucumber.api.java.fi.Ja;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;



import java.util.HashMap;
import java.util.List;
import com.paulhammant.ngwebdriver.*;



import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.Server;

import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.MovedContextHandler;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.StdErrLog;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.hasItems;


/**
 * Created by in.Babushaik on 7/24/2017.
 */
public class Base {

    protected static WebDriver driver;
    protected static NgWebDriver ngwebdriver;
    public static String Url = new Propertyreader().readProperty("Url");

    protected static Server webServer;
    public Headeraction headeraction;
    public Homepageaction homepageaction;
    public Fundsearchpageaction fundsearchpageaction;
    public List<HashMap<String, String>> datamap;

    public Base() {
        initpages();
    }


    public void initpages() {

        headeraction = new Headeraction(driver,ngwebdriver);
        homepageaction = new Homepageaction(driver,ngwebdriver);
        fundsearchpageaction = new Fundsearchpageaction(driver, ngwebdriver);


        if (driver == null)

            createNewDriverInstance();
    }

    public  WebDriver createNewDriverInstance() {
        if (driver == null) {
            String browser = new Propertyreader().readProperty("browser");

            if (browser.equals("chrome")) {


          ((StdErrLog) Log.getRootLogger()).setLevel(StdErrLog.LEVEL_OFF);

           webServer = new Server(new QueuedThreadPool(6));
           ServerConnector connector = new ServerConnector(webServer, new HttpConnectionFactory());
           connector.setPort(8080);
           webServer.addConnector(connector);
        ResourceHandler resource_handler = new ResourceHandler();
          resource_handler.setDirectoriesListed(true);
           resource_handler.setWelcomeFiles(new String[]{"index.html"});
           resource_handler.setResourceBase("src/test/java/com.selenium");
           HandlerList handlers = new HandlerList();
           MovedContextHandler effective_symlink = new MovedContextHandler(webServer, "/lib/angular", "/lib/angular_v1.2.9");
         handlers.setHandlers(new Handler[]{effective_symlink, resource_handler, new DefaultHandler()});
           webServer.setHandler(handlers);
                try {
                    webServer.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.setProperty("webdriver.chrome.driver", "H:\\BabuPENDrive\\Framework (1)\\Framework\\Driver\\Chrome\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
                driver.manage().window().maximize();

                ngwebdriver = new NgWebDriver((JavascriptExecutor)driver);

                driver.get(Url);
                //return driver;

                // } catch (Exception e) {
                //    e.printStackTrace();
                // }


                //driver.navigate().to("https://www.trustnet.com");
               // ngwebdriver.waitForAngularRequestsToFinish();
                //datamap = Datahelper.data(System.getProperty("H:\\BabuPENDrive\\Framework (1)\\Framework\\src\\main\\java\\Util\\Test.xls"),"sheet1");


            } else {
                System.out.println("can't read browser type");
            }

        }
        return driver;
    }
    public WebDriver getDriver(){
       return driver;

   }
    public void destroyDriver() {
    driver.quit();
        try {
            webServer.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    driver = null;
  }
}
