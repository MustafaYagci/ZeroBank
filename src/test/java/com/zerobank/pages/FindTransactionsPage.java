package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class FindTransactionsPage extends BasePage {


    public FindTransactionsPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    public void Link(String moduleName){
        Driver.get().findElement(By.xpath("//a[.='"+moduleName+"']")).click();
    }

    public void DateFrom(String From){

        Driver.get().findElement(By.id("aa_fromDate")).sendKeys(From);
    }

    public void DateTo(String To){

        Driver.get().findElement(By.id("aa_toDate")).sendKeys(To);
    }

    @FindBy(xpath = "(//table)[2]/tbody/tr/td[1]")
    public List<WebElement> Results;

    @FindBy(xpath = "(//table)[2]/tbody/tr/td[2]")
    public List<WebElement> description;

    public void betweenDates(String from, String To){
       String[]fromSplited= from.split("-");
       int dayInical=Integer.parseInt(fromSplited[2]);

       String[]toSplited=To.split("-");
       int dayFinal=Integer.parseInt(toSplited[2]);

       List<WebElement> elements=new FindTransactionsPage().Results;
       List<String> comparador=new ArrayList<>();
       for(WebElement element:elements){
           comparador.add(element.getText());
       }

       for (int i=0; i<comparador.size(); i++){
          String[] splited= comparador.get(i).split("-");
          int target=Integer.parseInt(splited[2]);

          if(target>=dayInical && target<=dayFinal){

          }

       }


    }

    public void sorted(){

        List<WebElement> elements=new FindTransactionsPage().Results;
        List<Integer> sorting=new ArrayList<>();
        for(WebElement each:elements){
           String text=each.getText();
           String[] split=text.split("-");
           int converted=Integer.parseInt(split[2]);
           sorting.add(converted);
        }

     for(int i=0; i<sorting.size()-1; i++){
         if(sorting.get(i)>sorting.get(i+1)){
         }

     }
    }


    public void noContain(String date){
        List<WebElement> elements=new FindTransactionsPage().Results;
        ArrayList<String> dates=new ArrayList<>();
        for(WebElement each:elements){
            dates.add(each.getText());
        }

        for (String each: dates){
            Assert.assertNotEquals("The specific date is not located inside table",date, each);
        }
    }


    public void description(String serch) throws InterruptedException {
        Thread.sleep(1500);
        Driver.get().findElement(By.id("aa_description")).sendKeys(serch);
    }

    public boolean resultTable(String thead){
        if (thead.equals("Deposit")){
            for (int i=1; i<3; i++){
              String var = Driver.get().findElement(By.xpath("((//table)[2]/tbody//tr)["+i+"]/td[3]")).getText();
              if (var!=null){
                  return true;
              }
            }
        }

        if (thead.equals("Withdrawal")){
            for (int i=1; i<3; i++){
                String var = Driver.get().findElement(By.xpath("((//table)[2]/tbody//tr)["+i+"]/td[3]")).getText();
                if (var!=null){
                    return true;
                }
            }
        }

       return false;
        }

        public void SelectType(String type){
            Select slct = new Select(Driver.get().findElement(By.id("aa_type")));
            slct.selectByVisibleText(type);


        }

        public boolean noResultTable(String thead){
            if (thead.equals("Deposit")){
                for (int i=1; i<3; i++){
                    String var = Driver.get().findElement(By.xpath("((//table)[2]/tbody//tr)["+i+"]/td[3]")).getText();
                    if (var==null){
                        return true;
                    }
                }
            }

            if (thead.equals("Withdrawal")){
                for (int i=1; i<3; i++){
                    String var = Driver.get().findElement(By.xpath("((//table)[2]/tbody//tr)["+i+"]/td[3]")).getText();
                    if (var==null){
                        return true;
                    }
                }
            }

            return false;
        }



    }



