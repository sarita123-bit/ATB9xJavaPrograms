package Oct.ex_10102024;

public class Lab007_Constants {

    public static void main(String[] args) {
        float pi = 3.14f; //Here pi is not a constant
        // 10,000 lines
        // Jr QA tries to change the value
        pi = 5;
        pi = 10;
        System.out.println(pi); //10.0

        float PI = 3.14f;
        System.out.println(PI);
        // 10,000
        // jR qa
         PI = 10; //This is not possible

        final int a = 10;
        final String STR="SAR";
        final double D1=999.99;

        final int AGE;
        //System.out.println(AGE); //CE : Variable 'AGE' might not have been initialized
        AGE = 19;
        //AGE = 29; //CE : Variable 'AGE' might already have been assigned to
        System.out.println(AGE);

    }
}
