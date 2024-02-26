import Pages.BooksByLangPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BooksByLangPageTest extends UseCaseBase {
    private static MainPage mainPage;
    /*private static final Logger logger = LogManager.getLogger(MainPageTest.class);*/

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void englishOnlyPageOpen() {
        BooksByLangPage englishBooksPage = mainPage.openEnglishBook();
        boolean englishTitleIsLoaded = englishBooksPage.isEnlishTitleVisible();
        assertTrue(englishTitleIsLoaded);
    }

    @Test
    public void englishBookOpen() {
        BooksByLangPage englishBooksPage = mainPage.openEnglishBook();
        englishBooksPage.clickOnTheILOVETOREADBook();
        boolean iLOVEREADBookDetailsIsOpened = englishBooksPage.isILOVETOREADBookDetailsOpened();
        assertTrue(iLOVEREADBookDetailsIsOpened);
    }

    @Test
    public void yourCartAddFiveBooks() {
        BooksByLangPage englishBooksPage = mainPage.openEnglishBook();
        englishBooksPage.clickOnTheILOVETOREADBook();
        englishBooksPage.changeFormat();
        englishBooksPage.clickHardcoverFormatDropdown();
        englishBooksPage.clickOnAmountField();
        englishBooksPage.deleteAmountOfBooks();
        englishBooksPage.changeAmountOfBooksTo5();
        englishBooksPage.clickAddToTheCardButton();
        boolean yourCartIsOpened = englishBooksPage.isYourCartOpened();
        assertTrue(yourCartIsOpened);
    }

    @Test
    public void yourCartAddSixBooks() {
        BooksByLangPage englishBooksPage = mainPage.openEnglishBook();
        englishBooksPage.clickOnTheILOVETOREADBook();
        englishBooksPage.changeFormat();
        englishBooksPage.clickHardcoverFormatDropdown();
        englishBooksPage.clickOnAmountField();
        englishBooksPage.deleteAmountOfBooks();
        englishBooksPage.changeAmountOfBooksTo5();
        englishBooksPage.clickAddToTheCardButton();
        englishBooksPage.clickOnAmountFieldYourPage();
        englishBooksPage.deleteAmountOfBooksYourPage();
        englishBooksPage.changeAmountOfBooksTo6YourPage();
        englishBooksPage.clickUpdateButton();
        boolean newBooksPriceOfSix = englishBooksPage.priceForSixBooks();
        assertTrue(newBooksPriceOfSix);
        boolean newBooksAmountOfSix = englishBooksPage.amountChangeToSixBooks();
        assertTrue(newBooksAmountOfSix);
    }
}
