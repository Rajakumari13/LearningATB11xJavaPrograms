package ex_013_Function;

import java.util.Scanner;

public class Lab_096_Arth_oper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=0;
        //Edge Case 1
        if(scanner.hasNextInt()) {
            a = scanner.nextInt();
        }
        else {
            System.out.println("Enter only integer");
            System.exit(0);
        }
        System.out.println("Enter the second number");
        int b=0;
        if(scanner.hasNextInt()) {
            b = scanner.nextInt();
        }
        else {
            System.out.println("Enter only integer");
            System.exit(0);
        }


        int result_sum = Sum(a, b);
        int result_sub = Sub(a, b);
        int result_mul = Mul(a, b);
        int result_div = Div(a, b);
        int result_mod = Mod(a, b);

        System.out.println("Sum of 2 num is "+result_sum);
        System.out.println("Sub of 2 num is "+result_sub);
        System.out.println("Mul of 2 num is " +result_mul);
        System.out.println("Div of 2 num is "+result_div);
        System.out.println("Mod of 2 num is "+ result_mod);

    }
    static int Sum(int a, int b)
    {
        return a+b;
    }
    static int Sub(int a, int b)
    {
        return a-b;
    }
    static int Mul(int a, int b)
    {
        return a*b;
    }
    static int Div(int a, int b) throws ArithmeticException
    {
    if(b==0)

    {
        throw new ArithmeticException("Division by zero is not allowed.");
        //O/p: Exception in thread "main" java.lang.ArithmeticException: Division by zero is not allowed.
    }
        return a/b;
    }
    static int Mod(int a, int b)
    {
        return a%b;
    }
}

// Create a Function of Sub, Sum, Mul and Div
// with parameter, a, b (take the parameter from the User)

// Logic Building
// Step 1 -> Inputs and Outputs
//  a, b - int -> Scanner
//  int -> variable result ->


// Step 2 - Rough logic -> Create functions
// function -> type 4th - with return and with arguments/ parameters


// Step 3 - Write the code and Find and Fix  -> Edge Cases