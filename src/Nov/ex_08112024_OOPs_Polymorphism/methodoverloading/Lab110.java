package Nov.ex_08112024_OOPs_Polymorphism.methodoverloading;

public class Lab110 {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        mathOperations.add(1,2,3);
    }
}

class MathOperations {

    // Method Overloading
    // Method will be Over load
    // Same name but different Argument or param

    void add(){
        System.out.println("Zero Argument");
    }

    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    void add(int a, int b, int c) {
        System.out.println("Hello");
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, float f) {
        return a + b + f;
    }
}