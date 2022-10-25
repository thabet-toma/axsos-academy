import java.util.ArrayList;
class CafeUtil{
    public int  getStreakGoal(){
       int sum=0;
        for(int i=0;i<11;i++){
        sum+=i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        double sum=0;
        for(double price:prices){
            sum+=price;
        }
return sum;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0;i<menuItems.size();i++){
            System.out.println(i+menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> array){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        array.add(userName);
        System.out.println(" Hello "+userName);
        System.out.println(String.format(" There are %d people in front of you",array.size()-1));
        System.out.println(array);

    }

}