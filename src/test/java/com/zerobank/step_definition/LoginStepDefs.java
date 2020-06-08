package com.zerobank.step_definition;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs {
    @Given("User enter the valid username and password")
    public void user_enter_the_valid_username_and_password() {
     new LoginPage().LoggingIn();
    }

    @Then("Account Summary page should be displayed")
    public void account_Summary_page_should_be_displayed() {
        String expected = "Zero - Account Summary";
        String actual = Driver.get().getTitle();
        Assert.assertEquals("The Page title is not same as expected when Logging in",expected,actual);

    }

    @Given("User enter the invalid username and password")
    public void user_enter_the_invalid_username_and_password() {
        Driver.closeDriver();
        new LoginPage().LoggingInWrong();
    }

    @Then("User shold get error message and should be displayed {string}")
    public void user_shold_get_error_message_and_should_be_displayed(String expected) {

        String Actual=Driver.get().findElement(By.cssSelector("[class='alert alert-error']")).getText();
        Assert.assertEquals("The Error Message is Inaccurate",expected,Actual);
    }
}
