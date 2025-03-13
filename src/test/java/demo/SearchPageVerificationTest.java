package demo;

import Actions.Actions;
import Pages.Pages;
import Base.BaseTest;
import Utils.Constans;
import Utils.CsvReader;
import com.opencsv.exceptions.CsvException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchPageVerificationTest extends BaseTest {
    @Test
    public void searchPageVerificationTest () throws InterruptedException, CsvException {
        List<String[]> data = CsvReader.readCSV(Constans.CSVPATH);
        for(String[]row : data) {
            System.setProperty(row[0], row[1]);
        }

        String searchWord = System.getProperty("search word");

        Assert.assertEquals(getPage().url(), Constans.URL, "The page did not load");
        Pages.homePage().setPage(getPage());
        Pages.homePage().typeText(searchWord);
        Pages.homePage().pressEnter();
        Thread.sleep(20000);
        Pages.resultPage().setPage(getPage());
        Assert.assertNotEquals(getPage().url(), Constans.URL, "button is not click");
        Assert.assertEquals(Pages.homePage().checkSearchWord(), searchWord, "The text was not entered");
        Assert.assertTrue(Actions.resultPageActions().checkHeaders(searchWord), "some headers don't contain the searched word");
    }
}
