package com.zerobank.step_definition;

import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.ArrayList;

public class AccountSummaryStepDef {

    @When("account summary page should have the title {string}")
    public void account_summary_page_should_have_the_title(String expected) throws InterruptedException {
        Thread.sleep(2000);
       String actual= Driver.get().getTitle();
        Assert.assertEquals("The expected Account Summary page title is not true",expected,actual);
    }

    @When("account summary page must have following modules")
    public void account_summary_page_must_have_following_modules(ArrayList<String> dataTable) {
        System.out.println(dataTable);
    }

    @Then("Credit Accounts table must have columns")
    public void credit_Accounts_table_must_have_columns(ArrayList<String> dataTable) {
        System.out.println(dataTable);
    }





}
