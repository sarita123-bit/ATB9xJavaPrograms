package Nov.ex_07112024_OOPs_Inheritance.singleinheritance.real;

public class TestCase2 extends Common_BaseTest{
    TestCase2(){
        System.out.println("DC - Child2");
    }

    void testcase2() {
        startBrowser();
        System.out.println("TC2 Executing");
        readExcelFile();
        closeBrowser();
    }
}
