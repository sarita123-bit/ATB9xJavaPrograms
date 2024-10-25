package Task.task_18102014;

import java.util.Scanner;

/**
 * Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
 * Input. -
 * choice - 1 - km → m, km → 1km
 * choice - 2 - f → c, f → c
 */
public class Task3_Converter_Using_Switch {
    public static void main(String[] args) {
        System.out.println("Enter choice for conversion 1 or 2");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Conversion from km to miles");
                //To convert kilometers to miles-
                //Distance in miles = Distance in kilometers × 0.621371
                System.out.println("Enter the value in kilometers");
                double km = sc.nextDouble();
                double miles = km * 0.621371;
                //System.out.println("Miles converted to kilometers " + miles);
                //"2f" is a format specifier that indicates that a floating-point number should be rounded to two decimal places and displayed with two digits after the decimal point:
                //.2: Specifies the number of decimal places to display
                //f: Indicates that the value being inserted is a floating-point number
                System.out.printf("%.2f kilometers is %.2f miles.%n", km, miles);
                break;

            case 2:
                System.out.println("Conversion from Celsius to Fahrenheit");
                System.out.println("Enter the value in Celsius");
                double celsius = sc.nextDouble();
                double fahrenheit = celsius * 5 / 9 + 32; // Conversion formula ;
                System.out.printf("%.2f celsius is %.2f fahrenheit", celsius, fahrenheit);
                break;

            default:
                System.out.println("Error: Invalid choice. Please enter 1 or 2.");
                break;
        }
        sc.close();
    }
}
