package com.zerobank.step_definition;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class PayBillsStepDefs {

    @When("When user successful Pay operation, {string} should displayed.")
    public void when_user_successful_Pay_operation_should_displayed(String expected) {
        System.out.println("Expected is "+expected);
        new PayBillsPage().MakePayments("Apple","Loan","300","2020-06-08");

        String Actual= Driver.get().findElement(By.xpath("//*[@id='alert_content']")).getText();
        Assert.assertEquals("The Payment didnt accepted",expected,Actual);
    }

    @Then("When user tries to make a payment without entering the amount or date, {string} should be displayed.")
    public void when_user_tries_to_make_a_payment_without_entering_the_amount_or_date_should_be_displayed(String expected) {
        new PayBillsPage().MakePayments("Apple","Loan","300","");

        String Actual= Driver.get().findElement(By.xpath("//*[@id='alert_content']")).getText();

    }
}
