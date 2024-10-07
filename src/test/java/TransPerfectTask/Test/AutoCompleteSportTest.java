package TransPerfectTask.Test;

import TransPerfectTask.Base.BaseTest;
import TransPerfectTask.Page.AutoCompleteSport;
import org.junit.Test;

public class AutoCompleteSportTest extends BaseTest {

    AutoCompleteSport autocompleteSport = new AutoCompleteSport();

    @Test
    public void task4(){
        autocompleteSport.openUrl();
        autocompleteSport.chooseSportInAutocompleteField();
        autocompleteSport.clearAutocompleteField();
    }
}
