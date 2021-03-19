package webactionsonpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActionsOnHomePage {
    private WebDriver driver;
public WebActionsOnHomePage(WebDriver driver){
    this.driver=driver;
}
    //Elements
    By creatDocument = By.xpath("//a[normalize-space()='Create a Document']");

    //Actions
    public WebActionsOnCreateDocumentPage clickOnDocument(){

        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(creatDocument));
        driver.findElement(creatDocument).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='title']")));
        return new WebActionsOnCreateDocumentPage(driver);
    }
}
