package ex_015_StringBuffer_StringBuilder;

public class Lab_110_main_functions {
    public static void main(String[] args) {
        StringBuilder sen1=new StringBuilder("Java");
        //adds text at the end
        sen1.append(" Program");
        System.out.println(sen1); //Java Program

        //delete the substring (int start, int end)
        sen1.delete(4,12);
        System.out.println(sen1); //Java

        //replace the substring
        sen1.replace(0,4, "C++");
        System.out.println(sen1); //C++

        //insert the string from the index mentioned
        sen1.insert(3, " Platform Independent"); //if we enter range 4 shows error
        System.out.println(sen1); //o/p-> C++ Platform Independent

        //Length
        System.out.println(sen1.length()); //24

        //substring-start
        System.out.println(sen1.substring(4)); //Platform

        //substring-start end
        System.out.println(sen1.substring(4,12)); //Platform Independent

        //CharAt(Index)- ### ** Returns a character at a specified index**
        StringBuilder sb1=new StringBuilder("Rajakumari");
        System.out.println(sb1.charAt(3)); //a

        //setCharAt(int index, char ch)**`**: Changes a character at a position
        sb1.setCharAt(3, 'i');
        System.out.println(sb1);

        //### `**toString()**`**: Converts **`**StringBuffer**`** to **`**String**`
        String sb2tostring=sb1.toString();
        System.out.println(sb1);

        //### `**trimToSize()**`**: Reduces capacity to fit the current content**
        sb1.trimToSize();
        System.out.println(sb1.capacity()); //10


      //LastIndexOf- Returns the index of the last occurrence of the specified substring.Returns -1 if the substring is not found.
        //O/P in integer
        int index1= sen1.lastIndexOf("C++");
        int index2= sen1.lastIndexOf("java");
        int index3= sen1.lastIndexOf("Platform"); //case sensitive

        System.out.println("Last occurance of C++ is "+index1);
        System.out.println("Last occurance of java is "+index2);
        System.out.println("Last occurance of Platform is "+index3);

        //Capacity shows default capacity like 16.  You can define a minimum initial capacity while creating aStringBuffer or StringBuilder
       StringBuffer cap=new StringBuffer("Java");
        System.out.println(cap.capacity());
      //  System.out.println(cap.ensureCapacity(4500);




//Length consider as index starts from 0

    }
}
