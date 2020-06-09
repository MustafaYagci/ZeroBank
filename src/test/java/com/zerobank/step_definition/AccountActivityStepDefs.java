package com.zerobank.step_definition;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountActivityStepDefs {

    @When("User shold able to click {string} module")
    public void user_shold_able_to_click_module(String string) {
      new AccountActivityPage().Modules(string);
    }

    @Then("Account Activity page should have the {string} title.")
    public void account_Activity_page_should_have_the_title(String string) throws InterruptedException {
        Thread.sleep(1500);
        String actual = Driver.get().getTitle();
        System.out.println("Checking the titles of Account Activity Page");
        Assert.assertTrue(actual.contains(string));
    }

    @Given("Drop down default option should be {string}")
    public void drop_down_default_option_should_be(String expected) throws InterruptedException {
        Thread.sleep(1500);
        Select slct = new AccountActivityPage().Dropdown();
        WebElement defaultext=slct.getFirstSelectedOption();
        String actual=defaultext.getText();
        Assert.assertEquals("The deafult text of the dropdown is not true",expected,actual);
        System.out.println("Dropdown default option is certified.");

    }

    @Given("drop down should have the following options")
    public void drop_down_should_have_the_following_options(List<String> expected) throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement>Elements=new AccountActivityPage().Dropdown().getOptions();
        List<String> stringElements=new ArrayList<>();
        for (WebElement each: Elements){
            stringElements.add(each.getText());
        }

        Assert.assertEquals("The List is mismach ",expected, stringElements);
    }

    @When("Transactions table should have column names")
    public void transactions_table_should_have_column_names(List<String> expected) throws InterruptedException {
        Thread.sleep(1000);
        List<String> actual=new ArrayList<>();
        List<WebElement> columns=new AccountActivityPage().columnNames();
        for (WebElement each: columns){
            actual.add(each.getText());
        }
        Assert.assertEquals(expected,actual);
       // System.out.println("The buttons names is"+Driver.get().findElement(By.xpath("//table/thead/tr/th")).getText());

    }

}
