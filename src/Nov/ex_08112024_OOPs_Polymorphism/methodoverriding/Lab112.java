package Nov.ex_08112024_OOPs_Polymorphism.methodoverriding;

public class Lab112 {
    public static void main(String[] args) {
        Child p = new Child();
        p.home();

        Father f  = new Father();
        f.home();

        // Dynamic Dispatch.
        Father f1 = new Child();
        f1.home();

        // WebDriver driver = new ChromeDriver();

//       Child p1  = new Father(); //CE
//        p1.home();
    }
}

class Father{
    void home(){
        System.out.println("2BHK");
    }
    void f2(){

    }
}

class Child extends Father{

    @Override
    void home(){
        System.out.println("3BHK");
    }

    void f1(){

    }

}