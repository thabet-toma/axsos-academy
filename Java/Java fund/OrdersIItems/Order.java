import java.util.ArrayList;;
public class Order {
    private String name; 
    // private double total;
    private boolean ready;
    private ArrayList<Item> items=new ArrayList<Item>();
    public Order(){
        this("Guest");

    }
    public Order(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String nm){
        name=nm;
    }
    public boolean isReady(){
        return ready;
    }
    public void setReady(boolean bol){
       ready =bol;
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public String getStatusMessage(){
        if (ready){
            return "Your order is ready.";
        }
        else{
            return "Thank you for waiting. Your order will be ready soon.";
        }

    }
    public void display(){
        System.out.println(" Customer Name:"+name);
        double total;
        for(Item item:items){
            System.out.println(item.getName()+" :"+item.getPrice()+"$");
           

        }
        System.out.println( getOrderTotal());


       

    }
    public double getOrderTotal(){
        double total=0;
        for(Item item:items){
           
            total+=item.getPrice();

        }
        return total;

    }
    
}
