package Practice.practice_Scanner_Methods;

import java.util.Scanner;

public class Scanner_nextLine_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int value

        System.out.println("Enter first value");
        int num1 = sc.nextInt();

        System.out.println("Enter second value");
        int num2 = sc.nextInt();

        int sum = sum_of_two_Numbers(num1,num2);
        System.out.println(sum);

        // String Value
        sc.nextLine(); // to consume the \n from the buffer memory

        System.out.println("Enter your firstname");
        String firstname = sc.nextLine();

        System.out.println("Enter your lastname");
        String lastname = sc.nextLine();
        String userfullname = fullName(firstname,lastname);
        System.out.println(userfullname);

    }
    static int sum_of_two_Numbers(int a , int b){
        return a+b;
    }
    static String fullName(String firstName , String lastName){
        return firstName+" "+lastName;
    }
}
