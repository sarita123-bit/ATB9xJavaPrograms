package Task.task_29102024;

import java.util.Scanner;

public class Task1_DuplicatesInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elements of Array");
            arr[i] = sc.nextInt();
        }
        findDuplicatesInArray(arr);
    }

    static void findDuplicatesInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " is duplicate element");
                }
            }
        }
    }
}
