package ex_016_Array;

public class Lab_121_Sum_array {
    public static void main(String[] args) {
        int[] numbers= {52,89,25};
        int sum=0;

        for(int i=0;i< numbers.length;i++)
        {
            sum=sum+numbers[i];
        }
        System.out.println("The sum is "+sum);
        System.out.println(" ---");

       /* System.out.println(" For Each ---"); //Enhanced for loop
        for (int n : numbers) {
            sum = sum + n;
        }
        System.out.println(sum);
*/
    }
}
