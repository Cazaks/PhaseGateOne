customer_name = input("What is the customer's name: ")
	
cashier_name = input("Enter cashier's name: ")

total = 0; 
vat = 0.075;

while True:
	user_purchased = input("What did the user buy?:")

	number_of_pieces = int(input("How many pieces:"))

	unit_price = float(input("How much per unit?:"))
	
	total = number_of_pieces * unit_price

	customer_response = input ("Add more items? (yes/no): ")
	if customer_response == "no": 
		break	
	
	amount_colected = ("How much did the customer gave you?: ")

	discount_percentage = input("Enter discount percentage (7 for 7%): ")
	discountpercentage = discount_percentage / 100
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
print("Customer Name: customer_name}")
print("\n=========================================================\n")
print(f"{'ITEM':>22}{'QTY':>10}{'PRICE':>10}{'TOTAL(NGN)':>15})")
print("\n---------------------------------------------------------\n")

print("---------------------------------------------------------")
print(f"Subtotal: {total:38.2f} NGN")
print(f"Discount: {discount:37.2f} NGN")
print(f"VAT (7.5%): {vat:36.2f} NGN")
print(f"Total Payable: {total_sum:30.2f} NGN")
	
print("=========================================================")
printf("Bill total: {total_amount:38.2f} NGN")
print(f"Amount paid: {total_sum:30.2f} NGN")
print(f"Balance: {balance_recieved:36.2f} NGN")

print("==========================================================")

print("THANK YOU FOR YOUR PATRONAGE!");

print("===========================================================");
