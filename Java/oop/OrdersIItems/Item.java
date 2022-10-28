public class Item{
    private String name;
    private double price;
    private int index;
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
    public double getIndex(){
        return index;   
       }
       public void setIndex(int ind){
           index=ind;
       }
}