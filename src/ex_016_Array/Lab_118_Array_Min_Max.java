package ex_016_Array;

public class Lab_118_Array_Min_Max {
    public static void main(String[] args) {
int array[]={15,26,58,61,2,81,47};
        int min_output=give_me_min_value(array);
        int max_output=give_me_max_value(array);
        System.out.println("The minimum number from the array is "+min_output);
        System.out.println("The minimum number from the array is "+ max_output);

    }
    static int give_me_min_value(int array[]) //method created
    {
        int min=array[0];
        for(int i=0;i< array.length;i++) //checks the value from index
        if (array[i]<min)
        {
           min=array[i];
        }
        return min;
    }
    static int give_me_max_value(int array[])
    {
        int max=array[0];
        for(int i=0;i< array.length;i++)
            if (array[i]>max)
            {
                max=array[i];
            }
        return max;
    }

}
