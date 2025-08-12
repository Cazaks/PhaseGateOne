import java.util.Scanner;

public class TaskSix{
public static void main (String [] args){

	Scanner scan = new Scanner(System.in);

	int sum = 0;

	for(int count = 0; count <= 10; count++){
	
	System.out.print("Enter 10 scores: ");
	int scores = scan.nextInt();
	
	if(count % 2 != 0){
	sum = sum + count;
	}
	}

	double average = (double)sum / 10;

	System.out.println("The average is: " + average);
	
}
}