import java.util.Scanner;

public class AverageValidScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int validCount = 0;

        System.out.println("Enter 10 valid scores between 1 and 100:");

        for (int i = 1; validCount < 10; i++) {
            System.out.print("Enter score " + i + ": ");
            int score = scanner.nextInt();

            if (score >= 1 && score <= 100) {
                sum += score;
                validCount++;
            } else {
                System.out.println("Invalid score! Please enter a number between 1 and 100.");
            }
        }

        double average = (double) sum / validCount;
        System.out.println("Sum of valid scores: " + sum);
        System.out.println("Average of valid scores: " + average);

       
    }
}