package ex_014_Strings;

public class Lab_098_String_Immutable {
    public static void main(String[] args) {
        //String immutable in nature. IMMUTABLE-VALUE WON'T CHANGE
        String name="Rajakumari";
        System.out.println(name);
        String modify_name=name.toUpperCase();
        System.out.println("Modified name is "+modify_name);
    }
}

//Once created value can be modified using functions. BUt value cannot be changed. Either it stores in SCP or OA