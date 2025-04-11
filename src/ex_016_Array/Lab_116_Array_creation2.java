package ex_016_Array;

public class Lab_116_Array_creation2 {
    public static void main(String[] args) {
        int marks[]={88, 96,75,99,61};
        System.out.println(marks[3]); //99


        String names[]=new String[3];
        names[0]="Raji";
        names[1]="Sankari";
        names[2]="Rudra";
        System.out.println(names[2]); //rudra

        boolean [] male_data=new boolean[2];
        male_data[0]=true;
        male_data[1]=false;
        System.out.println(male_data[0]); //true



        char grade[]=new char[4];
        grade[0]='A';
        grade[1]='B';
        grade[2]='C';
        grade[3]='d';
        System.out.println(grade[3]); //d
        System.out.println(grade[1]); //A
    }
}
