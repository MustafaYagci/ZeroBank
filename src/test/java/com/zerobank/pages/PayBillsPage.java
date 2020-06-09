package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PayBillsPage extends BasePage {

    public void MakePayments(String payee, String account, String amount, String date){
        WebElement Payee= Driver.get().findElement(By.name("payee"));
        Select select= new Select(Payee);
        select.selectByVisibleText(payee);

        WebElement Account = Driver.get().findElement(By.name("account"));
        select=new Select(Account);
        select.selectByVisibleText(account);

        Driver.get().findElement(By.name("amount")).sendKeys(amount);

        Driver.get().findElement(By.name("date")).sendKeys(date);

        Driver.get().findElement(By.xpath("//*[@type='submit']")).click();

    }
}
