package com.zerobank.step_definition;

import com.zerobank.pages.FindTransactionsPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FindTransactionsStepDefs {
    @When("user acess the Find Transaction tab")
    public void user_acess_the_Find_Transaction_tab() {
      new FindTransactionsPage().Part("Account Activity");
      new FindTransactionsPage().Link("Find Transactions");
    }

    @Given("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String From, String To) throws InterruptedException {
        Thread.sleep(2000);
     new FindTransactionsPage().DateFrom(From);
        Thread.sleep(2000);
     new FindTransactionsPage().DateTo(To);
    }

    @Given("clicks search")
    public void clicks_search() throws InterruptedException {
        Thread.sleep(1000);
        WebElement FindButton=Driver.get().findElement(By.cssSelector("[type='submit']"));
        FindButton=Driver.get().findElement(By.cssSelector("[type='submit']"));
        FindButton.click();
        Thread.sleep(1000);
    }

    @Then("results table should only show transaction dates between {string} to {string}")
    public void results_table_should_only_show_transaction_dates_between_to(String From, String To) {
        new FindTransactionsPage().betweenDates(From,To);

    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
       new FindTransactionsPage().sorted();
       Driver.get().navigate().back();
       Driver.get().navigate().forward();

       new FindTransactionsPage().Link("Find Transactions");
    }

    @Then("the results table should only not contain transactions date {string}")
    public void the_results_table_should_only_not_contain_transactions_date(String string) {
   new FindTransactionsPage().noContain(string);
    }


    //-----------------------------------------------------------------------------------------------

    @When("User enter description {string}")
    public void user_enter_description(String string) throws InterruptedException {
        new FindTransactionsPage().description(string);
        Thread.sleep(1500);
    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {
        List<WebElement> description=new FindTransactionsPage().description;
        ArrayList<String> strings=new ArrayList<>();
        for (WebElement each: description){
            strings.add(each.getText());
        }

        for (String each:strings){
            Assert.assertTrue(each.contains(string));
        }

        Driver.get().navigate().refresh();


        new FindTransactionsPage().Link("Find Transactions");

    }

    //---------------------------------------------------------------------------------------

    @Then("results table should show at least one result under {string}")
    public void results_table_should_show_at_least_one_result_under(String string) throws Exception {

        Assert.assertTrue(new FindTransactionsPage().resultTable(string));
        Thread.sleep(1500);
    }

    @When("user select type {string}")
    public void user_select_type(String string)throws Exception {
        Thread.sleep(1500);
      new FindTransactionsPage().SelectType(string);
        Thread.sleep(1500);

    }

    @Then("results table should show no  result under {string}")
    public void results_table_should_show_no_result_under(String string)throws Exception {
        Thread.sleep(1500);
        Assert.assertTrue(new FindTransactionsPage().noResultTable(string));
        Thread.sleep(1500);

    }


}
