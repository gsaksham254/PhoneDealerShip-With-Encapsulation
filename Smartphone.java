public class Smartphone{
    String modelname;
    int price;
    String color;

    public Smartphone(String modelname, int price, String color){
        this.modelname = modelname;
        this.price = price;
        this.color = color;
    }
    @Override
    public String toString(){
        return this.modelname + " " + this.price + " " + this.color;
    }
}