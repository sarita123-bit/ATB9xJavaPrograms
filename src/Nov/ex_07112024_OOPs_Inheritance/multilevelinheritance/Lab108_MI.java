package Nov.ex_07112024_OOPs_Inheritance.multilevelinheritance;

public class Lab108_MI {
    public static void main(String[] args) {
        Child c = new Child();
        c.home();
        c.gf();
        c.f();
        c.c();

        Father f1 = new Father();
        f1.gf();
        f1.f();
        f1.father_extra();

        GrandFather g1 = new GrandFather();
        g1.gf();
        g1.home();
    }
}
