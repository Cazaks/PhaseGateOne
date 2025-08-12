class ATM_MachineAPP:
	def init(name, pin, balance=0):
        


		name = ""
		pin = ""
		balance = 0.0

def create_account(first_name, last_name, new_pin):
    global name, pin, balance
    name = first_name + " " + last_name
    pin = new_pin
    balance = 0.0
    print("Welcome", name, "! Your account was created successfully")

def make_a_deposit(balance, deposit_amount):
    #global balance
    if deposit_amount > 0:
        balance = balance + deposit_amount
        print("The amount deposited is", deposit_amount, "and your balance is", balance)
    else:
        print("You cannot deposit a negative or 0 amount")

def make_withdrwal(withdrawal_amount):
    global balance
    withdrawal_amount = float(withdrawal_amount)
    if withdrawal_amount >= balance:
        print("Insufficient funds. Your balance is", balance)
    elif balance > withdrawal_amount:
        balance = balance - withdrawal_amount
        print("The amount withdrawn is", withdrawal_amount, "and your balance is", balance)
    else:
        print("you cannot withdraw a negative value")

def make_tranfer(transfer_amount):
    global balance
    transfer_amount = float(transfer_amount)
    if transfer_amount >= balance:
        print("Insufficient funds. Your balance is", balance)
    elif transfer_amount > 0 and transfer_amount < balance:
        balance = balance - transfer_amount
        print("The amount transferred is", transfer_amount, "and your balance is", balance)
    else:
        print("you cannot transfer a negative value")

def check_balance():
    global balance
    print("Your bank balance is:", balance)

def change_pin(old_pin, new_pin):
    global pin
    if pin == old_pin:
        pin = new_pin
        print("Pin is changed successfully")
    else:
        print("Incorrect pin")


while True:
    print("\nWelcome to Cazak Global Financial Institude; aka 'money na water' (CGFI)")
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
        pin_input = input("Enter your pin\n")
        create_account(firstname, lastname, pin_input)

    elif userchoice == "2":
        amount = float(input("Enter the amount you want to deposite\n"))
        make_a_deposit(amount)

    elif userchoice == "3":
        withdrawal = input("Enter the amount you want to withdraw\n")
        make_withdrwal(withdrawal)

    elif userchoice == "4":
        transfer = input("Enter the amount you want to transfer\n")
        make_tranfer(transfer)

    elif userchoice == "5":
        check_balance()

    elif userchoice == "6":
        pinchange1 = input("Enter your old pin\n")
        pinchange2 = input("Enter your new pin\n")
        change_pin(pinchange1, pinchange2)

    elif userchoice == "0":
        print("Goodbye! Thanks for using our services.")
        break

    else:
        print("Invalid option, please select a valid option")