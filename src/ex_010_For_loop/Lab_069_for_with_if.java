package ex_010_For_loop;

public class Lab_069_for_with_if {
    public static void main(String[] args) {
        for(int child=0; child<18; child++)
        {
            if(child<15)
                System.out.println("No mobile to play"); //15 times 0 to14
            else
                System.out.println("Mobile allowed to study"); //2 times 15,16
        }
        System.out.println("You are adult"); //17
    }
}
