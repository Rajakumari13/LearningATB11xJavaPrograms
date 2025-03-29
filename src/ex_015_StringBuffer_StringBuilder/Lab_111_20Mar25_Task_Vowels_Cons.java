package ex_015_StringBuffer_StringBuilder;

import java.util.Scanner;

public class Lab_111_20Mar25_Task_Vowels_Cons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word or sentence to count the vowels and consonants");
        String sentence=sc.nextLine();
       // String sentence = "Hi how are you 123";
        sentence = sentence.toLowerCase();

        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
                //vowel=vowel+1;
                vowel++;
            }
            else if (ch>='a' && ch <='z')
            {
                consonant++;
            }

        }
        System.out.println("The count of vowels are "+vowel);
        System.out.println("The count of consonants are "+consonant);
       sc.close();
    }

}

/*Count of vowels and consonants
i/p -> String sentence o/p -> int (counts)

Logic
sentence to be counted with each character. If any char match with aeiou to be consider as vowel, if not no consonents

Methods-> Lenth(), chatAt

Edge case:
Consonants should not add space and integers in their counts

 */