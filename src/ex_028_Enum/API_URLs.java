package ex_028_Enum;

public enum API_URLs {
    Quiklyz("https://www.quiklyz.com"),
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String URL;
    API_URLs(String url) {
        this.URL=url;
    }

    public String getURL() {
        return URL;
    }
}
