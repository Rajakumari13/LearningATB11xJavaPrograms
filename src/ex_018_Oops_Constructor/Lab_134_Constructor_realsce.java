package ex_018_Oops_Constructor;

public class Lab_134_Constructor_realsce {
    public static void main(String[] args) {
        Web_automation w1 = new Web_automation(); //Default constructor created
        w1.make_name="Tata";
        System.out.println("The make name choosen is "+w1.make_name);


    }
}


    class Web_automation {
        String make_name;
//NOTE: default constructor created within class

    Web_automation() {
        System.out.println("Choose your browser");
        System.out.println("Login to portal using the URL: www.quiklyz.com");
        System.out.println("Click on Register CTA button");
        System.out.println("Fill the details and register to subscribe a car");
    }
}