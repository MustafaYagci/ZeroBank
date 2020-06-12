package com.zerobank.step_definition;

import com.zerobank.pages.PayeePage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Map;

public class PayeeStepDefs {

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String> map) throws InterruptedException {
     String name, adress, account, details;
     name=map.get("Payee Name");
     adress=map.get("Payee Address");
     account=map.get("Account");
     details=map.get("Payee Details");
      Thread.sleep(500);
     new PayeePage().addPayee(name, adress, account, details);
      Thread.sleep(500);
    }

    @Then("message {string} should be displayed.")
    public void message_should_be_displayed(String expected) {
     String actual= Driver.get().findElement(By.id("alert_content")).getText();
        Assert.assertEquals("The message after submiting payee is not true",expected,actual);
    }
}
