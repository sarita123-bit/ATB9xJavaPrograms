package Task.task_15102024;

public class Task1_MaximumOfTwoNumbers {
    public static void main(String[] args) {
        int x = 100;
        int y = 100;
        // Rough logic x > y ->  x : y
        int max = x > y ? x : y;
        // String max = x > y ? "Max is -> x" : "Max is -> y";
        System.out.println(max);
    }
}
