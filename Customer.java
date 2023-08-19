public class Customer {
    String Name;
    int cash;

    public Customer(String Name, int cash){
        this.Name = Name;
        this.cash = cash;
    }
    public void buy(Smartphone s1){
        System.out.println("Buying the Smartphone: " + s1);
    }
    @Override
    public String toString(){
        return this.Name;
    }

}
