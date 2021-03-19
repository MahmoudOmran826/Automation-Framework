package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import setup.SetupPreconditions;
import webactionsonpages.WebActionsOnCreateDocumentPage;
import webactionsonpages.WebActionsOnHomePage;

public class LevelSet2Test {

    SetupPreconditions setupPreconditions=new SetupPreconditions();
    WebActionsOnHomePage webActionsOnHomePage;
    WebActionsOnCreateDocumentPage webActionsOnCreateDocumentPage;
    @BeforeTest
    public void navigateToHomePage(){
        setupPreconditions.initializeTheWebDriver("Chrome");
        webActionsOnHomePage=new WebActionsOnHomePage(SetupPreconditions.driver);
        webActionsOnCreateDocumentPage=new WebActionsOnCreateDocumentPage(SetupPreconditions.driver);
        setupPreconditions.goToHomePage();
        setupPreconditions.maximizeScreen();
    }

    @AfterTest
    public void tearDown(){
        setupPreconditions.closeDriver();
    }

    @Test
    public void dayPreliminaryNoticeTest(){
        /*System.out.println(webActionsOnHomePage.
                clickOnDocument().
                getDayPreliminaryNoticeTitle());*/

        Assert.assertEquals(webActionsOnHomePage.
                clickOnDocument(). getDayPreliminaryNoticeTitle(),"20-Day Preliminary Notice");
        Assert.assertEquals(webActionsOnCreateDocumentPage.checkFreeOnFirstBTN(),"Free");

    }
    @Test
    public void NoticeOfIntentToLienTitleTest(){
        /*System.out.println(webActionsOnHomePage.
                clickOnDocument().
                getDayPreliminaryNoticeTitle());*/

        Assert.assertEquals(webActionsOnHomePage.
                clickOnDocument().clickOnNoticeOfIntentToLien().getNoticeOfIntentToLienTitle(),"Notice of Intent to Lien");
        Assert.assertEquals(webActionsOnCreateDocumentPage.checkFreeOnSecondBTN(),"Free");

    }
    @Test
    public void LienBondClaimTitleTest(){
        /*System.out.println(webActionsOnHomePage.
                clickOnDocument().
                getDayPreliminaryNoticeTitle());*/

        Assert.assertEquals(webActionsOnHomePage.
                clickOnDocument().clickOnLienBondClaim().getLienBondClaimTitle(),"Lien / Bond Claim");
        Assert.assertEquals(webActionsOnCreateDocumentPage.checkFreeOnThirdBTN(),"Free");

    }
    @Test
    public void LienWaiverTitleTest(){
        /*System.out.println(webActionsOnHomePage.
                clickOnDocument().
                getDayPreliminaryNoticeTitle());*/

        Assert.assertEquals(webActionsOnHomePage.
                clickOnDocument().clickOnLienWaiver().getLienWaiverTitle(),"Lien Waiver");
        Assert.assertEquals(webActionsOnCreateDocumentPage.checkFreeOnForthBTN(),"Free");

    }


}
