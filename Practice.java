public class Practice {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Samsung", 25000, "Black");
        Smartphone s2 = new Smartphone("Apple", 30000, "White");
        Smartphone s3 = new Smartphone("OnePlus", 35000, "Blue");
        Smartphone s4 = new Smartphone("Samsung", 25000, "Black");

        Customer c1 = new Customer("John", 10000);
        Customer c2 = new Customer("Jane", 20000);
        Customer c3 = new Customer("Jack", 30000);
        Customer c4 = new Customer("Jill", 40000);

        Employee e1 = new Employee("Mridul", 1);
        Employee e2 = new Employee("Kanika", 2);
        Employee e3 = new Employee("Raghav", 3);
        Employee e4 = new Employee("Saksham", 4);

        c1.buy(s1);
        e1.Sellphone(c1,s1);
    }
}
