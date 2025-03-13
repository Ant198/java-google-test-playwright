package Base;

import com.microsoft.playwright.Page;

public class PageTools {
    private Page page;

    public void setPage(Page page) {
        this.page = page;
    }

    public Page receivePage() {
        return page;
    }
}
