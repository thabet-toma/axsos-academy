import java.util.ArrayList;
public class OrderKiosk {
ArrayList<Item> menu=new ArrayList<Item>();
ArrayList<Order> orders=new ArrayList<Order> ();
public static int ind=0;
public void addMenuItem(String nm, double pri){
    Item newItem= new Item(nm, pri);
    menu.add(newItem);
    newItem.setIndex(ind);
    ind++;
}
public void displayMenu(){
    for(int i=0;i<menu.size();i++){
        System.out.println(i+" "+menu.get(i).getName()+" - -$"+menu.get(i).getPrice());
    }
}
public void newOrder() {
        
    // Shows the user a message prompt and then sets their input to a variable, name
    System.out.println("Please enter customer name for new order:");
    String name = System.console().readLine();

    // Your code:
    // Create a new order with the given input string
    Order newO=new Order (name);
    orders.add(newO);
    this.displayMenu();


    // Show the user the menu, so they can choose items to add.
    
    // Prompts the user to enter an item number
    System.out.println("Please enter a menu item index or q to quit:");
    String itemNumber = System.console().readLine();
    
    // Write a while loop to collect all user's order items
    while(!itemNumber.equals("q")) {
        for(Item item:menu){
            if(item.getIndex()==Integer.parseInt(itemNumber)){
                newO.addItem(item);
            }


        }
        System.out.println("Please enter a menu item index or q to quit:");
     itemNumber = System.console().readLine();
      
        
        // Get the item object from the menu, and add the item to the order
        // Ask them to enter a new item index or q again, and take their input
    }
    
        newO.display();

    // After you have collected their order, print the order details 
    // as the example below. You may use the order's display method.
    
}

}
