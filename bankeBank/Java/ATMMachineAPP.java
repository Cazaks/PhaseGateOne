import java.util.Scanner;

public class ATMMachineAPP {
    private String name;
    private String pin;
    private double balance;

    public ATMMachineAPP(String name, double balance, String pin) {
        this.name = "";
        this.balance = balance;
        this.pin = pin;
    }

    public void createAccount(String firstName, String lastName, String pin) {
        this.name = firstName + " " + lastName;
        this.pin = pin;
        System.out.println("Welcome " + this.name + "! Your account was created successfully");
    }

    public void makeDeposit(double depositAmount) {
        if (depositAmount > 0) {
            this.balance = this.balance + depositAmount;
            System.out.println("The amount deposited is " + depositAmount + " and your balance is " + this.balance);
        } 
	else {
            System.out.println("You cannot deposit a negative or 0 amount");
        }
    }

    public void makeWithdrawal(double withdrawalAmount) {
        if (withdrawalAmount <= 0) {
            System.out.println("You cannot withdraw a negative value");
        } else if (withdrawalAmount > this.balance) {
            System.out.println("Insufficient funds. Your balance is " + this.balance);
        } 
	else {
            this.balance = this.balance - withdrawalAmount;
            System.out.println("The amount withdrawn is " + withdrawalAmount + " and your balance is " + this.balance);
        }
    }

    public void makeTransfer(double transferAmount) {
        if (transferAmount <= 0) {
            System.out.println("You cannot transfer a negative value");
        } else if (transferAmount > this.balance) {
            System.out.println("Insufficient funds. Your balance is " + this.balance);
        } 
	else {
            this.balance = this.balance - transferAmount;
            System.out.println("The amount transferred is " + transferAmount + " and your balance is " + this.balance);
        }
    }

    public void checkBalance() {
        System.out.println("Your bank balance is: " + this.balance);
    }

    public void changePin(String oldPin, String newPin) {
        if (this.pin.equals(oldPin)) {
            this.pin = newPin;
            System.out.println("Pin changed successfully");
        } 
	else {
            System.out.println("Incorrect pin");
        }
    }

    public static void main(String[] args) {
        Scanner caleb = new Scanner(System.in);
        ATMMachineAPP account = new ATMMachineAPP("Caleb", 20000, "1443");

        while (true) {
	    System.out.println("\nWelcome to Cazak Global Financial Institude; aka 'money na water' (CGFI)");

            System.out.println("\nWe offer the following services");
            System.out.println("Press;");
            System.out.println("1. Create account");
            System.out.println("2. Make a deposit");
            System.out.println("3. Make withdrawal");
            System.out.println("4. Make transfer");
            System.out.println("5. Check bank balance");
            System.out.println("6. Change pin");
	    System.out.println("7. Closs account");
            System.out.println("0. To exit");

            System.out.print("\nChoose an option: ");
            String userChoice = caleb.nextLine();

            switch (userChoice) {
                case "1":
                    System.out.println("Enter your first name: ");
                    String firstname = caleb.nextLine();
                    System.out.println("Enter your last name: ");
                    String lastname = caleb.nextLine();
                    System.out.println("Enter your pin: ");
                    String pin = caleb.nextLine();
                    account.createAccount(firstname, lastname, pin);
                    break;

                case "2":
                    System.out.println("Enter the amount you want to deposit: ");
                    double deposit = caleb.nextDouble();
                    account.makeDeposit(deposit);
                    break;
                case "3":

                    System.out.println("Enter the amount you want to withdraw: ");
                    double withdrawal = caleb.nextDouble();
                    account.makeWithdrawal(withdrawal);
                    break;
                case "4":

                    System.out.println("Enter the amount you want to transfer: ");
                    double transfer = caleb.nextDouble();
                    account.makeTransfer(transfer);
                    break;

                case "5":
                    account.checkBalance();
                    break;

                case "6":
                    System.out.println("Enter your old pin: ");
                    String oldPin = caleb.nextLine();
                    System.out.print("Enter your new pin: ");
                    String newPin = caleb.nextLine();
                    account.changePin(oldPin, newPin);
                    break;

                case "0":
                    System.out.println("Goodbye! Thanks for using our services.");
                    caleb.close();
                    return;

                default:
                    System.out.println("Invalid option, please select a valid option");
            }
        }
    }
}