public class Test {
    public static void main(String[] args){
        BankAccount acount1= new BankAccount(555,200);
        BankAccount acount3= new BankAccount(200.3,400.3);
        BankAccount acount2= new BankAccount(700.2,500.2);
        BankAccount acount4= new BankAccount(800.6,1000);
        System.out.println(BankAccount.numberOfAcounts);

        System.out.println("You added :"+acount1.getsavingBalance()+"to your acount");
    //     System.out.println("You Add :"+acount1.addeposit("balance",124.5)+" to your acount");
    //     System.out.println("You Add :"+acount1.addeposit("savingsBalance",78.5)+" to your acount");
    //     System.out.println("You Add :"+acount1.addeposit("savingsBalance",102.5)+" to your acount");
    //     System.out.println("You take :"+acount1.withdraw("balance",234.5));
    //     System.out.println("your amount of many"+acount1.totalAmount());
     }
}
