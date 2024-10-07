package TransPerfectTask.Test;

import TransPerfectTask.Base.BaseTest;
import TransPerfectTask.Page.EmployeesPage;
import org.junit.Test;

import java.io.IOException;

public class EmployeesTest extends BaseTest {

    EmployeesPage employeesPage = new EmployeesPage();

    @Test
    public void task3() throws InterruptedException, IOException {
        employeesPage.openUrl();
        employeesPage.findAllEmployeesFromUS();
        employeesPage.printAllTheEmployeesFromUS();
        employeesPage.exportInExcelTableAllEmployeesFromUSAThatAreOnline();
    }

}
