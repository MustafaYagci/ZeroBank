package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;

public class PayeePage extends BasePage {

    public void addPayee(String name, String adress, String account, String details) throws InterruptedException {
        Driver.get().findElement(By.id("np_new_payee_name")).sendKeys(name);
        Thread.sleep(500);
        Driver.get().findElement(By.id("np_new_payee_address")).sendKeys(adress);
        Thread.sleep(500);
        Driver.get().findElement(By.id("np_new_payee_account")).sendKeys(account);
        Thread.sleep(500);
        Driver.get().findElement(By.id("np_new_payee_details")).sendKeys(details);
        Thread.sleep(500);
        Driver.get().findElement(By.id("add_new_payee")).click();
    }
}
