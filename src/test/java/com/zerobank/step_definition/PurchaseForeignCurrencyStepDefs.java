package com.zerobank.step_definition;

import com.zerobank.pages.PurchaseForeignCurrencyPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.List;

public class PurchaseForeignCurrencyStepDefs {

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> expected) throws InterruptedException {
        Thread.sleep(500);
      List<String> actual=  new PurchaseForeignCurrencyPage().Currency();
        Thread.sleep(500);

        for (int i=0; i<expected.size(); i++){

            for (String each: actual){

                if (expected.get(i).equals(each)){
                    System.out.println(expected.get(i)+" is exist in dropdown.");
                }
            }
        }

    }



    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() throws Exception{
        Thread.sleep(500);
        Driver.get().findElement(By.id("pc_calculate_costs")).click();
        Thread.sleep(500);
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        Alert alert = Driver.get().switchTo().alert();
        String alertName=alert.getText();
        String expected="Please, ensure that you have filled all the required fields with valid values.";
        Assert.assertEquals("Alert text is mismach",alertName,expected);
    }


    @When("user tries to calculate cost without selecting a value")
    public void user_tries_to_calculate_cost_without_selecting_a_value() throws Exception {
        Thread.sleep(500);
        Driver.get().findElement(By.id("pc_calculate_costs")).click();
        Thread.sleep(500);
    }
}
