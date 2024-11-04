package Task.task_22102024;

import java.util.Locale;
import java.util.Scanner;

public class Task3_Pallindrom_Check_Using_Loop {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        original = original.toLowerCase();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("string/number is a palindrome.");
        else
            System.out.println("string/number isn't a palindrome.");
    }
}
