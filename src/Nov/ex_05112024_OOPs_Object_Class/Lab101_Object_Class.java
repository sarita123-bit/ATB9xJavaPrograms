package Nov.ex_05112024_OOPs_Object_Class;

public class Lab101_Object_Class {
    public static void main(String[] args) {
        Cat c1= new Cat();
        c1.name = "Rosy";
        c1.sleep();
        System.out.println(c1.name);
    }
}

class Cat{
    String name;

    void sleep(){
        System.out.println("Sleeping");
    }
}