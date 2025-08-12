import java.util.Scanner;

public class TaskThree{
public static void main (String [] args){

	Scanner scan = new Scanner(System.in);

	int sum = 0;

	for(int count = 0; count <= 10; count++){
	
	System.out.print("Enter 10 scores: ");
	int scores = scan.nextInt();
	sum = sum + count;
	}

	double average = (double)sum /10;

	System.out.println("The sum is: " + sum);
	System.out.println("The everage is: " + average);
}
}