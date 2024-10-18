package Oct.ex_14102024_TypeCasting;

public class Lab023_TypeCasting3 {
    public static void main(String[] args) {
        // GST - 18.45
        int course = 100;
        float GST = 18.45f;
        int total_price = course+(int)GST; // Narrowing -> Explicit
        System.out.println(total_price); // 118 -> Loss of data -> here .45
    }
}
