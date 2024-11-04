package Practice.practice_TypeCasting;

public class TypeCasting_001 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 5;
        // byte c = b1*b2; //CE

        byte c = (byte)(b1*b2);
        System.out.println(c);
    }
}
