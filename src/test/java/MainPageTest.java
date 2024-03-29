/*

import static org.junit.jupiter.api.Assertions.assertTrue;
public class MainPageTest extends UseCaseBase{
    private static  MainPage mainPage;
private static final Logger logger= LogManager.getLogger(MainPageTest.class);
    @BeforeAll
    public static void classSetup(){
    mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest(){
        mainPage.navigateToMainPage();
    }
    @Test
    public void mainPageLoadTest(){
        logger.info("Main page load test");
        Boolean success = mainPage.isLogoVisiable();
        mainPage.takeScreenshot("MainPageTest");
        assertTrue(success);
    }
    @Test
    public void openContactUSPage(){
        ContactUsPage contactUsPage= mainPage.openContactUsTab();
        boolean isLoaded = contactUsPage.isPageTitleVisible();
        assertTrue(isLoaded);
    }

    @Test
    public void openLoginPageTest(){
        LoginPage loginPage=mainPage.openLoginPage();
    }
}
*/

import Pages.ContactUsPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTest extends UseCaseBase {
    private static MainPage mainPage;
  /*  public static final Logger logger = LogManager.getLogger(MainPageTest.class);*/

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void mainPageLoadTest() {
      /*  logger.info("Main page load test");*/
        Boolean success = mainPage.isLogoVisible();
        mainPage.takeScreenshot("MainPageTest");
        assertTrue(success);
    }

    @Test
    public void openContactUsPage() {
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        boolean isLoaded = contactUsPage.isPageTitleVisible();
        assertTrue(isLoaded);

    }
}
