package ex_017_Oops_Class;

public class Lab_134_Class_creation {
    public static void main(String[] args) {
        System.out.println("Class creation");
    }

    class p1 {

    }

    class $564A {

    }

    class _abc {

    }

    //class _{} -> Identifier/class name shouldn't have  _
    //class 123{}-> Identifier/class name shouldn't starts with integer
   // class p2,p3{} -> Multiple class names cannot used in same class
    //class within a class-Possible p4,p5
    class p4{
        class p5{}
    }
    //class within class is possible
    class p6{

    }

    class p7
    {
        public static void main(String[] args) {
            System.out.println("p6");
        }
    }
}

