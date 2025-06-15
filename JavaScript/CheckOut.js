const prompt = require('prompt-sync')();

	const customerName = prompt("What is the customer's name: ");
	
	const cashierName = prompt("Enter cashier's name: ")


	let total = 0; 
	let vat = 0.075;

while (true){
	const userPurchased = prompt("What did the user buy?:");

	const numberOfPieces = prompt("How many pieces:");

	const unitPrice = prompt("How much per unit?:");
	
	total = numberOfPieces * UnitPrice;

	const customerResponse = prompt("Add more items? (yes/no): ");
            if (customerResponse== no) {
                break;
	    }
	}	
	
	const amountcolected = input("How much did the customer gave you?:");

	const discountpercentage = input("Enter discount percentage (e.g., 10 for 10%): ");
	discountpercentage = discountpercentage / 100;
        let discount = total * discountpercentage;
       	vat = total * vat;
        let totalSum = total - discount + vat;
	let totalAmount = total + vat;
	let balanceRecieved = amountcolected - totalAmount; 

	
	console.log("SEMICOLON STORES");
	console.log("MAIN BRANCH");
	console.log("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
	console.log("TEL: 03293828343");
	/*System.out.println("DATE : 18-AUGUST-24  8:48:11pms");
	System.out.println("Cashier's name" + cashierName);
	System.out.println("Customer Name:" + customerName);
	System.out.println("\n=========================================================\n");
	System.out.printf("%22s%10s%10s%15s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
	System.out.print("\n---------------------------------------------------------\n");

System.out.println("---------------------------------------------------------");
        System.out.printf("Subtotal: %38.2f NGN%n", total);
        System.out.printf("Discount: %37.2f NGN%n", discount);
        System.out.printf("VAT (7.5%%): %36.2f NGN%n", vat);
        System.out.printf("Total Payable: %30.2f NGN%n", totalSum);
	
System.out.println("=========================================================");
System.out.printf("Bill total: %38.2f NGN%n",totalAnount);
System.out.printf("Amount paid: %30.2f NGN%n", totalSum);
System.out.printf("Balance: %36.2f NGN%n",balanceRecieved);

System.out.println("==========================================================");

System.out.println("THANK YOU FOR YOUR PATRONAGE!");

System.out.println("===========================================================");*/