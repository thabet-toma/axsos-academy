public class Item{
    private String name;
    private double price;
    public String getName(){
     return name;   
    }
    public void setName(String nm){
        name=nm;
    }
    public double getPrice(){
     return price;   
    }
    public void setPrice(double pri){
        price=pri;
    }
    public Item(String name,double price){
        this.name=name;
        this.price=price;
    }
}