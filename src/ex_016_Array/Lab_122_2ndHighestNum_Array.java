package ex_016_Array;


import java.util.Arrays;

public class Lab_122_2ndHighestNum_Array {
    public static void main(String[] args) {
        int num[]={45,12,21,86,98,105,188};
        System.out.println(num.length);
        System.out.println(num[2]);
       Arrays.sort(num);
        System.out.println(num[num.length-2]); //2nd highest num


    }
}
