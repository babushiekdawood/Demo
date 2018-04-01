package com.selenium;

import common.selenium.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertTrue;

/**
 * Created by Babu on 18-03-2018.
 */
public class Fundsearchpage {
    private Base base;

    public Fundsearchpage(Base base){
        this.base=base;
    }

    @Then("^User able to search the enter text$")
    public void userAbleToSearchTheEnterText()  {
        assertTrue(base.fundsearchpageaction.Fundsearchpagetitle());
    }
}

