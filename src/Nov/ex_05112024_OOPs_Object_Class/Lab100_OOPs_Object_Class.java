package Nov.ex_05112024_OOPs_Object_Class;

public class Lab100_OOPs_Object_Class {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sarita"; // A
        s1.eat(10); // B
        System.out.println(s1);



        // ```
        //1. Students - Class Loading
        //2. s1 - Object Ref.
        //3. new StudentsATB() -> Object creation
        //```

        Student s2 = new Student();
        s2.name = "Sarita2";
        s2.eat(20); // B
        System.out.println(s2);


        Person p1;
        // Person - Class Loaders - Load the class
        // p1 -> ref - null
        // Byte, Bits -> 8, 64

    }
}
