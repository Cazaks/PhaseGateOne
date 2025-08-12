const prompt = require('prompt-sync')();

class AtmMachineAPP {
  constructor(name, balance, pin) {
    this.name = "";
    this.balance = balance;
    this.pin = pin;
  }

  create_account(firstName, lastName, pin) {
    this.name = `${firstName} ${lastName}`;
    this.pin = pin;
    console.log(`Welcome ${this.name}! Your account was created successfully`);
  }

  make_a_deposit(deposit_amount) {
    if (deposit_amount > 0) {
      this.balance += deposit_amount;
      console.log(`The amount deposited is ${deposit_amount} and your balance is ${this.balance}`);
    } else {
      console.log("You cannot deposit a negative or 0 amount");
    }
  }

  make_withdrawal(withdrawal_amount) {
    if (withdrawal_amount <= 0) {
      console.log("You cannot withdraw a negative value");
    } else if (withdrawal_amount > this.balance) {
      console.log(`Insufficient funds. Your balance is ${this.balance}`);
    } else {
      this.balance -= withdrawal_amount;
      console.log(`The amount withdrawn is ${withdrawal_amount} and your balance is ${this.balance}`);
    }
  }

  make_transfer(transfer_amount) {
    if (transfer_amount <= 0) {
      console.log("You cannot transfer a negative value");
    } else if (transfer_amount > this.balance) {
      console.log(`Insufficient funds. Your balance is ${this.balance}`);
    } else {
      this.balance -= transfer_amount;
      console.log(`The amount transferred is ${transfer_amount} and your balance is ${this.balance}`);
    }
  }

  check_balance() {
    console.log(`Your bank balance is: ${this.balance}`);
  }

  change_pin(old_pin, new_pin) {
    if (this.pin === old_pin) {
      this.pin = new_pin;
      console.log("Pin changed successfully");
    } else {
      console.log("Incorrect pin");
    }
  }
}

function main() {
  const account = new AtmMachineAPP("Caleb", 20000, "1443");

  while (true) {
    console.log("\nWelcome to Cazak Global Financial Institude; aka 'money na water' (CGFI)");
    console.log("\nWe offer the following services");
    console.log("Press;");
    console.log("1. Create account");
    console.log("2. Make a deposit");
    console.log("3. Make withdrawal");
    console.log("4. Make transfer");
    console.log("5. Check bank balance");
    console.log("6. Change pin");
    console.log("0. To exit");

    let userChoice = prompt("Choose an option: ");

    if (userChoice === "1") {
      let firstName = prompt("Enter your first name: ");
      let lastName = prompt("Enter your last name: ");
      let pin = prompt("Enter your pin: ");
      account.create_account(firstName, lastName, pin);

    } else if (userChoice === "2") {
      let amount = prompt("Enter the amount you want to deposit: ");
      account.make_a_deposit(amount);

    } else if (userChoice === "3") {
      let withdrawal = prompt("Enter the amount you want to withdraw: ");
      account.make_withdrawal(withdrawal);

    } else if (userChoice === "4") {
      let transfer = prompt("Enter the amount you want to transfer: ");
      account.make_transfer(transfer);

    } else if (userChoice === "5") {
      account.check_balance();

    } else if (userChoice === "6") {
      let oldPin = prompt("Enter your old pin: ");
      let newPin = prompt("Enter your new pin: ");
      account.change_pin(oldPin, newPin);

    } else if (userChoice === "0") {
      console.log("Goodbye! Thanks for using our services.");
      break;

    } else {
      console.log("Invalid option, please select a valid option");
    }
  }
}

main();