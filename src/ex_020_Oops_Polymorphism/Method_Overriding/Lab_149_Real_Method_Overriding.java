package ex_020_Oops_Polymorphism.Method_Overriding;

public class Lab_149_Real_Method_Overriding {
    public static void main(String[] args) {
CommonToAll cta=new CommonToAll();
cta.OpenBrowser();
Chrome ch=new Chrome();
ch.OpenBrowser();
firefox ff=new firefox();
ff.OpenBrowser();

System.out.println(ch.OpenBrowser(10));

//Dynamic Dispatch--> Using Parent ref= child obj
CommonToAll ch1=new firefox();
ch1.OpenBrowser();

CommonToAll ch2=new firefox();
ch2.OpenBrowser();

//firefox f1=new CommonToAll();  --> Not possible-> Child ref parent obj
// firefox f1=new Chrome(); --> No link between these 2 classes
    }
}

class CommonToAll {
    void OpenBrowser() {
        System.out.println("Open the browser");
    }
}
class Chrome extends CommonToAll{
    @Override
    void OpenBrowser() {
        System.out.println("Open the chrome browser");
    }

    int OpenBrowser(int a){
        return 10;
    }
}
class firefox extends CommonToAll{
    @Override
    void OpenBrowser() {
        System.out.println("Open the firefox browser");
    }

}
//Previous class methods are override and used


