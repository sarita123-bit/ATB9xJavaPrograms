package Task.task_Nov.task_05112024;

public class Task1_Runner {
    public static void main(String[] args) {

        //Creating objects

        Task1_Dog dog1 = new Task1_Dog();

        dog1.breed = "Niapolitan Mastiff";
        dog1.size = "Large";
        dog1.age = 5;
        dog1.colour = "Black";

        System.out.println(dog1.breed +" ");
        dog1.eat();
        dog1.sleep();
        dog1.sit();
        dog1.run();

        System.out.println("----------------");

        Task1_Dog dog2 = new Task1_Dog();

        dog2.breed = "Maltese";
        dog2.size = "Small";
        dog2.age = 2;
        dog2.colour = "White";

        System.out.println(dog2.breed +" ");
        dog2.eat();
        dog2.sleep();
        dog2.sit();
        dog2.run();

        System.out.println("----------------");

        Task1_Dog dog3 = new Task1_Dog();

        dog3.breed = "Chow chow";
        dog3.size = "Medium";
        dog3.age = 3;
        dog3.colour = "Brown";

        System.out.println(dog3.breed +" ");
        dog2.eat();
        dog2.sleep();
        dog2.sit();
        dog2.run();

        System.out.println("----------------");
    }
}
