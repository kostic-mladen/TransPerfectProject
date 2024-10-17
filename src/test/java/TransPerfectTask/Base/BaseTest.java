package TransPerfectTask.Base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class BaseTest {

 public static WebDriver driver;
 public static String openDialogUrl = "https://demos.telerik.com/kendo-angular-ui/demos/dialogs/preview?theme=default-main";
 public static String autoCompleteUrl = "https://demos.telerik.com/kendo-angular-ui/demos/dropdowns/overview?theme=default-main";
 public static String employeesUrl = "https://demos.telerik.com/kendo-angular-ui/demos/grid/filter-all-columns?theme=default-main";

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public ExcelReader excelReader;

    @BeforeClass
    public static void setUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    public boolean isDisplayed(WebElement element) {
        boolean webElement = false;
        try {
            webElement = element.isDisplayed();
        } catch (Exception e) {

        }
        return webElement;
    }

    public void clickOnElement(WebElement element) {
        if (element != null) {
            element.click();
        }
    }

    public void putFocusOn(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].focus();", element);
    }

    public void waitForElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }



     @AfterClass
             public static void tearDown(){
         if (driver != null) {
             driver.manage().deleteAllCookies();
             driver.quit();
         }
     }

 }






    

            

            
        

 

