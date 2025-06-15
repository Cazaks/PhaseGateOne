customer_name = input("What is the customer's name:\n")
	
cashier_name = input("Enter cashier's name:\n")

total = 0; 
vat = 0.075;

while True:
	user_purchased = input("What did the user buy?\n")

	number_of_pieces = int(input("How many pieces:\n"))

	unit_price = float(input("How much per unit?\n"))
	
	total = number_of_pieces * unit_price

	customer_response = input ("Add more items? (yes/no):\n")
	if customer_response == "no": 
		break	
	
amount_colected = float(input("How much did the customer gave you?\n"))

discount_percentage = float(input("Enter discount percentage (7 for 7%):\n"))
discount_percentage = discount_percentage / 100
discount = total * discount_percentage
vat = total * vat
total_sum = total - discount + vat
total_amount = total + vat
balance_recieved = amount_colected - total_amount  

print("SEMICOLON STORES")
print("MAIN BRANCH")
print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
print("TEL: 03293828343")
print("DATE : 18-AUGUST-24  8:48:11pms")
print(f"Cashier's name: {cashier_name}")
print("Customer Name: {customer_name}")
print("\n=========================================================\n")
print(f"{'ITEM':>22}{'QTY':>10}{'PRICE':>10}{'TOTAL(NGN)':>15})")
print("\n---------------------------------------------------------\n")

print("---------------------------------------------------------")
print(f"Subtotal: {total:38.2f} NGN")
print(f"Discount: {discount:37.2f} NGN")
print(f"VAT (7.5%): {vat:36.2f} NGN")
print(f"Total Payable: {total_sum:30.2f} NGN")
	
print("=========================================================")
print(f"Total of amount paid:{total_amount:38.2f} NGN")
print(f"Amount paid: {amount_colected:30.2f} NGN")
print(f"Balance: {balance_recieved:36.2f} NGN")

print("==========================================================")

print("THANK YOU FOR YOUR PATRONAGE!");

print("===========================================================");
