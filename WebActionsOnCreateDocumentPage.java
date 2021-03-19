package webactionsonpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActionsOnCreateDocumentPage {
     private WebDriver driver;
    //Elements
    By titleOfDocumentPage=By.xpath("//div[@class='title']");
    //  //div[@class='product-title-container card-header']/div[text()='20-Day Preliminary Notice']

    By dayPreliminaryNotice_Btn=By.xpath("//div[@class='product-title-container card-header']/div[text()='20-Day Preliminary Notice']");
    By checkFreeOnFirst_Btn=By.xpath("//div[text()='20-Day Preliminary Notice']/..//span[text()='Free']");


    By noticeOfIntentToLien_Btn=By.xpath("//div[normalize-space()='Notice of Intent to Lien']");
    By checkFreeOnSecond_Btn=By.xpath("//div[text()='Notice of Intent to Lien']/..//span[text()='Free']");

    By lienBondClaim_Btn=By.xpath("//div[@class='product-title-container card-header' ]/div[text()='Lien / Bond Claim']");
    By checkFreeOnThird_Btn=By.xpath("//span[normalize-space()='$349']");
//    By checkFreeOnThird_Btn=By.xpath("//div[contains(text(),'%s')]/..//span");
    /*String stringformat=String.format(checkFreeOnThird_Btn.toString(),"Lien / Bond Claim");
    By findPath=By.xpath(stringformat);*/
    By lienWaiver_Btn=By.xpath("//div[@class='product-title-container card-header' ]/div[text()='Lien Waiver']");
    By checkFreeOnForth_Btn=By.xpath("//div[text()='Lien Waiver']/..//span[text()='Free']");


    public WebActionsOnCreateDocumentPage(WebDriver driver) {
        this.driver=driver;
    }

    //Actions
    public WebActionsOnCreateDocumentPage clickOnDayPreliminaryNotice(){
        try {


            if (ExpectedConditions.elementToBeClickable(dayPreliminaryNotice_Btn) != null) {
                driver.findElement(dayPreliminaryNotice_Btn).click();
                driver.findElement(dayPreliminaryNotice_Btn).getText();
            }

        }catch (NullPointerException e){
            driver.navigate().refresh();
            if (ExpectedConditions.elementToBeClickable(dayPreliminaryNotice_Btn) != null) {
                driver.findElement(dayPreliminaryNotice_Btn).click();
                driver.findElement(titleOfDocumentPage).getText();}
            else {
                e.printStackTrace();
            }        }
        return new WebActionsOnCreateDocumentPage(driver);
    }
    public String getDayPreliminaryNoticeTitle(){
      return   driver.findElement(titleOfDocumentPage).getText();
    }
    public WebActionsOnCreateDocumentPage clickOnNoticeOfIntentToLien(){
        try {

            if (ExpectedConditions.elementToBeClickable(noticeOfIntentToLien_Btn) != null) {
                driver.findElement(noticeOfIntentToLien_Btn).click();
                driver.findElement(titleOfDocumentPage).getText();
            }
        }catch (NullPointerException e) {
            driver.navigate().refresh();
            if (ExpectedConditions.elementToBeClickable(noticeOfIntentToLien_Btn) != null) {
                driver.findElement(noticeOfIntentToLien_Btn).click();
                driver.findElement(titleOfDocumentPage).getText();
            } else {
                e.printStackTrace();
            }
        }
        return new WebActionsOnCreateDocumentPage(driver);
    }
    public String getNoticeOfIntentToLienTitle(){
        return   driver.findElement(titleOfDocumentPage).getText();
    }

    public WebActionsOnCreateDocumentPage clickOnLienBondClaim(){
        try {

            if (ExpectedConditions.elementToBeClickable(lienBondClaim_Btn) != null) {
                driver.findElement(lienBondClaim_Btn).click();
                driver.findElement(titleOfDocumentPage).getText();
            }
        }catch (NullPointerException e) {
            driver.navigate().refresh();
            if (ExpectedConditions.elementToBeClickable(lienBondClaim_Btn) != null) {
                driver.findElement(lienBondClaim_Btn).click();
                driver.findElement(titleOfDocumentPage).getText();
            } else {
                e.printStackTrace();
            }
        }
        return new WebActionsOnCreateDocumentPage(driver);
    }
    public String getLienBondClaimTitle(){
        return   driver.findElement(titleOfDocumentPage).getText();
    }
    public WebActionsOnCreateDocumentPage clickOnLienWaiver(){
        try {

            if (ExpectedConditions.elementToBeClickable(lienWaiver_Btn) != null) {
                WebDriverWait wait=new WebDriverWait(driver,10);
                driver.findElement(lienWaiver_Btn).click();
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(checkFreeOnForth_Btn)));
                driver.findElement(titleOfDocumentPage).getText();
            }
        }catch (NullPointerException e) {
            driver.navigate().refresh();
            if (ExpectedConditions.elementToBeClickable(lienWaiver_Btn) != null) {
                driver.findElement(lienWaiver_Btn).click();
                driver.findElement(titleOfDocumentPage).getText();
            } else {
                e.printStackTrace();
            }
        }
        return new WebActionsOnCreateDocumentPage(driver);
    }
    public String getLienWaiverTitle(){
        return   driver.findElement(titleOfDocumentPage).getText();
    }
    public String checkFreeOnFirstBTN(){
       return driver.findElement(checkFreeOnFirst_Btn).getText();
    }
    public String checkFreeOnSecondBTN(){
        return driver.findElement(checkFreeOnSecond_Btn).getText();
    }
    public String checkFreeOnThirdBTN(){
        return driver.findElement(checkFreeOnThird_Btn).getText();
    }
    public String checkFreeOnForthBTN(){
        return driver.findElement(checkFreeOnForth_Btn).getText();
    }

    }



