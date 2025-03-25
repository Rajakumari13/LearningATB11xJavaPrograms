package ex_008_if_else_statement;

public class Lab_049_ifelse_arg_Evenodd {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        if (num%2==0) {
            System.out.println("Entered number " +num+ " is Even");
        }
        else
        {
            System.out.println("Entered number " +num+ " is Odd");
        }
    }
}
