package TransPerfectTask.Page;

import TransPerfectTask.Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class TaskPage3 extends BaseTest {

    public TaskPage3() {
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "/html/body/app-root/my-app/kendo-grid/kendo-grid-group-panel/kendo-chiplist/kendo-chip/kendo-icon-wrapper/kendo-svgicon")
    public WebElement countryField;

    @FindBy(id = "k-grid0-select-all")
    public WebElement selectAll;

    @FindBy(xpath = "//span[contains(text(), 'Export to Excel')]")
    public WebElement exportToExcelButton;

    @FindBy(xpath = "//span[@class='k-column-title' and text()='Country']")
    public WebElement sourceElement;
    @FindBy(className = "k-grouping-drop-container")
    public WebElement targetElement;

    @FindBy(xpath = "//a[@title='Country Column Menu']")
    public WebElement countryMenu;

    @FindBy(xpath = "//div[@role='button' and contains(@class, 'k-columnmenu-item') and contains(text(), 'Sort Descending')]")
    public WebElement descSort;

    @FindBy(css = "a.k-grid-header-menu.k-grid-column-menu[title='Status Column Menu']")
    public WebElement statusMenu;

    @FindBy(xpath = "//div[@role='button' and contains(text(), 'Filter')]")
    public WebElement filterCountyIcon;

    @FindBy(css = "input.k-textbox.k-input[aria-label='Country Filter']")
    public WebElement countryFilterInput;

    @FindBy(css = "button.k-button.k-button-solid-primary.k-button-md[type='submit']")
    public WebElement filterButton;

    @FindBy(xpath = "(//div[@class='k-columnmenu-item ng-tns-c2035614799-8 ng-star-inserted'])[1]")
    public WebElement filterStatusButton;

    @FindBy(xpath = "//input[@type='radio' and @aria-label='Status Filter']")
    public WebElement statusTrueRadioButton;

    @FindBy(css = "button.k-button.k-button-solid-primary.k-button-md[type='submit']")
    public WebElement filterStatusSubmit;

    @FindBy(xpath = "(//a[@title='Country Column Menu'])[1]")
    public WebElement countryColumnMenu;


    @Test
    public void openUrl(){
        driver.get(employeesUrl); //Open URL
        Assert.assertEquals(driver.getCurrentUrl(), employeesUrl); // Verifying Open URL
        Assert.assertNotEquals(driver.getCurrentUrl(), openDialogUrl); // Verifying Open URL
    }
    public void findAllEmployeesFromUS(){
        openUrl(); // Open URL
        clickOnElement(countryColumnMenu);
        waitForElement(filterCountyIcon);
        clickOnElement(filterCountyIcon);
        countryFilterInput.sendKeys("US");
        clickOnElement(filterButton); // Find all employees from US
    }

    public void printAllTheEmployeesFromUS(){
        int numberOfEmployeesToPrint = Math.min(Math.min(Math.min(getAllNames().size(), getJobTitle().size()), getPhone().size()), getAddress().size());
        for (int i = 0; i < numberOfEmployeesToPrint; i++) {

            WebElement name = getAllNames().get(i);
            WebElement job = getJobTitle().get(i);
            WebElement phoneNumber = getPhone().get(i);
            WebElement addresses = getAddress().get(i);

            System.out.println("Name: " + name.getText()); // Printing the name of employee
            System.out.println("Job title: " + job.getText()); //Printing the job title of employee
            System.out.println("Phone: " + phoneNumber.getText()); //Printing phone of employee
            System.out.println("Address: " + addresses.getText()); //Printing address of employee
            System.out.println("----------------------------------------");

        }
    }
    public void exportInExcelTableAllEmployeesFromUSAThatAreOnline() throws InterruptedException {
        waitForElement(statusMenu);
        clickOnElement(statusMenu);
        waitForElement(filterStatusButton);
        clickOnElement(filterStatusButton);
        waitForElement(statusTrueRadioButton);
        clickOnElement(statusTrueRadioButton);
        waitForElement(filterStatusSubmit);
        clickOnElement(filterStatusSubmit);
        clickOnElement(selectAll);
        waitForElement(exportToExcelButton);
        clickOnElement(exportToExcelButton);
        Thread.sleep(2000);
    }

    public List<WebElement> getAllNames() {
        List<WebElement> allNames = driver.findElements(By.xpath("//td[contains(@class, 'k-table-td') and @aria-colindex='2']"));
        return allNames;
    }

    public List<WebElement> getJobTitle() {
        List<WebElement> jobTitle = driver.findElements(By.xpath("//td[contains(@class, 'k-table-td') and @aria-colindex='3']"));
        return jobTitle;
    }

    public List<WebElement> getPhone() {
        List<WebElement> phone = driver.findElements(By.xpath("//td[contains(@class, 'k-table-td') and @aria-colindex='9']"));
        return phone;
    }

    public List<WebElement> getAddress() {
        List<WebElement> address = driver.findElements(By.xpath("//td[contains(@class, 'k-table-td') and @aria-colindex='10']"));
        return address;
    }










}
