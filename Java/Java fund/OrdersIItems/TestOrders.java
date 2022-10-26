
    import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        Item item1= new Item("mocha",44);
        Item item2= new Item("latte",20);
        Item item3= new Item("drip coffee",66);
        Item item4= new Item("capuccino",30);
        // item1.name="mocha";
        // item2.name="latte";
        // item3.name= "drip coffee" ;
        // item4.name="capuccino";
        // item1.price=44;
        // item2.price=20;
        // item3.price= 66 ;
        // item4.price=30;


    
        // // Menu items
    
        Order order1=new Order();
    
        Order order2=new Order();
        System.out.println(order1.getName());

        Order order3=new Order( "thabet");
    
        Order order4=new Order( "khaled");
        Order order5=new Order( "raed");
        order1.addItem(item1);
        order1.addItem(item3);
        order2.addItem(item2);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item3);
        order4.addItem(item4);
        order4.addItem(item2);
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order2.setReady(true);
         System.out.println(order2.getStatusMessage());


        
        // order1.name="Cindhur";
        // order2.name="Jimmy";
        // order3.name="Noah";
        // order4.name="Sam";
        

        
    
        // // Application Simulations
        // // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
        // order2.items.add(item1);
        // order2.total+=item1.price;
        // order3.items.add(item4);
        // order3.total+=item4.price;
        // order4.items.add(item2);
        // order4.total+=item2.price;
        // order1.ready=true;
        // for(int i=0;i<3;i++){
        //     order4.items.add(item2);
        //     order4.total+=item2.price;
        // }
        // order2.ready=true;
        
    }
}

