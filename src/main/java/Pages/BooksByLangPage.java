package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BooksByLangPage extends BasePage {
    /* public static final String BOOKSBYLANGUAGEHEADER ="//*[@aria-controls='SiteNavLabel-books-by-language']";
     public static final String ENGLISHONLYOPTION="//*[contains(text(),'English only')]";
  *//*   public static final String ENGLISHONLYOPTION="//*[@href='/collections/english-only']";*/
    public static final String ENGLISHONLYTITLE = "//*[contains(text(),'English only')]";
    public static final String ILOVETOEATBOOK = "//*[@alt='I-Love-to-Eat-Fruits-and-Vegetables-kids-bunnies-bedtime-story-Shelley-Admont-English-cover']";
    public static final String ILOVETOEATBOOKDESCRIPTION = "//*[contains(text(),'likes to eat candy but doesn’t')]";

    public static final String FORMATDROPDOWN = "//*[@id='SingleOptionSelector-0']";

    public static final String FORMATHARDCOVEROPTION = "//*[@value='Hardcover']";
    public static final String QUANTITYFIELD = "//*[@id='Quantity']";
    public static final String ADDTOCARDBUTTON = "//*[@id='AddToCartText-product-template']";
    public static final String YOURCARTTITLE = "//*[contains(text(),'Your cart')]";
    public static final String UPDATEBUTTON = "/html/body/div[3]/main/div/div/form/footer/div/div/input[1]"; /*"//*[@value='Update']";*/
    public static final String UPDATETO6BOOKS = "//*[@value='6']";
    public static final String PRICEFOR6BOOKS = "//*[contains(text(),'221.94')]";

    public static final String AMOUNTFIELDYOURPAGE = "//*[@name='updates[]']";

    public boolean isEnlishTitleVisible() {
        return elementExists(ENGLISHONLYTITLE);
    }

    public void clickOnTheILOVETOREADBook() {
        clickElementByXpath(ILOVETOEATBOOK);
    }

    public boolean isILOVETOREADBookDetailsOpened() {
        return elementExists(ILOVETOEATBOOKDESCRIPTION);
    }
    public void changeFormat () {
        clickElementByXpath(FORMATDROPDOWN);
    }
    public void clickHardcoverFormatDropdown() {
        clickElementByXpath(FORMATHARDCOVEROPTION);
    }
    public void clickOnAmountField() {
        clickElementByXpath(QUANTITYFIELD);
    }
public void deleteAmountOfBooks(){
            WebElement inputAmountField= webDriver.findElement(By.id("Quantity"));
            inputAmountField.clear();
        }

        public void changeAmountOfBooksTo5(){
        sendTextToElementByXpath(QUANTITYFIELD,"5");
        }


        public void clickAddToTheCardButton(){
        clickElementByXpath(ADDTOCARDBUTTON);
        }
public boolean isYourCartOpened(){
    return elementExists(YOURCARTTITLE);

}
public void clickUpdateButton(){
        clickElementByXpath(UPDATEBUTTON);

}
public boolean priceForSixBooks(){
        return elementExists(PRICEFOR6BOOKS);
    }
    public boolean amountChangeToSixBooks(){
        return elementExists(UPDATETO6BOOKS);
    }
    public void deleteAmountOfBooksYourPage(){
        WebElement inputAmountFieldYourPage= webDriver.findElement(By.xpath(AMOUNTFIELDYOURPAGE));
        inputAmountFieldYourPage.clear();
    }

    public void clickOnAmountFieldYourPage(){
        clickElementByXpath(AMOUNTFIELDYOURPAGE);
    }
    public void changeAmountOfBooksTo6YourPage(){
        sendTextToElementByXpath(AMOUNTFIELDYOURPAGE,"6");
    }
    }