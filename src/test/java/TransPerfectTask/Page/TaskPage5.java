package TransPerfectTask.Page;

import TransPerfectTask.Base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TaskPage5 extends BaseTest {

    TaskPage4 taskPage4 = new TaskPage4();

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public TaskPage5() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/app-root/my-app/div/div[6]/kendo-label/kendo-multiselect/span/kendo-icon-wrapper/kendo-svgicon")
    public WebElement clearButton;

    @FindBy(css = "input.k-input-inner[placeholder='Your favorite sports']")
    public WebElement multiSelectField;

    @FindBy(xpath = "//span[@class='k-chip-label k-text-ellipsis' and text()='Tennis']")
    public WebElement tennisSelected;

    @FindBy(xpath = "//span[@class='k-chip-label k-text-ellipsis' and text()='Football']")
    public WebElement footballSelected;

    @FindBy(xpath = "//ul[@role='listbox']//li")
    public WebElement dropDownList;

    public List<WebElement> getDropdownOptions() {

        List<WebElement> dropdownOptions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        for (WebElement option : dropdownOptions) {
            js.executeScript("arguments[0].scrollIntoView(true);", option);
        }
        return dropdownOptions;

    }
    public void openUrl() {
        driver.get(autoCompleteUrl); //Open URL
        Assert.assertEquals(driver.getCurrentUrl(), autoCompleteUrl); // Verifying Open URL
        Assert.assertNotEquals(driver.getCurrentUrl(), employeesUrl); // Verifying Open URL
    }

    public void verifyOptionsFromDropdownWithScroll() {

        clickOnElement(clearButton);
        clickOnElement(multiSelectField);
        waitForElement(dropDownList);

        for (WebElement option : getDropdownOptions()) {
            js.executeScript("arguments[0].scrollIntoView(true);", option); // Verifying option from dropdown list
            System.out.println(option.getText()); //Printing option from dropdown
        }
    }

    public void verifyChosenSportResults(){

        clickOnElement(clearButton);
        clickOnElement(multiSelectField);
        multiSelectField.sendKeys("Tennis" + Keys.ENTER + "Football" + Keys.ENTER); // Choose Tennis and Football as favourite sport
        clickOnElement(taskPage4.multiColumn);
        Assert.assertTrue(isDisplayed(footballSelected)); //Verify chosen results
        Assert.assertTrue(isDisplayed(tennisSelected)); //Verify chosen results

    }

}

