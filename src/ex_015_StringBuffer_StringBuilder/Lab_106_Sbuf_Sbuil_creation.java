package ex_015_StringBuffer_StringBuilder;

public class Lab_106_Sbuf_Sbuil_creation {
    public static void main(String[] args) {
        //Normal string used 90% of the program
        String name="Raji";
        String name1= new String("Raji");
        //only diff is we can do append, insert, deleter replace using this
        StringBuffer sbuf=new StringBuffer("Raji");
        StringBuilder sbuild=new StringBuilder("Raji");

        System.out.println(name);
        System.out.println(name1);
        System.out.println(sbuf);
        System.out.println(sbuild);

    }
}
