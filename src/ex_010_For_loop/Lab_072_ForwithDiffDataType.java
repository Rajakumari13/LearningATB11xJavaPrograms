package ex_010_For_loop;

public class Lab_072_ForwithDiffDataType {
    public static void main(String[] args) {
        for(long i=10l; i<=20;i++) //cannot use string (Non primitive data type)
        {
            System.out.println(i);
        }
        for(float f1=1.145f; f1<=3;f1++) // increased by 11.145 2.145
        {
            System.out.println(f1);
        }
    }
}
