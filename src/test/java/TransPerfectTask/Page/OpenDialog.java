package TransPerfectTask.Page;

import TransPerfectTask.Base.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OpenDialog extends BaseTest {

    public OpenDialog() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[normalize-space()='Open dialog'])[1]")
    public WebElement openDialogButton;

    @FindBy (css = "button.k-button.k-button-md.k-rounded-md.k-button-solid-primary.k-button-solid.ng-star-inserted")
    public WebElement yesButton;


    @FindBy(css = "button.k-button-solid-base span.k-button-text")
    public WebElement noButton;

    @FindBy(css = "span.k-window-title.k-dialog-title")
    public WebElement confirmTitle;

    @FindBy(css = "p.ng-star-inserted")
    public WebElement confirmText;

    @FindBy(css = "kendo-svgicon.k-svg-i-x.k-button-icon.k-svg-icon.k-icon.ng-star-inserted")
    public WebElement closeButton;

    @FindBy(xpath = "//span[text()='Open window']")
    public WebElement openWindowButton;

    public String pleaseConfirm = "Please confirm";

    public String wantToContinue = "Are you sure you want to continue?";

    public String expectedColor = "rgba(255, 99, 88, 1)"; //ff6358
    public void clickOnDialogButton(){
        waitForElement(openDialogButton);
        clickOnElement(openDialogButton); // Click on Open Dialog button
        waitForElement(yesButton);
        Assert.assertTrue(isDisplayed(yesButton));  //Verifying that Open button is clickable
    }

    public void verifyDialogElements() {
        Assert.assertTrue(isDisplayed(yesButton)); // Verify Yes button is displayed
        clickOnElement(yesButton); // CLick on Yes button
        Assert.assertTrue(isDisplayed(openDialogButton)); // Yes button is clickable
        clickOnElement(openDialogButton);
        Assert.assertTrue(isDisplayed(noButton)); // Verify No button is displayed
        clickOnElement(noButton);// Click on No button
        Assert.assertTrue(isDisplayed(noButton));
        Assert.assertTrue(isDisplayed(openDialogButton)); // No button is clickable
        clickOnElement(openDialogButton);
        Assert.assertTrue(isDisplayed(confirmTitle)); // Verifying Title text is displayed
        Assert.assertEquals(confirmTitle.getText(), pleaseConfirm); // Verifying Title text is 'Please Confirm'
        Assert.assertTrue(isDisplayed(confirmText)); // Verifying text paragraph
        Assert.assertEquals(confirmText.getText(), wantToContinue); // Verifying text is 'Are you sure you want to continue?'
        Assert.assertTrue(isDisplayed(closeButton)); // Verifying close button is displayed
    }

    public void verifyBackgroundColorYesButton() {
        String backgroundColor = yesButton.getCssValue("background-color");
        Assert.assertEquals(backgroundColor, expectedColor, "");
    }
    public void putFocusOnX(){

        waitForElement(closeButton);
        putFocusOn(closeButton); // Putting focus on X
        Assert.assertTrue(isDisplayed(closeButton));
    }
    public void closeDialogOnEnterKey() {

        Assert.assertTrue(closeButton.isEnabled());
        Actions actions = new Actions(driver);
        actions.sendKeys(closeButton, Keys.ENTER).perform(); // Close dialog on Enter key
        Assert.assertEquals(driver.getCurrentUrl(), openDialogUrl); // Verifying Dialog is closed
    }

    public void verifyDialogIsClosed() {
        Assert.assertTrue(isDisplayed(openDialogButton)); // Verifying Dialog is closed
        Assert.assertTrue(isDisplayed(openWindowButton)); // Verifying Dialog is closed
    }
    public void openDialogUrl() {
        driver.get(openDialogUrl); // Open URL
        Assert.assertEquals(driver.getCurrentUrl(), openDialogUrl); // Verifying Open URL
        Assert.assertTrue(isDisplayed(openDialogButton));
    }

}
