package Pages;

import Consts.Consts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private static final String LOGO_IMG = "//img[@itemprop='logo']";
    private static final String CONTACT_US_OPTION = "//a[text()='Contact us']";
    public static final String LOGIN = "//a[@href='/account/login']";
    public static final String MAIL_FIELD = "//*[@name='customer[email]']";
    public static final String PASSWORD_FIELD = "//*[@name='customer[password]']";
    public static final String SIGNIN = "//*[@value='Sign in']";
    public static final String SUBMIT ="//*[@value='Submit']";
    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_URL);
    }

/*dddddddddddd*/
public static final String BOOKSBYLANGUAGEHEADER ="//*[@aria-controls='SiteNavLabel-books-by-language']";

 public static final String ENGLISHONLYOPTION="/html/body/div[2]/div/nav[2]/ul/li[3]/div/ul/li[10]/a";

/*deeeeeeee*/
    public boolean isLogoVisible() {
        Boolean isVisible = elementExists(LOGO_IMG);
        return isVisible;
    }

    public ContactUsPage openContactUsTab() {
        clickElementByXpath(CONTACT_US_OPTION);
        return new ContactUsPage();
    }

    public LoginPage openLoginTab() {
        clickElementByXpath(LOGIN);
        return new LoginPage();
    }
    public BooksByLangPage openEnglishBook() {
        clickElementByXpath(BOOKSBYLANGUAGEHEADER);
        clickElementByXpath(ENGLISHONLYOPTION);
        return new BooksByLangPage();
 }
}
