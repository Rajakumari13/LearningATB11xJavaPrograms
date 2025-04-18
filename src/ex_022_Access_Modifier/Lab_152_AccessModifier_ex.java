package ex_022_Access_Modifier;

public class Lab_152_AccessModifier_ex {
    public static void main(String[] args) {
son s1=new son();
        System.out.println(s1.gold_kg);
        //System.out.println(s1.bhk2_home);
    }
}

class father{
    private int bhk2_home=1;
    protected int gold_kg= 1;
}
class son extends father{
    void getGold(){
        System.out.println(gold_kg);
        //System.out.println(bhk2_home);
    }
}