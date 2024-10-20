package TransPerfectTask.Page;

import TransPerfectTask.Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OpenWindow extends BaseTest {

    OpenDialog openDialog = new OpenDialog();

    public OpenWindow() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[title='Close']")
    public WebElement windowCloseButton;

    @FindBy(xpath = "/html/body/app-root/my-app/my-dialogs/div/kendo-window/kendo-window-titlebar")
    public WebElement windowTitle;

    @FindBy(xpath = "/html/body/app-root/my-app/my-dialogs/div/kendo-window/div[1]/p")
    public WebElement additionalInfoText;

    @FindBy(css = "kendo-icon-wrapper[name='window-minimize'] > kendo-svgicon.k-svg-i-window-minimize")
    public WebElement minimizeButton;

    @FindBy(css = "button[title='Maximize']")
    public WebElement maximizeButton;

    @FindBy(css = "kendo-svgicon.k-svg-i-x.k-button-icon.k-svg-icon.k-icon")
    public WebElement closeIcon;

    public String headlineTitle = "About";
    public String textParagraph = "Additional info";



    public void openUrl(){
        driver.get(openDialogUrl);
        Assert.assertEquals(driver.getCurrentUrl(), openDialogUrl); // Verifying Open URL
        Assert.assertTrue(isDisplayed(openDialog.openWindowButton));
    }

    public void clickOnOpenWindowButton(){
        openUrl();
        clickOnElement(openDialog.openWindowButton); // Click on Open Window button
        Assert.assertTrue(isDisplayed(windowCloseButton));
    }

    public void verifyDataFromWindow(){
        clickOnOpenWindowButton();
        Assert.assertTrue(isDisplayed(windowCloseButton)); //Close button
        Assert.assertEquals(windowTitle.getText(), headlineTitle); // About title
        Assert.assertEquals(additionalInfoText.getText(), textParagraph); // Additional info text
        Assert.assertTrue(isDisplayed(minimizeButton)); //Minimize button
        Assert.assertTrue(isDisplayed(maximizeButton)); //Maximize button
        Assert.assertFalse(isDisplayed(openDialog.openDialogButton)); //Verifying that window is maximized
    }
    public void maximizeWindow(){
        clickOnOpenWindowButton();
        clickOnElement(maximizeButton);
        Assert.assertFalse(isDisplayed(maximizeButton)); // Verify Maximize button is not visible
    }
    public void closeWindow(){
        clickOnOpenWindowButton();
        clickOnElement(maximizeButton);
        clickOnElement(closeIcon); //closing window
        Assert.assertTrue(isDisplayed(openDialog.openWindowButton)); //Verifying the window is closed
        Assert.assertTrue(isDisplayed(openDialog.openWindowButton)); //Verifying the window is closed
    }


}
