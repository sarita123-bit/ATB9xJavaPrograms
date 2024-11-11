package Nov.ex_11112024_OOPs_Encap_AccessModifiers;

import Nov.ex_11112024_OOPs_Encap_AccessModifiers.REAL.TestCase1;

public class Lab115_Encap_AM {
    public static void main(String[] args) {
        TestCase1 tc1 = new TestCase1(); // Dynamic DisPatch
        tc1.setBrowser("chrome",true);
        tc1.startTestCase();
    }
}
