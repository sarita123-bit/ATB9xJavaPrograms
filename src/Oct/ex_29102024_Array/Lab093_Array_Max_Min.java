package Oct.ex_29102024_Array;

import java.util.Arrays;

public class Lab093_Array_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max_value = give_max(array);
        int min_value = give_min(array);
        System.out.printf("Max Value is %d", max_value);
        System.out.println();
        System.out.printf("Min Value is %d", min_value);

        System.out.println("-------");
        // Another way to find max
        int[] array1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arrays.sort(array1);
        System.out.println(array1[array1.length-1]); // 77

    }

    static int give_max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > max ){
                max = array[i];
            }
        }

        return max;
    }

    static int give_min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < min ){
                min = array[i];
            }
        }

        return min;
    }

}
