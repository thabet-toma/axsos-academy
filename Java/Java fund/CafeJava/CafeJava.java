public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee=2.5;
        double latte=2.1;
        double cappuccino=6;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "noah";
        String customer3 = "sam";
        String customer4 = "jimmy";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1);
        if(isReadyOrder1){
            System.out.println(readyMessage+displayTotalMessage+latte);
        }
        else{
            System.out.println(pendingMessage);
        }
        
        System.out.println(generalGreeting + customer2);
        if(isReadyOrder2){
            System.out.println(readyMessage+" "+displayTotalMessage+cappuccino*2);
        }
        else{
            System.out.println(pendingMessage);
        }
        System.out.println(generalGreeting + customer4);
        if(isReadyOrder3){
            System.out.println(readyMessage+" "+displayTotalMessage+(dripCoffee-latte));
        }
        else{
            System.out.println(pendingMessage);
        }
        
    }
}
