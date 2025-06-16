class ATM_MachineAPP:
	def __init__(self, name, pin, balance=0):
		self.balance = balance
		self.pin = pin
		self.name = ""

	def create_account(self, first_name, last_name, pin):
		self.name = first_name + " " + last_name
		self.pin = pin
		print(f"Welcome {self.name}! Your created was successfully")
	
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

	def check_balance(self):
		print(f" Your bank balance is: {slfe.balance}")

	def change_pin(self, old_pin, new_pin, ):
		if self.pin == old_pin:
			self.pin == new_pin
			print("Pin is changed successfully")
		else:
			print("Incorrect pin")

def main():
	account = ATM_MachineAPP("Caleb", 20000, 1443)
	while True:
		print("We offer the following services")
		print("Press;")
		print("1. Create account")
		print("2. Make a deposit")
		print("3. Make withdrwal")
		print("4. Make tranfer")
		print("5. Check bank balance")
		print("6. Change pin")
		print("0. To exit")

		userchoice = input("\nChoice an option: ")
		if userchoice == "1":
			firstname = input("Enter your first name\n")
			lastname = input("Enter your last name\n")
			pin = input("Enter your pin\n")
			account.create_account(firstname, lastname, pin)
			
		elif userchoice == "2":
			amount = float(input("Enter the amount you want to deposite\n "))
			account.make_a_deposit(amount)

		elif userchoice == "3":
			withdrawal = input("Enter the amount you want to withdraw\n ")
			account.make_withdrwal(withdrawal)

		elif userchoice == "4":
			transfer = input("Enter the amount you want to transfer\n ")
			account.make_withdrwal(transfer)

		elif userchoice == "5":
			account.check-balance()

		elif userchoice == "6":
			pinchange1 = input("Enter your old pin")
			pinchange2 = input("Enter your new pin")
			account.change_pin(pinchange1, pinchange2)

		elif userchoice == "0":
			print("Goodbye! Thanks for using our services.")
			break;
		else:
			print("Invalid option, please select a valid option")
main()