package Oct.ex_18102024_Switch;

public class Lab049_IQ2 {
    public static void main(String[] args) {
        char ch = 'A'; // 65
        switch (ch) {
            case 65:
                System.out.println("A");
        }

//        boolean b = true;
//        switch (b) { //invalid
//        }

        long a11 = 30l;
        switch ((int) a11) {
        }

        int a = 98;
        switch (a){
            case 98:
                System.out.println("98");
//            case 98:
//                System.out.println("98"); // duplicate switch case is invalid
        }

    }
}
