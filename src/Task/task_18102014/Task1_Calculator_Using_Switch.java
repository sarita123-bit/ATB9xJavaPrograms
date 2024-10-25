package Task.task_18102014;

import java.util.Scanner;

/**
 * Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
 * Inputs :   num 1, num 2, +
 * Output :  num1+num2 → print information.
 */

public class Task1_Calculator_Using_Switch {
    public static void main(String[] args) {
        System.out.println("Enter number 1");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("Enter number 2");
        int number2 = sc.nextInt();
        System.out.println("Enter Operator (+, -, *, /, %)");
        char operator = sc. next().charAt(0);
        double result;

        switch(operator){

            case '+':

                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;

            case '-':

                result = number1 - number2;
                System.out.println(number1 + "-" + number2 + "=" + result);
                break;


            case '*':

                result = number1 * number2;
                System.out.println(number1 + "*" + number2 + "=" + result);
                break;

            case '/':

                result = number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + result);
                break;

            case '%':

                result = number1 % number2;
                System.out.println(number1 + "%" + number2 + "=" + result);
                break;

            default:
                System.out.println("Error: Invalid operator.");
                break;

        }
        sc.close();
    }
}
