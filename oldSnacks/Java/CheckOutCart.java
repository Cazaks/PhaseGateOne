import java.util.Scanner;
	public class CheckOutCart{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.println("What is the customer's name: ");
        String customerName = input.nextLine();
	
	System.out.println("Enter cashier's name: ");
        String cashierName = input.nextLine();


	double total = 0; 
	double vat = 0.075;

while (true){
	System.out.println("What did the user buy?:");
	String userPurchased = input.nextLine();

	System.out.println("How many pieces:");
        int numberOfPieces = input.nextInt();

	System.out.println("How much per unit?:");
	double UnitPrice = input.nextDouble();
	
	total = numberOfPieces * UnitPrice;

	System.out.print("Add more items? (yes/no): ");
        input.nextLine(); 
        String response = input.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
	    }
	}	
	
	System.out.print("How much did the customer gave you?:");
	int amountcolected = input.nextInt();

	System.out.print("Enter discount percentage (e.g., 10 for 10%): ");
        double discountpercentage = input.nextDouble();
	discountpercentage = discountpercentage / 100;
        double discount = total * discountpercentage;
       	vat = total * vat;
        double totalSum = total - discount + vat;
	double totalBill = total + vat;
	double balanceRecieved = amountcolected - totalBill; 

	
System.out.println("SEMICOLON STORES");
	System.out.println("MAIN BRANCH");
	System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
	System.out.println("TEL: 03293828343");
	System.out.println("DATE : 18-AUGUST-24  8:48:11pms");
	System.out.printf("Cashier's name %d", cashierName);
	System.out.printf("Customer Name: %d",  customerName);
	System.out.println("\n=========================================================\n");
	System.out.printf("%22s%10s%10s%15s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
	System.out.print("\n---------------------------------------------------------\n");

System.out.println("---------------------------------------------------------");
        System.out.printf("Subtotal: %38.2f NGN%n", total);
        System.out.printf("Discount: %37.2f NGN%n", discount);
        System.out.printf("VAT (7.5%%): %36.2f NGN%n", vat);
        System.out.printf("Total Payable: %30.2f NGN%n", totalSum);
	
System.out.println("=========================================================");
System.out.printf("Bill total: %38.2f NGN%n",totalBill);
System.out.printf("Amount paid: %30.2f NGN%n", totalSum);
System.out.printf("Balance: %36.2f NGN%n",balanceRecieved);

System.out.println("==========================================================");

System.out.println("THANK YOU FOR YOUR PATRONAGE!");

System.out.println("===========================================================");



	}	

}