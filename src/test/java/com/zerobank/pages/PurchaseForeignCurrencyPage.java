package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class PurchaseForeignCurrencyPage {
    public PurchaseForeignCurrencyPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public List<String> Currency()  {

        Select slct = new Select(Driver.get().findElement(By.id("pc_currency")));
        List<WebElement> listElemnt = slct.getOptions();
        List<String> listString=new ArrayList<>();
        for(WebElement each : listElemnt){
            listString.add(each.getText());
        }
        return listString;

    }
}
