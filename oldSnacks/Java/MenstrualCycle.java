import java.util.Scanner;
public class MenstrualCycle{
	private String name;

   	public MenstrualCycle(String name) {
        this.name = "";
    }

    public void createAccount(String name) {
        this.name = name;
        System.out.println("Welcome ! " + this.name + " Your account was created successfully");
    }

	public void cycleLengthDays(int currentPeriodDate, int lastPeriodDate, int daysOfMonth){
		int cycleLength = 0;
		cycleLength = currentPeriodDate - lastPeriodDate;
			cycleLength = (daysOfMonth - lastPeriodDate) + currentPeriodDate;
		System.out.println("Your cycle length period is " + cycleLength);
	}

	public void ovulationDay(int ovucycleLengthDays, int ovulation){
		ovulation = ovucycleLengthDays - 14;
		System.out.println("Your ovulation day is " + ovulation);
	}

	public void fertileWindow(int fertilWindowperiod, int ovulation){
		fertilWindowperiod = 2 + ovulation + 2;
		System.out.println("Your fertile window period is " + fertileWindowPeriod);
	}
	
	public void fullLengthFertileWindow(int fertilWindowperiod, int ovulation){
		fertilWindowperiod = 5 + 2 + ovulation + 2;
		System.out.println("Your full length fertile window period is " + fullLengthFertileWindow);	
	}

	public void saveDays(int fullLengthFertileWindow, int ovulation){
		saveDays = 5 + 2 + ovulation + 2;
		System.out.println("Your save days are " + saveDays);	
	}

	public static void main(String[] args) {
        Scanner caleb = new Scanner(System.in);
        MenstrualCycle check = new MenstrualCycle("Glory");

	while (true) {
	    //System.out.println("\nWelcome to Medizz Menstrual cycle applicatio. We are glad you choose us");

            System.out.println("\nOur services are as follows");
            System.out.println("Press;");
            System.out.println("1. Create account");
            System.out.println("2. Check cycle length");
            System.out.println("3. Ovolution day");
            System.out.println("4. Check fertile window");
            System.out.println("5. full length og fertile window");
            System.out.println("0. To exit");

            System.out.print("\nChoose an option: ");
            String userChoice = caleb.nextLine();

            switch (userChoice) {
                case "1":
                    System.out.println("Enter name: ");
                    String name = caleb.nextLine();
                    check.createAccount(name);
                    break;

                case "2":
                    System.out.println("Enter your current period date:");
		    int currentPeriod = caleb.nextInt();
		    System.out.println("Enter your last period date:");
                    int lastPeriod = caleb.nextDouble();
                    check.cycleLengthDays(currentPeriodDate, lastPeriodDate);
                    break;

                case "3":
                    System.out.println("Enter your cycle length days:");
                    int ovulation = caleb.nextDouble();
                    check.ovulationDay(ovulation);
                    break;

                case "4":
                    System.out.println("Enter your ovaluation days: ");
                    fertilWnd = caleb.nextDouble();
                    check.fertileWindow(fertilWnd);
                    break;

                case "5":
                    System.out.println("Enter your fertile window period: ");
                    fullFeertilWind = caleb.nextLine();
                    account.fullLengthFertileWindow(fullFeertilWind);
                    break;

		case "5":
                    System.out.println("Enter your full fertile window period: ");
                    safed = caleb.nextLine();
                    account.saveDays(safed);
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


	 