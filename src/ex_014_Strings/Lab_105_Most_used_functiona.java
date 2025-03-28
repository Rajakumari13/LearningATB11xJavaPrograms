package ex_014_Strings;

public class Lab_105_Most_used_functiona {
    public static void main(String[] args) {
        //length
        String name="Rajakumari Jeyaraman"; //INCLUDING SPACE-20
        System.out.println("Length of your name is "+ name.length());

        //Find particular word by length--> charAT checks as INDEX 0 1 2 3 4 5 ...
        System.out.println(name.charAt(2)); //j

        //Letter position -> Index from left to right
        System.out.println(name.indexOf("j"));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("b")); //output -1 as no value there



        //Exception for chatAT
        // System.out.println(name.charAt(25)); -> Index 25 out of bounds for length 20

        //Concat
        System.out.println(name.concat(" Selvam"));
        System.out.println(name + " Selva");

        //compare -> ALways provides output as 0,1
        System.out.println(name.compareToIgnoreCase("Rajakumari jeyaraman selva")); //0
        System.out.println(name.compareTo("Rajakumari jeyaraman selva"));

        //contains
        System.out.println(name);
        System.out.println(name.contains("aja"));//true

        //equals
        System.out.println(name.equals("Rajakumari jeyaraman")); //false
        System.out.println(name.equalsIgnoreCase("Rajakumari jeyaraman")); //true
        String name1=new String("  Niagara o roar again  ");

        //trim
        System.out.println(name1.trim()); // leading and trailing spaces removed from it.

        //substring
        System.out.println(name1.substring(2,6));//count space as well -1
    }
}
