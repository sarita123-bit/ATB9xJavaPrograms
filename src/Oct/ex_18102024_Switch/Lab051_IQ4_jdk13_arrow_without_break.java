package Oct.ex_18102024_Switch;

public class Lab051_IQ4_jdk13_arrow_without_break {
    public static void main(String[] args) {
        int itemCode = 001; // JDK  >13

        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
