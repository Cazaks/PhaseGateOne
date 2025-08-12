import java.util.Scanner;

public class ATMMachineAPP {

    static String name = "";
    static String pin = "";
    static double balance = 0.0;

    public static void createAccount(String firstName, String lastName, String newPin) {
        name = firstName + " " + lastName;
        pin = newPin;
        balance = 0.0;
        System.out.println("Welcome " + name + "! Your account was created successfully.");
        System.out.println("Your PIN is: " + pin);
        System.out.println("Your starting balance is: " + balance);
    }

    public static void makeDeposit(double depositAmount) {
        if (depositAmount > 0) {
            balance = balance + depositAmount;
            System.out.println("Amount deposited: " + depositAmount);
            System.out.println("Your balance is now: " + balance);
        } else {
            System.out.println("You cannot deposit a negative or zero amount");
        }
    }

    public static void makeWithdrawal(double withdrawalAmount) {
        if (withdrawalAmount <= 0) {
            System.out.println("You cannot withdraw a negative or zero amount");
        } else if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds. Your balance is " + balance);
        } else {
            balance = balance - withdrawalAmount;
            System.out.println("Amount withdrawn: " + withdrawalAmount);
            System.out.println("Your balance is now: " + balance);
        }
    }

    public static void makeTransfer(double transferAmount) {
        if (transferAmount <= 0) {
            System.out.println("You cannot transfer a negative or zero amount");
        } else if (transferAmount > balance) {
            System.out.println("Insufficient funds. Your balance is " + balance);
        } else {
            balance = balance - transferAmount;
            System.out.println("Amount transferred: " + transferAmount);
            System.out.println("Your balance is now: " + balance);
        }
    }

    public static void checkBalance() {
        System.out.println("Your bank balance is: " + balance);
    }

    public static void changePin(String oldPin, String newPin) {
        if (pin.equals(oldPin)) {
            pin = newPin;
            System.out.println("Pin changed successfully");
        } else {
            System.out.println("Incorrect pin");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Cazak Global Financial Institude; aka 'money na water' (CGFI)");

            System.out.println("We offer the following services");
            System.out.println("1. Create account");
            System.out.println("2. Make a deposit");
            System.out.println("3. Make withdrawal");
            System.out.println("4. Make transfer");
            System.out.println("5. Check bank balance");
            System.out.println("6. Change pin");
            System.out.println("0. To exit");

	System.out.println("<=======================================================>");

            System.out.println("Choose an option: ");
            String userChoice = scan.nextLine();

            switch (userChoice) {
                case "1":
                    System.out.println("Enter your first name: ");
                    String firstname = scan.nextLine();

                    System.out.println("Enter your last name: ");
                    String lastname = scan.nextLine();

                    System.out.println("Enter your pin: ");
                    String newPin = scan.nextLine();

                    createAccount(firstname, lastname, newPin);
	System.out.println("<=======================================================>");
                    break;
	

                case "2":
                    System.out.println("Enter the amount you want to deposit: ");
                    double deposit = scan.nextDouble();
                    makeDeposit(deposit);
	System.out.println("<=======================================================>");
                    break;

                case "3":
                    System.out.println("Enter the amount you want to withdraw: ");
                    double withdrawal = scan.nextDouble();
                    makeWithdrawal(withdrawal);
	System.out.println("<=======================================================>");
                    break;

                case "4":
                    System.out.println("Enter the amount you want to transfer: ");
                    double transfer = scan.nextDouble();
                    makeTransfer(transfer);
	System.out.println("<=======================================================>");
                    break;
	
                case "5":
                    checkBalance();
	System.out.println("<=======================================================>");
                    break;

                case "6":
                    System.out.println("Enter your old pin: ");
                    String oldPin = scan.nextLine();
                    System.out.println("Enter your new pin: ");
                    String changedPin = scan.nextLine();
                    changePin(oldPin, changedPin);
	System.out.println("<=======================================================>");
                    break;
	
                case "0":
                    System.out.println("Goodbye! Thanks for using our services.");
	System.out.println("<=======================================================>");
                    return;

                default:
                    System.out.println("Invalid option, please select a valid option");
            }
        }
    }
}