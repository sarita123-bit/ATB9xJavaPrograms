package Oct.ex_11102024_Operators;

public class Lab016_OperatorOverloading2 {
    public static void main(String[] args) {
        String first_name = "Sarita";
        String last_name = "Sahoo";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        // SaritaSahoo1010 - first operator - + performed as Concatination
        System.out.println(a + b + first_name + last_name);
        // First + math -> 20SaritaSahoo

        System.out.println(first_name + last_name + (a + b));
        // BODMAS - SaritaSahoo20
    }
}
