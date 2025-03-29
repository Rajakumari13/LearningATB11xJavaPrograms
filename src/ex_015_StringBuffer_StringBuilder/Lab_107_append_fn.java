package ex_015_StringBuffer_StringBuilder;

public class Lab_107_append_fn {
    public static void main(String[] args) {
        StringBuilder nametobeadd=new StringBuilder("Raja");
        nametobeadd.append("kumari");
        System.out.println(nametobeadd); //o/p-> Rajakumari . There will not be separate memory allocation for Raja now

        String s1="Raja";
        String s2="kumari";
        System.out.println(s1+s2); //Both s1 and s2 allocated with separate memory

    }
}
