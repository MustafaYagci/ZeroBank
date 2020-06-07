package com.zerobank.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver(){}

    public static WebDriver driver;

    public static WebDriver Get(){
        if (driver==null){
           String browser=ConfigurationReader.Get("browser");

           switch (browser){
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
                   break;
               case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver=new FirefoxDriver();
                   break;
           }
        }
        return driver;
    }

    public static void Quit(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
