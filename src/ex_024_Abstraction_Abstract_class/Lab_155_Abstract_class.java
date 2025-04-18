package ex_024_Abstraction_Abstract_class;

public class Lab_155_Abstract_class {
    public static void main(String[] args) {
//Father f=new Father(); --> have to override
        Son s1=new Son();
        s1.Loan_50k();//Child will pay the pending loan
        s1.loan_25k(); //Paid by father
        Father f1=new Son(); //Father can be a ref fpr child
       // Son s2=new Father; -> No child ref for father
        f1.loan_25k();//Paid by father
        f1.Loan_50k(); //Child will pay the pending loan
}
    }

//incomplete class which will be completed by another class
abstract class Father
{
    abstract void Loan_50k(); //need to add the keyword abstract & the method is incomplete
    void loan_25k(){
        System.out.println("Paid by father");
    }
}

class Son extends Father{
    @Override
    void Loan_50k() {
        System.out.println("Child will pay the pending loan");
    }
}