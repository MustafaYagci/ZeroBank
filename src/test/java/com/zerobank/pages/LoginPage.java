package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginPage {


    public  void LoggingIn() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().findElement(By.id("signin_button")).click();
        Driver.get().findElement(By.id("user_login")).sendKeys(ConfigurationReader.get("username"));
        Driver.get().findElement(By.id("user_password")).sendKeys("password"+ Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void LoggingInWrong(){

        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().findElement(By.id("signin_button")).click();
        Driver.get().findElement(By.id("user_login")).sendKeys("mustafa");
        Driver.get().findElement(By.id("user_password")).sendKeys("anan"+ Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
