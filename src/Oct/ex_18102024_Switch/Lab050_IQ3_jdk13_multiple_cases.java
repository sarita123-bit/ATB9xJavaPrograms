package Oct.ex_18102024_Switch;

public class Lab050_IQ3_jdk13_multiple_cases {
    public static void main(String[] args) {
        int itemcode = 005;

        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
