package Task.task_22102024;

public class Task1_Reverse_Number_Using_Loop {
    public static void main(String[] args) {
        int a = 123456;
        int reverse = 0;
        for(; a != 0 ; a= a/10) {
            int reminder = a % 10;
            reverse = reverse * 10 + reminder;
        }
        System.out.println("reverse number of 123456  " + reverse);

    }
}
