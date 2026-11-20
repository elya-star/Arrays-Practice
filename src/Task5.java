import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {

            System.out.print("Enter score " + (i + 1) + ": ");
            int score = input.nextInt();

            while (score < 0 || score > 100) {

                System.out.println("Invalid score! Enter 0-100.");

                System.out.print("Enter score " + (i + 1) + ": ");
                score = input.nextInt();
            }

            scores[i] = score;
        }

        int passed = 0;
        int failed = 0;
        int sum = 0;


        for (int i = 0; i < scores.length; i++) {

            sum = sum + scores[i];

            if (scores[i] >= 60) {
                passed++;
            }
            else {
                failed++;
            }
        }

        double average = (double) sum / scores.length;


        System.out.print("Scores: ");

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        System.out.println();
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + average);

        input.close();
    }
}
