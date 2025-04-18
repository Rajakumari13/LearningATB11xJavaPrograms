package ex_022_Access_Modifier.Theif;

import ex_022_Access_Modifier.Police.Cop;

public class Theif {
    public static void main(String[] args) {
        Cop jr_cop2=new Cop(5);
     //   jr_cop2.CanIshoot(); Cannot access this by theif as it is protected in Police package
    }
}
