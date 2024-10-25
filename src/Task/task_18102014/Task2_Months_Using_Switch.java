package Task.task_18102014;

import java.util.Scanner;

/**
 * Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
 * Input  - 12
 * Out - Dec.
 */
public class Task2_Months_Using_Switch {
    public static void main(String[] args) {
        System.out.println("Enter input from 1 to 12");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month) {
            case 1 -> System.out.println("Jan");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("Mar");
            case 4 -> System.out.println("Apr");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("Jun");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("Aug");
            case 9 -> System.out.println("Sep");
            case 10 -> System.out.println("Oct");
            case 11 -> System.out.println("Nov");
            case 12 -> System.out.println("Dec");
            default -> System.out.println(" Invalid input entered");
        }
        sc.close();
    }
}
