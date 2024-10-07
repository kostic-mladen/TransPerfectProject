package TransPerfectTask.Test;

import TransPerfectTask.Base.BaseTest;
import TransPerfectTask.Page.*;
import org.junit.Test;



import java.io.IOException;
public class TestTasks extends BaseTest { //run tests

    OpenDialog openDialog = new OpenDialog();
    OpenWindow openWindow = new OpenWindow();
    EmployeesPage employeesPage = new EmployeesPage();
    AutoCompleteSport autocompleteSport = new AutoCompleteSport();
    MultiSelectSport multiSelectSport = new MultiSelectSport();

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
    @Test
    public void task2(){
        openWindow.openUrl();
        openWindow.clickOnOpenWindowButton();
        openWindow.verifyDataFromWindow();
        openWindow.maximizeWindow();
        openWindow.closeWindow();
    }

    @Test
    public void task3() throws InterruptedException, IOException {
        employeesPage.openUrl();
        employeesPage.findAllEmployeesFromUS();
        employeesPage.printAllTheEmployeesFromUS();
        employeesPage.exportInExcelTableAllEmployeesFromUSAThatAreOnline();
    }

    @Test
    public void task4(){
        autocompleteSport.openUrl();
        autocompleteSport.chooseSportInAutocompleteField();
        autocompleteSport.clearAutocompleteField();
    }

    @Test
    public void task5(){
        multiSelectSport.openUrl();
        multiSelectSport.verifyChosenSportResults();
        multiSelectSport.verifyChosenSportResults();
    }

}

