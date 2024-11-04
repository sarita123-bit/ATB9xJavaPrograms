package Oct.ex_25102024_String;

public class Lab084_String_Creation {
    public static void main(String[] args) {
        String name = "sarita";
        name = "sahoo";
        name = "saritasahoo";
        name = "sarita"; // SCP

        // String -> data type
        // name -> Ref
        // = -> assignment operator
        // "sarita" - Literal(String)

        System.out.println(name);

        String name2 = new String("Sarita");
        String name3 = new String("Sarita");
        String name5 = name2;

        System.out.println(name2);
        System.out.println(name5);

    }
}
