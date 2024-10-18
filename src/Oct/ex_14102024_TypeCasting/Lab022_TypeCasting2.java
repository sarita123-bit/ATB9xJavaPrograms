package Oct.ex_14102024_TypeCasting;

public class Lab022_TypeCasting2 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;

        // short s = phone_no; // Implict - JVM
        short s = (short)phone_no; // Explicit - User - Loss that data
        System.out.println(s); // 5866 ??
    }
}
