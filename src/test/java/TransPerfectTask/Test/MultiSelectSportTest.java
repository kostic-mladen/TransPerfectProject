package TransPerfectTask.Test;

import TransPerfectTask.Base.BaseTest;
import TransPerfectTask.Page.MultiSelectSport;
import org.junit.Test;


public class MultiSelectSportTest extends BaseTest {

    MultiSelectSport multiSelectSport = new MultiSelectSport();

    @Test
    public void task5(){
        multiSelectSport.openUrl();
        multiSelectSport.verifyOptionsFromDropdownWithScroll();
        multiSelectSport.verifyChosenSportResults();


    }
}
