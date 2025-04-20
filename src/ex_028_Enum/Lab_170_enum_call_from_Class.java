package ex_028_Enum;

public class Lab_170_enum_call_from_Class {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println("--------------------");
        System.out.println(color.RED.getHex_code());
        System.out.println(color.GREEN.getHex_code());


        System.out.println(" -- ");
        System.out.println(API_URLs.Quiklyz.getURL());
        System.out.println(API_URLs.google.getURL());
        System.out.println(API_URLs.vwo.getURL());
        System.out.println(API_URLs.katalon.getURL());


    }
    }

