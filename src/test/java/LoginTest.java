import Pages.LoginPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends UseCaseBase {
    private static MainPage mainPage;
    private static final Logger logger = LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void openLoginPage() {
        LoginPage loginPage = mainPage.openLoginTab();
        boolean isLoaded = loginPage.isLoginTitleVisible();
        assertTrue(isLoaded);

    }

    @Test
    public void loginWithoutCredTest() {
        LoginPage loginPage = mainPage.openLoginTab();
        loginPage.clickSignInButton();
        loginPage.clickSubmitButton();
        boolean errorMessage = loginPage.isErrorMessageVisible();
        assertTrue(errorMessage);

    }

    @Test
    public void loginWithWrongCredTest() {
        LoginPage loginPage = mainPage.openLoginTab();
        loginPage.wrongEmail();
        loginPage.wrongPassword();
        loginPage.clickSignInButton();
        boolean errorLoginMessage = loginPage.isLoginErrorMessageVisible();
        assertTrue(errorLoginMessage);

    }


}
