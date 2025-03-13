package Pages;

import Base.PageTools;

import java.util.List;

public class ResultPage extends PageTools {
    private final String header = "//div[@class='yuRUbf']//a//h3";
    public List<String> getHeaders() {
        System.out.println(receivePage());
        List<String> headers = receivePage().locator(header).allInnerTexts();
        return headers;
    }
}
