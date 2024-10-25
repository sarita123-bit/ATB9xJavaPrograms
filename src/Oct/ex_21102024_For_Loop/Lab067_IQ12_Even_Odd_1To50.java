package Oct.ex_21102024_For_Loop;

public class Lab067_IQ12_Even_Odd_1To50 {
    public static void main(String[] args) {
        //TO find the even numbers from 1 to 50
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
