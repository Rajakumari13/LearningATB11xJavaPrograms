package ex_010_For_loop;

public class Lab_076_for_continue {
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        {
            if(i==6) {
                System.out.println(i); //print when condition true
                continue;
            }
            System.out.println("This statement Code skipped when user inputs 6");
        }
    }
}
