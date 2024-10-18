package Oct.ex_10102024;

public class Lab010_Literals {
    public static void main(String[] args) {
        boolean is_married = true;
        boolean is_married_amit = false;
        // First Type - Boolean  values - true or false.

        // Literal - integer type - Decimal system.
        int age = 78;
        int marks_ece = -1; // 1 store 1's compliment (ECE)
        System.out.println(marks_ece);
        int lamborgini = 0;

        // Binary Literal
        int b_age = 65; // Decimal System - Y, base will be 10

        // Binary Literal
        int binary_num = 0b1010;

        // Octal base? -> 8
        int octal = 0101; // 0101 = (0 × 8³) + (1 × 8²) + (0 × 8¹) + (1 × 8⁰) = 65

        // Hexadecimal Literals
        int hex = 0Xface; //base 16 color combination are in hex - #28a745


        // Char Literals

        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b'; //backspace
        char car_r = '\r'; // delete the previous word

        System.out.println("Sarita"+ new_line +  "Sahoo");
        //System.out.println("Sarita" +  "Sahoo");
        System.out.println("Sarita"+ tab_line +  "Sahoo");
        System.out.println("Sarita"+ back_space +  "Sahoo");
        System.out.println("Sarita"+ car_r +  "Sahoo");


        char c11  = '\u1F60';
        // ASCII ->
        // chinese - india, japense -> Unicode
        // /u09878


        // null - non primitive
        String s1 = null; //bits -> 64
        //int age = null;
        // boolean s = null;

    }
}
