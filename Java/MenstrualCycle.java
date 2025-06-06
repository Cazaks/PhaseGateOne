import java.util.Scanner;
	
	public class MenstrualCycle{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		/*System.out.println("Enter your cycle length days => between 21 - 35: ");
		int cycleLengthDays = scan.nextInt();
		int ovulationDays = cycleLengthDays - 14
		//System.out.println("Enter ovulation days => 14: ");
		//int ovulationDays = scan.nextInt();

		int fertileWindo*/

		System.out.println("Enter last period start date: ");
		int lastPeriodDtae = scan.nextInt();
		//System.out.println("Enter last period start month: ");
		//int lastMonth = scan.nextInt();

		//System.out.println("Enter year ");
		//int lastYear = scan.nextInt();

		System.out.println("Enter current period state date: ");
		int currentPeriodDtae = scan.nextInt();
		System.out.println("Enter current period start month: ");
		int currentMonth = scan.nextInt();
		currentMonth = 31;

		//System.out.println("Enter year: ");
		//int currentYear = scan.nextInt();
		
		int cycleLengthDays = currentPeriodDtae - lastPeriodDtae;

		System.out.printf("Your cycle length before your next period is: %d%n", cycleLengthDays);

}
}
	 