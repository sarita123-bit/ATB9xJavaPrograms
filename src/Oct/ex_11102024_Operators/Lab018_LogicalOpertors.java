package Oct.ex_11102024_Operators;

public class Lab018_LogicalOpertors {
    public static void main(String[] args) {
        // !, && , ||
        boolean a = true;
        boolean b = true;
        boolean c= true || false;
        System.out.println(c);
        System.out.println(!a);
        System.out.println(!!b);
        System.out.println(!!!b);
        System.out.println(!!!!b); // no limits for ! not operator
    }
}
