const prompt = require('prompt-sync')();

	const customerName = prompt("What is the customer's name? ");
	
	const cashierName = prompt("Enter cashier's name: ")


	let total = 0; 
	let vat = 0.075;

while (true){
	const userPurchased = prompt("What did the user buy? ");

	const numberOfPieces = prompt("How many pieces: ");

	const unitPrice = prompt("How much per unit?: ");
	
	total = numberOfPieces * unitPrice;

	const customerResponse = prompt("Add more items? (yes/no): ");
            if (customerResponse == "no") {
                break;
	    }
	}	
	
	const amountcolected = prompt("How much did the customer gave you?: ");

	const discountpercentage = prompt("Enter discount percentage (e.g., 10 for 10%): ");
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
	console.log("DATE : 18-AUGUST-24  8:48:11pms");
	console.log("Cashier's name" + cashierName);
	console.log("Customer Name:" + customerName);
	console.log("\n========================================================= ");
	//console.log("%22s%10s%10s%15s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
	console.log("\n--------------------------------------------------------- ");

	console.log("---------------------------------------------------------");
	console.log(`Subtotal: ${total.toFixed(2)} NGN`);
	console.log(`Discount: ${discount.toFixed(2)} NGN`);
	console.log(`VAT (7.5%): ${vat.toFixed(2)} NGN`);
	console.log(`Total Payable:${totalSum.toFixed(2)} NGN`);
	
console.log("=========================================================");
console.log(`Total Amount:${totalAmount.toFixed(2)} NGN`);
console.log(`Amount paid:${totalSum.toFixed(2)} NGN`);
console.log(`Balance:${balanceRecieved.toFixed(2)} NGN`);

console.log("==========================================================");

console.log("THANK YOU FOR YOUR PATRONAGE!");

console.log("===========================================================");