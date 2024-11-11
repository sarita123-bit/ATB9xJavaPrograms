package Nov.ex_08112024_OOPs_Encapsulation;

public class Lab114 {
    public static void main(String[] args) {
        Person p1 = new Person("P", "123");
        String name = p1.getName();
        System.out.println("Name  is : "+name); //P

        p1.setName("S");
        System.out.println("Name  is-> : "+p1.getName()); // S

        /*Person p1= new Person();
        p1.setName("Sarita");
        String name = p1.getName();
        System.out.println(name);*/
    }
}

class Person{
    private String name;
    private String phone_no;


    public Person(String name, String phone_no) {
        this.name = name;
        this.phone_no = phone_no;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}