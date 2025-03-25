package ex_010_For_loop;

public class Lab_075_for_break {
    public static void main(String[] args) {
        for(int i=1; i<10; ++i)
        {
            System.out.println(i);
            if(i==5)
                break;
        }
    }
}
