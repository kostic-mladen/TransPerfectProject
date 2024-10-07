package TransPerfectTask.Test;

import TransPerfectTask.Base.BaseTest;
import TransPerfectTask.Page.OpenDialog;
import org.junit.Test;

public class OpenDialogTest extends BaseTest {

    OpenDialog openDialog = new OpenDialog();

    @Test
    public void task1(){

        openDialog.openDialogUrl();
        openDialog.clickOnDialogButton();
        openDialog.verifyDialogElements();
        openDialog.verifyBackgroundColorYesButton();
        openDialog.putFocusOnX();
        openDialog.closeDialogOnEnterKey();
        openDialog.verifyDialogIsClosed();

    }
}
