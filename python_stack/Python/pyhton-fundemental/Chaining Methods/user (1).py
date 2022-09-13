class User:		# declare a class and give it name User
    def __init__(self,name,email,amount):
        self.name = name
        self.email = "email"
        self.account=BankAccount(0.5,amount)
    def make_withdrawal(self, amount):
        self.account.withdraw(amount)
        return self
        
    def display_user_balance(self):
        print(self.name)
        self.account.display_account_info()
    def transfer_money(self, other_user, amount):
        other_user.account.balance=other_user.account.balance+amount
        self.account.balance=self.account.balance-amount
        return self
    def make_deposit(self, amount):	
        self.account.deposit(amount)
        return self

        
class BankAccount:
    def __init__(self,int_rate,balance):
        self.int_rate=int_rate
        self.balance=balance
    def deposit(self,amount):
        self.balance+=amount
        return self
    def withdraw(self, amount):
        self.balance-=amount
        return self
    def display_account_info(self):
        print(f"balance:${self.balance}")
    def yield_interest(self):
        self.balance+=self.balance*self.int_rate
        return self
rana=User("rana","rana.com",1000)
dana=User("dana","rana.com",50)
thabet=User("thabet","rana.com",500)
#2
rana.make_deposit(50).make_deposit(50).make_deposit(50).make_withdrawal(50).display_user_balance()

#3
dana.make_deposit(50).make_deposit(50).make_deposit(50).make_withdrawal(50).display_user_balance()

#4
thabet.make_deposit(50).make_withdrawal(50).make_withdrawal(50).make_withdrawal(50).display_user_balance()

dana.transfer_money(thabet,100).display_user_balance()







