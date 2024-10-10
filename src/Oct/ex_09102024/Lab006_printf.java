package Oct.ex_09102024;

public class Lab006_printf {
    public static void main(String[] args) {

        int age = 20;
        System.out.printf("Your age is %d",age);

        String name  = "Sarita";
        System.out.printf("Hi, Your name is %s",name);

        boolean b = true;
        System.out.printf("Hi, %b",b);

        System.out.println();

        int table = 2;
        System.out.printf("%d x %d = %d", table, 1, table*1);
        System.out.println();
        System.out.printf("%d x %d = %d", table, 2, table*2);
        System.out.println();
        System.out.printf("%d x %d = %d", table, 3, table*3);
    }
}
