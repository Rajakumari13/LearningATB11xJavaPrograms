package ex_026_IIB;

import java.awt.event.HierarchyEvent;

public class Lab_162_IIB_ex1 {
    public static void main(String[] args) {
        //IIB_ Instance Initialization Block
        //Will be executed when the object is created (Not DC)
        A a=new A();

    }
}

class A{
    A(){
        System.out.println("Default Constructor");
    }
    {
        System.out.println("IIB will be executed");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file
    }
    {
        System.out.println("IIB2 will be executed");
    }
}

// HierarchyEvent
//IIB & If you want to...
//IIB2
//Default constructor
//Use: