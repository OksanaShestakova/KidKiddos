package Pages;

public class LoginPage extends BasePage {

    public static final String LOGIN_HEADER = "//h1[text()='Login']";
    public static final String ERROR_MESSAGE = "//*[contains(text(),'please try again')]";
    public static final String SIGNIN = "//*[@value='Sign In']";
    public static final String SUBMIT ="//*[@value='Submit']";

    public static final String EMAIL ="//*[@type='email']";
    public static final String PASSWORD ="//*[@type='password']";
    public static final String ERROR_LOGIN_MESSAGE = "//*[contains(text(),'Incorrect email or password')]";
    public void  wrongEmail() {sendTextToElementByXpath(EMAIL,"test@gmail.com");}
    public void  wrongPassword() {sendTextToElementByXpath(PASSWORD, "12345678");}

    public boolean isLoginTitleVisible() {
        return elementExists(LOGIN_HEADER);
    }
    public void  clickSignInButton(){clickElementByXpath(SIGNIN);}
    public void  clickSubmitButton(){clickElementByXpath(SUBMIT);}
    public boolean isErrorMessageVisible() { return elementExists(ERROR_MESSAGE);}
    public boolean isLoginErrorMessageVisible() { return elementExists(ERROR_LOGIN_MESSAGE);}
}