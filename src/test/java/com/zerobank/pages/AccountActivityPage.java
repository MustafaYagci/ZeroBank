package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy(id = "aa_accountId")
    private WebElement dropdown;

    public Select Dropdown(){
        Select slct = new Select(new AccountActivityPage().dropdown);
        return slct;
    }

    public List<WebElement> columnNames(){
        List<WebElement> columns=Driver.get().findElements(By.xpath("//table/thead/tr/th"));
       return columns;
    }
}
