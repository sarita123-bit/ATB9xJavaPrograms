package Oct.ex_29102024_Array;

public class Lab090_Arrays_Creation {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90, 91, 92};
        // 0 to 6
        // Arrays Creation with the pre-defined elements.
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        //System.out.println(marks[10]); // ArrayIndexOutOfBoundsException

        System.out.println(marks.length); //length 1

        // Creation, Size - Fix
        int[] marks_2 = new int[5]; //Fixed Size
        System.out.println(marks_2.length);
        marks_2[0] = 11;
        marks_2[1] = 12;
        marks_2[2] = 13;
        marks_2[3] = 14;
        marks_2[4] = 15;
        System.out.println(marks_2[0]);
        System.out.println(marks_2[1]);
        System.out.println(marks_2[4]);
        //System.out.println(marks_2[-1]); // ArrayIndexOutOfBoundsException
        //System.out.println(marks_2[10]); // ArrayIndexOutOfBoundsException

    }
}
