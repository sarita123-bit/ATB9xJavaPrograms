package Oct.ex_25102024_String;

public class Lab086_String_Immutable_Fix {
    public static void main(String[] args) {
        String name = "sarita";
        name = name.toUpperCase(); // Converts all of the characters in this String to upper case using the rules of the default locale.
        // sarita -> SARITA
        System.out.println(name);
    }
}
