package ex_027_Static;

public class Lab_167_Static_REAL {
    public static void main(String[] args) {
        ATB.joinZoomForClass();
        ATB.doAssignment();
     //   ATB.assignment();-> Will be executed once obj is created
        System.out.println(ATB.course_name);
        System.out.println(ATB.mentor_name);
        System.out.println("--------------------------");

        ATB a1=new ATB();
        a1.assigment();
        a1.setStudent_name("Raji");
        a1.setPhone(655564165);
        System.out.println(a1.getStudent_name()); //Have to print to find  the o/p on screen
        System.out.println(a1.getPhone());

    }
}
class ATB{
    static{
        System.out.println("Class starts soon. Join at 7AM without delay"); //static content to be shown once class called
    }
    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }

    static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }

    void assigment(){
        System.out.println("Each student done their assessment in diff day and time");
    }
    private String student_name; //Non static variables
    private int phone;
    static String course_name="ATB11x";
    static String mentor_name="Pramod Dutta";

    //to use private class, use getter and setter

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
}