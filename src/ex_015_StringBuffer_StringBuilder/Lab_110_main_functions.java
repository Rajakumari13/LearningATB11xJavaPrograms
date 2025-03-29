package ex_015_StringBuffer_StringBuilder;

public class Lab_110_main_functions {
    public static void main(String[] args) {
        StringBuilder sen1=new StringBuilder("Java");
        sen1.append(" Program");
        System.out.println(sen1); //Java Program
        sen1.delete(4,12);
        System.out.println(sen1); //Java
        sen1.replace(0,4, "C++");
        System.out.println(sen1);
        sen1.insert(1, "Abc");
        System.out.println(sen1); //o/p->CAbc++
//Length consider as index starts from 0

    }
}
