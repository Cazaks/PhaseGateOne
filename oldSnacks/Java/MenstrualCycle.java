import java.util.Scanner;
public class MenstrualCycle{
	private String name;

   	public void menstrualCycleApp(String name) {
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
		System.out.println("Your fertile window period is " + fertilWindowperiod);
	}
	
	public void fullLengthFertileWindow(int fullFertilWindowperiod, int ovulation){
		fullFertilWindowperiod = 5 + 2 + ovulation + 2;
		System.out.println("Your full length fertile window period is " + fullFertilWindowperiod);	
	}

	public void saveDays(int fullLengthFertileWindow, int ovulation){
		int safeDays = 5 + 2 + ovulation + 2;
		System.out.println("Your save days are " + safeDays);	
	}

	public static void main(String[] args) {
        Scanner caleb = new Scanner(System.in);
        //MenstrualCycle status = new MenstrualCycle("Glory");

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
                    createAccount(name);
                    break;

                case "2":
                    System.out.println("Enter your current period date:");
		    int currentPeriod = caleb.nextInt();
		    System.out.println("Enter your last period date:");
                    int lastPeriod = caleb.nextInt();
                    cycleLengthDays(currentPeriod, lastPeriod);
                    break;

                case "3":
                    System.out.println("Enter your cycle length days:");
                    int ovulation = caleb.nextInt();
                    ovulationDay(ovulation);
                    break;

                case "4":
                    System.out.println("Enter your ovaluation days: ");
                    int fertilWnd = caleb.nextInt();
                    fertileWindow(fertilWnd);
                    break;

                case "5":
                    System.out.println("Enter your fertile window period: ");
                   int fullFertilWind = caleb.nextInt();
                    fullLengthFertileWindow(fullFertilWind);
                    break;

		case "6":
                    System.out.println("Enter your full fertile window period: ");
                    int safed = caleb.nextInt();
                    safeDays(safed);
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


	 