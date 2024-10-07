package TransPerfectTask.Test;

import TransPerfectTask.Base.BaseTest;
import TransPerfectTask.Page.*;
import org.junit.Test;



import java.io.IOException;
public class TestTasks extends BaseTest { //run tests

    TaskPage1 taskPage1 = new TaskPage1();
    TaskPage2 taskPage2 = new TaskPage2();
    TaskPage3 taskPage3 = new TaskPage3();
    TaskPage4 taskPage4 = new TaskPage4();
    TaskPage5 taskPage5 = new TaskPage5();

    @Test
    public void task1(){

        taskPage1.openDialogUrl();
        taskPage1.clickOnDialogButton();
        taskPage1.verifyDialogElements();
        taskPage1.verifyBackgroundColorYesButton();
        taskPage1.putFocusOnX();
        taskPage1.closeDialogOnEnterKey();
        taskPage1.verifyDialogIsClosed();

    }
    @Test
    public void task2(){
        taskPage2.openUrl();
        taskPage2.clickOnOpenWindowButton();
        taskPage2.verifyDataFromWindow();
        taskPage2.maximizeWindow();
        taskPage2.closeWindow();
    }

    @Test
    public void task3() throws InterruptedException, IOException {
        taskPage3.openUrl();
        taskPage3.findAllEmployeesFromUS();
        taskPage3.printAllTheEmployeesFromUS();
        taskPage3.exportInExcelTableAllEmployeesFromUSAThatAreOnline();
    }

    @Test
    public void task4(){
        taskPage4.openUrl();
        taskPage4.chooseSportInAutocompleteField();
        taskPage4.clearAutocompleteField();
    }

    @Test
    public void task5(){
        taskPage5.openUrl();
        taskPage5.verifyChosenSportResults();
        taskPage5.verifyChosenSportResults();
    }

}

