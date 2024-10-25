package Oct.ex_16102024_Programs;

public class Lab036_Arguments_From_Console {
    public static void main(String[] args) {
        // Create a Program to check wheather A will go to Goa OR NOT
        // Take a input age = A ->  Goa
        // age > 25 -> Drinking - Goa
        // Ternary operator

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.printf("%s , %s ,%s", args[0], args[1], args[2]);
        System.out.println();
        int age = Integer.parseInt(args[1]);
        System.out.println(age > 25 ? "Allowed to Goa" : "Not Allowed");
    }
}
