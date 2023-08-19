public class Employee {
    String Name;
    int Id;

    public Employee(String Name, int Id) {
        this.Name = Name;
        this.Id = Id;
    }
    public void Sellphone(Customer c,Smartphone s){
        if(c.cash>=s.price){
            System.out.println("Sold the Smartphone to the Customers: " +c);
        }
        else{
            System.out.println("Not enough money to buy the Smartphone: "+s);
            EMI(s);
        }
    }
    public void EMI (Smartphone s){
        double EMI = Math.ceil((s.price*1.0)/12.0);
        System.out.println("The 12 Months EMI is to buying the Smartphone: "+EMI);
    }
}
