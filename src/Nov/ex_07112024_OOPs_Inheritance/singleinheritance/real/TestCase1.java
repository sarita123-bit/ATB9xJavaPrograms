package Nov.ex_07112024_OOPs_Inheritance.singleinheritance.real;

public class TestCase1 extends Common_BaseTest{
    public TestCase1(){
        System.out.println("DC - Child1");
    }

    public void testcase() {
        startBrowser();
        readExcelFile();
        closeBrowser();
    }
}
