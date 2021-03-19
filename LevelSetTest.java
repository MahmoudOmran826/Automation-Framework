package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LevelSetTest {
    private WebDriver driver;

    public void goToHomePage() {
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        driver = new ChromeDriver();
        //what is the difference between get and navigate
        ////a[text()='Create a Document ']
        //a[@class='btn btn-info btn-outline mob-dropdown-btn']
        By creatDocument = By.xpath("//a[@class='btn btn-info btn-outline mob-dropdown-btn']");
        By titleOfDocumentPage=By.xpath("//div[@class='title']");
        //  //div[@class='product-title-container card-header']/div[text()='20-Day Preliminary Notice']

        By dayPreliminaryNotice_Btn=By.xpath("//div[@class='product-title-container card-header']/div[text()='20-Day Preliminary Notice']");
        By checkFreeOnFirst_Btn=By.xpath("//div[text()='20-Day Preliminary Notice']/..//span[text()='Free']");


        By noticeOfIntentToLien_Btn=By.xpath("//div[@class='product-title-container card-header']/div[text()='']");
        By checkFreeOnSecond_Btn=By.xpath("//div[text()='Notice of Intent to Lien']/..//span[text()='Free']");

        By lienBondClaim_Btn=By.xpath("//div[@class='product-title-container card-header' ]/div[text()='Lien / Bond Claim']");
        By checkFreeOnThird_Btn=By.xpath("//div[text()='Lien / Bond Claim']/..//span[text()='Free']");

        By lienWaiver_Btn=By.xpath("//div[@class='product-title-container card-header' ]/div[text()='Lien Waiver']");
        By checkFreeOnForth_Btn=By.xpath("//div[text()='Lien Waiver']/..//span[text()='Free']");

        WebDriverWait wait=new WebDriverWait(driver, 20);

        driver.get("https://www.levelset.com/");
        wait.until(ExpectedConditions.elementToBeClickable(creatDocument));
        driver.findElement(creatDocument).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(titleOfDocumentPage));
    /***********************************************///firist button
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

        /**************************************///second button
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
            /********************************************/
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
        /*************************************/
        try {

            if (ExpectedConditions.elementToBeClickable(lienWaiver_Btn) != null) {
                driver.findElement(lienWaiver_Btn).click();
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

    }

    public static void main(String[] args) {
        LevelSetTest object = new LevelSetTest();
        object.goToHomePage();


    }
}
