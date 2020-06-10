package com.zerobank.step_definition;

import com.zerobank.pages.AccountActivityNavigationPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigationStepDefs {

    @When("the user click {string} link on the Account Summary page")
    public void the_user_click_link_on_the_Account_Summary_page(String string) {
        Driver.get().findElement(By.xpath("//a[.='"+string+"']")).click();
    }

    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String expected) {
        String actual=Driver.get().getTitle();
        Assert.assertTrue(actual.contains(expected));

    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {
        Select slct = new Select(new AccountActivityNavigationPage().AccountDropdown);
        WebElement ActualElement=slct.getFirstSelectedOption();
        String Actual=ActualElement.getText();
        Assert.assertEquals("The expected default dropdown text is not true",string,Actual);
        Driver.closeDriver();
    }

}
