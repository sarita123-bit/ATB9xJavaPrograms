package Oct.ex_10102024;

public class Lab008_LocalInstanceStaticVariables {
    int i_age; // instance variable
    static int s_age; // static variable

    public static void main(String[] args) {
        int age; // local variable
        age = 100;
        System.out.println(age);
        //System.out.println(i_age); CE: make i_age as static
        System.out.println(s_age);


    }
}
