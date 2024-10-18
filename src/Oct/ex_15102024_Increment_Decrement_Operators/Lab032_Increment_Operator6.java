package Oct.ex_15102024_Increment_Decrement_Operators;

public class Lab032_Increment_Operator6 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // A -> a++ -> 10 , a-> 11
        //  + ->
        // B  -> ++a -> 12 , a -> 12

        // A+B -> 10+12
    }
}
