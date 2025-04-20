package ex_025_Abstraction_Interface;

public class Lab_160_IQs {
    public static void main(String[] args) {

    }
}
interface I11{} //Valid
interface I12{} //Valid
class A1{} //Valid
class B1{} //Valid
abstract class Pramod{
    abstract void pp(); //Valid
}
class Test1 extends A1{} //Valid
//class Test2 extends A1,B1{} // Multiple Interheirn in class is not allowed
class Test3 implements I11{} //Valid
class Test4 implements I12,I11{} //Valid
class Test5 extends A1 implements I11,I12{} //Valid
//class Test6 implements I11 extends A1{} //Invalid
//interface I3 extends A1{} //Invalid
interface I3{} //Valid