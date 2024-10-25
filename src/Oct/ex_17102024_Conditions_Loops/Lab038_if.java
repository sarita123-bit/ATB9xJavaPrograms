package Oct.ex_17102024_Conditions_Loops;

import java.util.Scanner;

public class Lab038_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Age is : "+ age);
        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        if(age > 18) {
            System.out.println("Allowed to vote!");
        }
        sc.close();
    }
}
