package Actions;

import Pages.Pages;

public class ResultPageActions {
    public boolean checkHeaders(String text) {
        boolean hasWord = true;
        for (String header : Pages.resultPage().getHeaders()) {
            if (!header.contains(text)) {
                hasWord = false;
            }
            break;
        }
        return hasWord;
    }
}
