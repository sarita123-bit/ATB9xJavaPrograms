package Nov.ex_08112024_OOPs_Encapsulation;

public class Lab113 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "hacker";
        System.out.println(vwoLogin.password);

  //      GoodVWOLogin vwoLogin1 = new GoodVWOLogin("goodadmin", "admin123");
//        System.out.println(vwoLogin1.password);
//        vwoLogin1.password = "pass123";

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("goodadmin", "admin123");
        //System.out.println(vwoLogin1.password); //CE
        //vwoLogin1.password = "pass123"; //CE

        String pass = vwoLogin1.getPassword();
        vwoLogin1.setPassword("hacker123");
        System.out.println("password is: "+vwoLogin1.getPassword());

    }
}

class VWOLogin {
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class GoodVWOLogin{
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

}