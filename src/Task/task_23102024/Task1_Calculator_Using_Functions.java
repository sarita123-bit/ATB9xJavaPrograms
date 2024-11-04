package Task.task_23102024;

import java.util.Scanner;

/*
 * Create a Function of Sub, Sum, Mul and Div with parameter, a, b
 * (take the parameter from the User)
 * 3 → user input
 * 4 - user input
 * sum(3,4)
 */
public class Task1_Calculator_Using_Functions {
    public static void main(String[] args) {
        // Logic Building

        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->

        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1 ");
        int a = scanner.nextInt();
        System.out.println("Enter the num2 ");
        int b = scanner.nextInt();

        int result = sum_of_numbers(a, b);
        System.out.println("Sum is -> " + result);

        int result_sub = sub_of_numbers(a, b);
        System.out.println("Sub is -> " + result_sub);

        int result_div = div_of_numbers(a, b);
        System.out.println("Div is -> " + result_div);

        int result_mul = mul_of_numbers(a, b);
        System.out.println("Mul is -> " + result_mul);

        int result_mod = modulus_of_numbers(a, b);
        System.out.println("Modulus is -> " + result_mod);// Remainder


        scanner.close();
    }

    static int div_of_numbers(int a, int b) {
        if (b == 0) {
            System.out.println("Not allowed");
        }
        return a / b;
    }

    static int modulus_of_numbers(int a, int b) {
        return a % b;
    }

    static int mul_of_numbers(int a, int b) {
        return a * b;
    }

    static int sub_of_numbers(int a, int b) {
        return a - b;
    }

    static int sum_of_numbers(int a, int b) {
        return a + b;
    }
}
