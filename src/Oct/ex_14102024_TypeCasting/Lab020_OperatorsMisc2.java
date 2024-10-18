package Oct.ex_14102024_TypeCasting;

public class Lab020_OperatorsMisc2 {
    public static void main(String[] args) {
        int a = 10;
        //int a = 4; (a%b is 4)
        int b = 12;
        System.out.println(a%b); //10
        // Modulus Operator
        // 10 % 12 -> division doesn't complete
        // there is no complete division. -> default -> here 10


        // = and ==
        int x = 10;
        boolean y = (10 == 11); //Comparsion 2 values
        System.out.println(x); // 10
        System.out.println(y); // false


        long l = 10l; // Byte or bits -> 64 bits, 8 Bytes
        String s = "name"; //  8, 64


        char a1 = 'A'; // ASCII -> 65
        char b1 = 'B'; // 66
        // Rule - concatenation of char -> int calculation
        // a1+b1 - 65+66 -> 131
        System.out.println(a1+b1); //131

        System.out.println('A' == 65); //true


        short s1 = 10;
        char c = 'A'; // 65
        System.out.println(s1); //10
        System.out.println(c); //A
        System.out.println(c+s1); //75


    }
}
