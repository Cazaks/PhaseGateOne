public class MenstrualCycle{
	
	public static int cycleLengthDays(int currentPeriodDate, int lastPeriodDate, int daysOfMonth){
			
		int cycleLength = 0;
		if (currentPeriodDate < lastPeriodDate) {
			cycleLength = (daysOfMonth - lastPeriodDate) + currentPeriodDate;
			//System.out.println("Your monthly cycle length is: " + cycleLength);
			return cycleLength;

       			} 
		else {
            		cycleLength = currentPeriodDate - lastPeriodDate;
			//ycleLength = (daysOfMonth - lastPeriodDate) + currentPeriodDate;
			//System.out.println("Your monthly cycle length is: " + cycleLength);
			return cycleLength;
			}

      

}
}
	 