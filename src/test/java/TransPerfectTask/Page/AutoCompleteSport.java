package TransPerfectTask.Page;

import TransPerfectTask.Base.BaseTest;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AutoCompleteSport extends BaseTest {

    public AutoCompleteSport() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "k-input-inner")
    public WebElement autoCompleteField;

    @FindBy(id = "k-581841c7-18bd-4023-82de-3f636417a023")
    public WebElement autoCompleteText;

    @FindBy(xpath = "/html/body/app-root/my-app/div/div[5]/kendo-label/kendo-multicolumncombobox")
    public WebElement multiColumn;

    @FindBy (xpath = "/html/body/app-root/my-app/div/div[1]/kendo-label/kendo-autocomplete/span/kendo-icon-wrapper/kendo-svgicon")
    public WebElement clearButton;

    public String favoriteSport = "Football";
    public String emptyString = "";


    public void openUrl(){
        driver.get(autoCompleteUrl); // Open URL
        Assert.assertEquals(driver.getCurrentUrl(), autoCompleteUrl); // Verifying Open URL
        Assert.assertNotEquals(driver.getCurrentUrl(), employeesUrl); // Verifying Open URL
    }


    public void chooseSportInAutocompleteField(){
        clickOnElement(autoCompleteField);
        autoCompleteField.clear();
        autoCompleteField.sendKeys("Football" + Keys.ENTER); //For autocomplete input filed choose your as favourite sport
        multiColumn.click();
        Assert.assertEquals(autoCompleteField.getAttribute("value"), favoriteSport); //Verify chosen results
    }


    public void clearAutocompleteField(){
        clickOnElement(clearButton); // Clear chosen sport on “x”
        Assert.assertEquals(autoCompleteField.getAttribute("value"),emptyString); //Verify the field is cleared
    }


}
