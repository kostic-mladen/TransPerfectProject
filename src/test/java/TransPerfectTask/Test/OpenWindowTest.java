package TransPerfectTask.Test;

import TransPerfectTask.Base.BaseTest;
import TransPerfectTask.Page.OpenWindow;
import org.junit.Test;

public class OpenWindowTest extends BaseTest {

    OpenWindow openWindow = new OpenWindow();

    @Test
    public void task2(){
        openWindow.openUrl();
        openWindow.clickOnOpenWindowButton();
        openWindow.verifyDataFromWindow();
        openWindow.maximizeWindow();
        openWindow.closeWindow();
    }
}
