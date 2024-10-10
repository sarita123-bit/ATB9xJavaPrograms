package Oct.ex_09102024;

public class Lab005_DataTypes {
    public static void main(String[] args) {
        // Store the distance between earth and moon
        long distance_between_earth_moon = 384400000l; //in M
        double distance_between_earth_moon2 = 384400000.865; //in M

        byte age= 122;
        int age1 = 100; // // wasting memory - 214768348488

        // int, double - 99% used in practicals, not worring about memory

        char c = 'A'; //A-Z, a-z, !@#$%^&*()
        System.out.println(c);

        char c1 = '$';
        System.out.println(c1);

        char c2 = '\n'; // Escape Char - give you newline
        System.out.println(c2);

        char c3 = '\u1F6A'; // Unicode
        System.out.println(c3);//  Ὢ :)

        String name = "Sarita";
        System.out.println(name);
        //char cc = "s"; //Error





    }
}
