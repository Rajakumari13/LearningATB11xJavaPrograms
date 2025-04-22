package ex_031_Generics;

public class Lab_199_GenericClass {
    public static void main(String[] args) {
        GenericClass <Integer> intObjRef=new GenericClass(5);
        GenericClass <String> stringObjRef=new GenericClass("Raji");
        GenericClass <Float> floatObjRef=new GenericClass(5.45);
        // T -> it is placeholder only -> it can be any data type.
        System.out.println(intObjRef.getData());
        System.out.println(stringObjRef.getData());
        System.out.println(floatObjRef.getData());

    }
}
class GenericClass <T>{
    private T data;

    //PC
    public GenericClass (T data)
    {
this.data=data;
    }

    public T getData() {
        return data;
    }
}