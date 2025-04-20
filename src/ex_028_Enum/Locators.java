package ex_028_Enum;

public enum Locators {
    page_button("#btn1_register"),
    page_input("#inpu_tname");

    private String locators;
    //pc
    Locators(String locators){
        this.locators = locators;
    }

    public String getLocators() {
        return locators;
    }
}

