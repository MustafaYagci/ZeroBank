package com.zerobank.step_definition;

import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccounSummaryStepDefs {

    @When("account summary page should have the title {string}")
    public void account_summary_page_should_have_the_title(String Expected) throws Exception {
        String Actual= Driver.get().getTitle();
        Assert.assertEquals("The Home Page Title is not Expected",Expected , Actual);

    }

    @When("account summary page must have following modules")
    public void account_summary_page_must_have_following_modules(ArrayList<String> dataTable) {
        List<WebElement> Headers=Driver.get().findElements(By.tagName("//h2"));
        for (int i=0; i<=4;i++){
         String elements= Headers.get(i).getText();
         String datas= dataTable.get(i);
         Assert.assertEquals("The modules are not equal",elements,datas);
        }


    }

    @Then("Credit Accounts table must have columns")
    public void credit_Accounts_table_must_have_columns(ArrayList<String> dataTable) {

    }

}
