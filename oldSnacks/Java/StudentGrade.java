import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter student number: ");
        int studentNumber = scan.nextInt();

        System.out.println("Enter number of subject: ");
        int subjectNumber = scan.nextInt();


	int scores = studentNumber + subjectNumber;
        int totalScores = studentNumber;
        double averageScores = studentNumber;
        int positions = studentNumber;

        for (int i = 0; i < studentNumber; i++) {
            System.out.println("Enter student");
            int total = 0;
            for (int j = 0; j < subjectNumber; j++) {
                System.out.println(" Enter subject");
                scores = scan.nextInt();
                total += scores;

            totalScores = total;
            averageScores = (double) total / subjectNumber;
        }
	}

	
	System.out.println("\n==========================================================================");
        System.out.printf("%-10s", "STUDENT");

        for (int i = 1; i <= subjectNumber; i++) {
            System.out.printf("%10s", "SUB" + i);
        }

        System.out.printf("%10s %10s %10s%n", "TOT", "AVE", "POS");
        System.out.println("==========================================================================");

        for (int i = 1; i <= studentNumber; i++) {
            System.out.printf("Student %-5d%n", i);
        }
	 System.out.printf("%10d %10.2f %10d%n", totalScores, averageScores, positions);
	
	//System.out.println("Highest scoring student is:" + highestScore);
	//System.out.println("Lowest scoring student is:" + lowestScore);
	System.out.println("Total score is:" + totalScores);
	System.out.println("Average score is:" + averageScores);
	//System.out.println("Number of passes:"+ numberOfPasses);
	//System.out.println("Number of fails:"+ numberFails);




    }
}