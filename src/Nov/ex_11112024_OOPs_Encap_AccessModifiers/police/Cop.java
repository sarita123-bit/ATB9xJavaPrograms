package Nov.ex_11112024_OOPs_Encap_AccessModifiers.police;

public class Cop {
    private int gun;
    public String idCard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes, You can!!");
    }
}
