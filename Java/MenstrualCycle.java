import java.util.Scanner;
	
	public class MenstrualCycle{
	public static void main(String[] args){
	
		//public static int cycleLengthDays(int currentPeriodStart, int lastPeriodStart, dayOfMonth) {
			//int cycleLength = 0;

			//if (currentPeriodStart < lastPeriodStart) {
			//cycleLength = (currentMonthDay - lastPeriodStart) + nextPeriodStart;
       			//} 
			//else {
            		//cycleLength = nextPeriodStart - lastPeriodStart;
       			// }

		Scanner scan = new Scanner(System.in);

		//System.out.println("Enter your cycle length days => between 21 - 35: ");
		//int cycleLengthDays = scan.nextInt();
		//int ovulationDays = cycleLengthDays - 14
		//System.out.println("Enter ovulation days => 14: ");
		//int ovulationDays = scan.nextInt();

		//int fertileWindo

		//public static int subtract(int number1, int number2) {

		//if(number1 < number2){
		//return number2 - number1;
		//} 
		//return number1 - number2; 

		//}


		System.out.println("Enter last period start date: ");
		int lastPeriodDate = scan.nextInt();
		System.out.println("Enter current period start date: ");
		int currentPeriodDate = scan.nextInt();
		int cycleLength = 0;
			
		//System.out.println("Enter current period start month: ");
		//System.out.println("Enter year: ");
		//int currentYear = scan.nextInt();

		System.out.print("Enter total days in the month (e.g., 30 or 31): ");
        	int dayOfMonth = scan.nextInt();

			if (currentPeriodDate < lastPeriodDate) {
			cycleLength = (dayOfMonth - lastPeriodDate) + currentPeriodDate;
       			} 
			else {
            		cycleLength = currentPeriodDate - lastPeriodDate;	
			}

	

        // Calculate cycle length
      
      

}
}
	 