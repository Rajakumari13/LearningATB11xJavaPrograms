package ex_029_Wrapper;

public class Lab_175_Wrapper_with_all_examples {
    public static void main(String[] args) {

        Mobile iphone = new Mobile(1, "Rudra", 150000.58);
        Mobile samsung= new Mobile(2, "Selva", 125000.85);

        System.out.println(iphone.getName());
        System.out.println(iphone.getPrice());
        iphone.setPrice(180000.15);

        iphone.display();
        samsung.display();

        System.out.println(Mobile.sim_card);

        Mobile.SwithonAirplaneMode();
    }
}

class Mobile extends OldPhone{

    private Integer phone;
    private String name;
    private Double price;
    static String sim_card = "airtel";

    //DC
    Mobile(){
        System.out.println("DC");
    }

    //PC
   public Mobile(Integer phone, String name, Double price){
        this.phone=phone;
        this.name=name;
        this.price=price;
    }

    //Normal method
    void display(){
        System.out.println(this.name+" has "+this.phone+" phone with the price of "+this.price);
    }

    //Getter/Setter
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //Static method
    static void SwithonAirplaneMode(){
        System.out.println("Common-Airplance mode on");

    }

    //ex_029_Wrapper in method
    void priceChange(Integer price){
        System.out.println("Change the price to Integer");
    }
    void priceChange(Float price){
        System.out.println("Change the price to float");
    }

    //Override from class
    @Override
    void calling() {
        System.out.println("Dial pad having touch diplay now");
    }
}

class OldPhone implements SIMcard{
    void calling() //Normal method
    {
        System.out.println("Dial pad");
    }
    @Override
    public void entercard() { //override from interface
        System.out.println("Card entered");
    }
}

interface SIMcard{
    void entercard();
}