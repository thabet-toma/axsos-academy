public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    public static double numberOfAcounts = 0;
    public static double  amountOfMoney = 0;
    public BankAccount(double check,double save){
        checkingBalance=check;
        savingsBalance=save;
        numberOfAcounts++;
        amountOfMoney+=save+check;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getsavingBalance(){
        return savingsBalance;
    }
    public void deposit(String type,double ammount){
        if(type=="save"){
            savingsBalance+=ammount;
        }
        else{
            checkingBalance+=ammount ;
        }
        amountOfMoney+=ammount;
    }
    public void withdraw(String type,double ammount){
        if(type=="save" && ammount< savingsBalance){
            savingsBalance-=ammount;
        }
        else if(type=="cheack" && ammount< checkingBalance){
            checkingBalance-=ammount ;
        }
        amountOfMoney-=ammount;
    }
    public double total(){
        return checkingBalance+savingsBalance;
    }
}