package ex_022_Access_Modifier.Police;

public class Cop {
    private int gun;
    String IDcard;

    //PC
    public Cop(int bullet) {
        this.gun = bullet;
        System.out.println(bullet);
    }
    //Method/behaviour
    protected void CanIshoot()
    {
        System.out.println("Yes! you can");
    }
}
