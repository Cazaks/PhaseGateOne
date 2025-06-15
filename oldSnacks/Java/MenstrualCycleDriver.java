import java.util.Scanner;
	
	public class MenstrualCycleDriver{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter your name");
		String name = scan.next();
		System.out.println(MenstrualCycle.nameToRegister(name));
		
		/*System.out.println("Enter last period start date: ");
		int lastPeriodDate = scan.nextInt();

		System.out.println("Enter current period start date: ");
		int currentPeriodDate = scan.nextInt();
		int cycleLength = 0;
			
		System.out.println("Enter total days in the month (e.g., 30 or 31): ");
        	int daysOfMonth = scan.nextInt();

				
	//System.out.println(MenstrualCycle.cycleLengthDays(currentPeriodDate, lastPeriodDate, daysOfMonth));		

		//public static void main(String[] args){
	
		//String name = "";
		//System.out.println("Enter your name: ");
		//name = scan.next();

		System.out.print("Enter cycle length days: ");
		int ovucycleLengthDays = scan.nextInt();
		int ovulation = 0;

	System.out.println(MenstrualCycle.ovulationDay(ovucycleLengthDays, ovulation));*/
		
}

 }     