package Pages;

import Base.PageTools;

public class HomePage extends PageTools {
    private final String searchField = "//textArea[contains(@class,\"gLFyf\")]";

    public void typeText(String text) {
        receivePage().locator(searchField).fill(text);
    }
    public void pressEnter() {
        receivePage().evaluate("document.querySelector('input[name=\"btnK\"]').click()");
    }

    public String checkSearchWord() {
        return receivePage().locator(searchField).inputValue();
    }
}
