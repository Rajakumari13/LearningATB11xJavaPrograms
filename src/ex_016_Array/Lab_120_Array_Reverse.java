package ex_016_Array;

public class Lab_120_Array_Reverse {
    public static void main(String[] args) {
        int array[]={85,15,76,82,51};

        //array reverse  5 4 3 2 1
        //array length 5 4 3 2 1 0

        for(int i= (array.length)-1;i>=0; i--)
        {
            System.out.println(array[i]);
        }
    }
}
