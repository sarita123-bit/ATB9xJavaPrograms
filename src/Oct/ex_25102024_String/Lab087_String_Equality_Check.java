package Oct.ex_25102024_String;

public class Lab087_String_Equality_Check {
    public static void main(String[] args) {
        String s1 = "Hello"; // SCP
        String s4 = "Hello"; // SCP
        String s2 = new String("Hello"); // Object Area
        String s3 = new String("Hello"); // Object Area
        String s5 = new String("hello"); // Object Area

        // 1 SCP , 3 OA
        // == -> comparison
        // ==  This is checking the ref locations

        System.out.println(s1 == s3); // false
        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // false
        System.out.println(s1 == s4); // true - SCP- -> Hello
        System.out.println(s3 == s5); // false

        // equals ( content) -> value
        // How can I check the values? equals == value

        System.out.println("--------------------------");

        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println(s3.equals(s5)); // false
        System.out.println(s3.equalsIgnoreCase(s5)); // true
    }
}
