import java.util.Scanner;
public class MenstrualCycle{


	public static String nameToRegister(String name){
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter your name");
	name = scan.next();
	return name;	
	}
	
	/*public static int cycleLengthDays(int currentPeriodDate, int lastPeriodDate, int daysOfMonth){
		int cycleLength = 0;
		if (currentPeriodDate < lastPeriodDate) {
			cycleLength = (daysOfMonth - lastPeriodDate) + currentPeriodDate;
			
			return cycleLength;

       			} 
		else {
            		cycleLength = currentPeriodDate - lastPeriodDate;
			cycleLength = (daysOfMonth - lastPeriodDate) + currentPeriodDate;
			return cycleLength;
			}

	}

	public static int ovulationDay(int ovucycleLengthDays, int ovulation){
		ovulation = ovucycleLengthDays - 14;
		return ovulation;
	}

	public static int fertileWindow(int fertilWindowperiod, int ovulation){
	fertilWindowperiod = 2 + ovulation + 2;
	return fertilWindowperiod;	
	}
	
	public static int fullLengthFertileWindow(int fertilWindowperiod, int ovulation){
	fertilWindowperiod = 5 + 2 + ovulation + 2;
	return fullLengthFertileWindow;	
	}

	public static int saveDays(int fullLengthFertileWindow, int ovulation){
	fertilWindowperiod = 5 + 2 + ovulation + 2;
	return fertilWindowperiod;	
	}*/

	
}

	 