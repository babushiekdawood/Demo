package com.selenium;



import common.UIobject.Header;
import common.selenium.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by in.Babushaik on 7/5/2017.
 */
public class Homepage {

private Base base;

    public Homepage(Base base){
        this.base=base;
    }

    @Given("^Open the Trustnet Website$")
    public void open_the_Trustnet_Website() {
        System.out.println("Opened");
        assertTrue(base.headeraction.Homepage());
    }


   // @Given("^Open the Trustnet Website$")
   // public void open_the_Trustnet_Website() {
    //    System.out.println("Opened");
        //assertTrue(base.headeraction.Homepage());
    //    assertTrue(base.headeraction.Homepage());
    //}

    @When("^Click the Find a Fund search box$")
    public void clickTheFindAFundSearchBox() {
        assertTrue(base.homepageaction.FindaFundTitle());
        assertTrue(base.homepageaction.FindaFundsearchbox());
    }

    @And("^Enter the Search \"([^\"]*)\" text and click the search icon$")
    public void enterTheSearchTextAndClickTheSearchIcon(String srchtxt)  {
      assertTrue(base.homepageaction.Entersearchtext(srchtxt));

    }

    @And("^Select the TrustnetUsertype$")
    public void selectTheTrustnetUsertype()  {
    assertTrue(base.homepageaction.Refreshpage());
        assertTrue(base.headeraction.Homepage());
        assertTrue(base.homepageaction.Usertypepopup());
    }

//    @When("^Click the Login button$")
//    public void click_the_Login_button() {
//        assertTrue(base.headeraction.Clicklogin());
//        System.out.println("Clicked");
//    }
//    @Then("^User able to see the Login Popup$")
//    public void user_able_to_see_the_Login_Popup() {
//
//        System.out.println("Pop-up visible");
//        assertTrue(base.headeraction.Loginpopupverify());
//    }
//
//    @Then("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void enterTheAnd(String Username, String Password) {
//        assertTrue(base.headeraction.EnterUsername(Username));
//        assertTrue(base.headeraction.EnterPassword(Password));
//    }
//
//    @And("^Click the Loginpopup Login button$")
//    public void clickTheLoginpopupLoginButton() {
//      assertTrue(base.headeraction.ClickloginpopupLogin());
//    }
//
//
//    @Then("^User logged in Succesfully \"([^\"]*)\"$")
//    public void userLoggedInSuccesfully(String FirstLastName) {
//        assertTrue(base.homepageaction.LoginHomepage(FirstLastName));
//    }


}


