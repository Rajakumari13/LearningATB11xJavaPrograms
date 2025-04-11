package ex_016_Array;

public class Lab_115_Array_creation1 {
    public static void main(String[] args) {
        //2 ways of creating array- Assiging value directly
        int marks []= {95,85, 48, 75, 62};
       // int [] marks= {95,85, 48, 75, 62};

        //Fixed size using new
        int marks1[]= new int[4];
        int[] marks2=new int[5];
        int mark3=10;

        String names[]=new String[4];
        names[0]="Raji";
        names[1]="selva";
        names[2]="Rudra";
        names[3]="Muruga";

        System.out.println(marks[1]);
        System.out.println(names[2]);

    }
}

//Under the array [length should be count from 1,2,3 etc]. But index starts with 0,1,2,3 etc.