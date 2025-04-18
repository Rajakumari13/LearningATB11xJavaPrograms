package ex_021_Oops_Encapsulation;

public class Lab_151_Bank_ex_encaps {
    public static void main(String[] args) {
    HDFCBank RajiAcc=new HDFCBank("Raji",15000);
    long balance=RajiAcc.getAccount_balance();
    RajiAcc.getName();
    RajiAcc.setName("Rajakumari");
        System.out.println(RajiAcc.getName());
        System.out.println(RajiAcc.getAccount_balance());
    }
}

class HDFCBank{
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

        private String name;
        private long account_balance;

public HDFCBank(String name, long acc_bal)
{
    this.name=name;
    this.account_balance=acc_bal;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(long account_balance) {
        this.account_balance = account_balance;
    }
}
