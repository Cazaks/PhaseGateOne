import java.util.Arrays;
import java.util.Scanner;
public class FireDrilThree {
    public static int[] taskOne() {
        Scanner scan = new Scanner(System.in);

        int[] scores = new int[10];

        for (int count = 0; count < scores.length; count++) {
            System.out.print("Enter 10 score " );
            scores[count] = scan.nextInt();
        }

        return scores;
    }

    public static void main(String[] args) {
        int[] result = taskOne();
        System.out.println("Scores entered: " + Arrays.toString(result));
    }

	public static int[] taskTwo() {
        Scanner scan = new Scanner(System.in);

        int[] scores = new int[10];

        for (int count = 0; count < scores.length; count++) {
            System.out.print("Enter 10 score " );
            scores[count] = scan.nextInt();
        }

        return scores;
    }

	public static void main(String[] args) {
        int[] result = taskTwo();
        System.out.println("Scores entered: " + Arrays.toString(result));
    }

	public static int[] taskThree() {
        Scanner scan = new Scanner(System.in);

        int[] scores = new int[10];

        for (int count = 0; count < scores.length; count++) {
            System.out.print("Enter 10 score " );
            scores[count] = scan.nextInt();
        }

        return scores;
    }
	public static void main(String[] args) {
        int[] result = taskThree();
        System.out.println("Scores entered: " + Arrays.toString(result));
    }



}



