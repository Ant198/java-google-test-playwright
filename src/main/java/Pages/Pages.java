package Pages;

public class Pages {
    private static HomePage homePage;
    private static ResultPage resultPage;

    public static HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public static ResultPage resultPage() {
        if (resultPage == null) {
            resultPage = new ResultPage();
        }
        return resultPage;
    }
}
