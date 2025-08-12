import java.util.Scanner;

public class TaskOne{
public static void main (String [] args){

	Scanner scan = new Scanner(System.in);

	int sum = 0;

	for(int count = 0; count <= 10; count++){
	
	System.out.print("Enter 10 scores");
	int scores = scan.nextInt();
	sum = sum + count;
	}

	System.out.println(sum);
}
}