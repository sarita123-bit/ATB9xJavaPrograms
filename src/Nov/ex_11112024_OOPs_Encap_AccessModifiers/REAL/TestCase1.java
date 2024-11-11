package Nov.ex_11112024_OOPs_Encap_AccessModifiers.REAL;

public class TestCase1 extends BaseClass {

    public TestCase1(){
        super(); // Parent Constructor - Super - Means Parent
        // this - current Object
        System.out.println("DC - TC1");
    }

    public void startTestCase(){
        openBrowser("chrome");
        closeBrowser();
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own Logic");
        super.setBrowser(browser, isAuth);
    }


    @Override
    public String toString() {
        return "TestCase1{}";
    }
}
