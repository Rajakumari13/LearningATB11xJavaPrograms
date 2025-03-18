package ex_003_Variables_Datatypes;

public class Lab_010_printf {
    public static void main(String[] args) {
        int a=10;
        float b=3.2651f;
        String name="Raji";
        boolean Raji_AT=true;
        System.out.printf("Printf used to format and just replace the value give next to comma that is %d ", a);
        /*
        %d--> Used to replace int, short, byte, long
        %f--> Used to replace float
        %s--> Used to replace string
        %b--> Used to replace boolean
         */
        System.out.printf("Printf used to format and just replace the value give next to comma that is %f ", b);
        System.out.printf("Printf used to format and just replace the value give next to comma that is %s ", name);
        System.out.printf("Printf used to format and just replace the value give next to comma that is %b", Raji_AT);
        System.out.println();
        System.out.println("___");        //Printf prints without space
        System.out.printf("%d + %s", a,name);
    }
}
