import java.util.Scanner;
	
	public class MenstrualCycleDriver{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);

		String name = "";
		System.out.println("Enter your name: ");
		name = scan.next();

		System.out.println("Enter last period start date: ");
		int lastPeriodDate = scan.nextInt();

		System.out.println("Enter current period start date: ");
		int currentPeriodDate = scan.nextInt();
		//int cycleLength = 0;
			
		System.out.println("Enter total days in the month (e.g., 30 or 31): ");
        	int daysOfMonth = scan.nextInt();

			//if (currentPeriodDate < lastPeriodDate) {
			//cycleLength = (dayOfMonth - lastPeriodDate) + currentPeriodDate;
			//System.out.printf("Your monthly cycle length is: %d%n", cycleLength);
       			//} 
			//else {
            		//cycleLength = currentPeriodDate - lastPeriodDate;
			//System.out.printf("Your monthly cycle length is: %d%n", cycleLength);
			//}
	
	System.out.println(MenstrualCycle.cycleLengthDays(currentPeriodDate, lastPeriodDate, daysOfMonth));
	//System.out.println("Hello " Name + " Welcome to MyFlowApp, Here is the summary of your Menstrual cycle:");		
}
}
      