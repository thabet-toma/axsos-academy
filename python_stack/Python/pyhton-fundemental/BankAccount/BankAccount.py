class BankAccount:
    def __init__(self,int_rate,balance):
        self.int_rate=int_rate
        self.balance=balance
    def deposit(self,amount):
        self.balance+=amount
        return self
    def withdraw(self, amount):
        if(amount<=self.balance):
            self.balance-=amount
        else:
            print("Insufficient funds")
        return self
    def display_account_info(self):
        print(f"balance:${self.balance}")
    def yield_interest(self):
        self.balance+=self.balance*self.int_rate
        return self
account1=BankAccount(0.50,1000)
account2=BankAccount(1,1000)
account1.withdraw(2000)
account1.deposit(1000).deposit(1000).deposit(1000).withdraw(1000).yield_interest().display_account_info()
account2.deposit(1000).deposit(1000).withdraw(1000).withdraw(1000).yield_interest().display_account_info()


        

