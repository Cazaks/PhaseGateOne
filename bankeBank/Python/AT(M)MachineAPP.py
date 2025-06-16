class ATM_MachineAPP:
	def __init__(self, name, balance=0):
		#self.phone_number = phone_number
		#self.account_holder = account_holder
		self.balance = balance
		self.name = ""

	def create_account(self, name):
		self.name = name
		print(f"Welcome {self.name}! Your created successfully")
	
	def make_a_deposit(self, deposit_amount):
		if deposit_amount > 0:
			self.balance = self.balance + deposit_amount
			print(f'The aount deposited is {deposit_amount} and your balance is {self.balance}')
		else:
			print("You cannot deposit a negative or 0 amount")
			
	def make_withdrwal(self, withdrawal_amount):
		withdrawal_amount = float(withdrawal_amount) 
		if withdrawal_amount >= self.balance:
			print(f"Insufficient funds. Your balance is {self.balance}")
		elif self.balance > withdrawal_amount:
			self.balance = self.balance - withdrawal_amount
			print(f"The amount withdrawn is {withdrawal_amount} and your balance is {self.balance}")
		else:
			print("you cannot withdraw a negative value")

	def make_tranfer(self, transfer_amount):
		tranfer_amount = float(transfer_amount) 
		if transfer_amount >= self.balance:
			print(f"Insufficient funds. Your balance is {self.balance}")
		elif transfer_amount > 0 and transfer_amount < self.balance:
			self.balance = self.balance - transfer_amount
			print(f"The amount transfered is {transfer_amount} and your balance is {self.balance}")
		else:
			print("you cannot transfer a negative value")

def main():
	account = ATM_MachineAPP("Caleb", 20000)
	while True:
		print("We offer the following services")
		print("Press;")
		print("1. Create account")
		print("2. Make a deposit")
		print("3. Make withdrwal")
		print("4. Make tranfer")
		print("0. To exit")

		userchoice = input("\nChoice an option: ")
		if userchoice == "1":
			name = input("Enter your fir and last name\n")
			account.create_account(name)
		
		elif userchoice == "2":
			amount = float(input("Enter the amount you want to deposite\n "))
			account.make_a_deposit(amount)

		elif userchoice == "3":
			withdrawal = input("Enter the amount you want to withdraw\n ")
			account.make_withdrwal(withdrawal)

		elif userchoice == "4":
			transfer = input("Enter the amount you want to transfer\n ")
			account.make_withdrwal(transfer)

		elif userchoice == "0":
			print("Goodbye! Thanks for using our services.")
			break;
		else:
			print("Invalid option, please select a valid option")
main()