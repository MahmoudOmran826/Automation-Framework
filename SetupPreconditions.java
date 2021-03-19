package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import webactionsonpages.WebActionsOnHomePage;


public class SetupPreconditions {
    public static WebDriver driver;

    public void goToHomePage() {

        driver.get("https://www.levelset.com/");

    }
    public void initializeTheWebDriver(String browser) {
        try{
            System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
            if(browser.equals("Chrome")) {
                driver = new ChromeDriver();
            }
        }

        catch(Exception e){
            //Handle this exception instead of returning null
   }
    }

    public void maximizeScreen(){
        driver.manage().window().maximize();
    }

    public void closeDriver(){
        driver.close();
    }
}
