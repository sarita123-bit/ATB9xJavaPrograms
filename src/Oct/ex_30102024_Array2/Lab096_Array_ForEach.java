package Oct.ex_30102024_Array2;

public class Lab096_Array_ForEach {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 90;
        a[1] = 91;
        a[2] = 92;

//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

        for (int i : a) {
            System.out.println(i);
        }

        String[] names = {"Sarita1", "Sarita2", "Sarita3", "Sarita4"};
        for (String name : names) {
            System.out.println(name);
        }

        /*for (String n : names) {
            System.out.println(n);
        }*/

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
