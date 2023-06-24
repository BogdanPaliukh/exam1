import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalQuestions = 5;
        int score = 0;

        System.out.println("Welcome to the MyTest");
        System.out.println("Answer the following questions by entering the corresponding letter (a, b, c, d).");
        System.out.println("Enter 'q' at any time to quit the quiz.\n");

        String[] questions = {
                "What is the result of 1 + 1?",
                "What is the result of 1 * 1?",
                "What is the result of 1 - 1?",
                "What is the result of 3 / 1 ?",
                "What is the result of 15 / 5 ?"
        };
        String[] options = {
                "a) 2\nb) 3\nс) 4\nd) 1",
                "a) 2\nb) 1\nc) 3\nd) 4",
                "a) 1\nb) 0\nc) 3\nd) -1",
                "a) 1\nb) 3\nc) 6\nd) 4",
                "a) 3\nb) 5\nc) 15\nd) 75"
        };
        String[] correctAnswers = {"a", "b", "b", "b", "a"};

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[i]);
            System.out.println(options[i]);

            String userAnswer = scanner.nextLine().toLowerCase();

            if (userAnswer.equals("q")) {
                System.out.println("Quiz ended. Goodbye!");
                return;
            }

            while (!userAnswer.matches("[abcd]")) {
                System.out.println("Invalid option. Please enter a valid answer (a, b, c, d) or 'q' to quit:");
                userAnswer = scanner.nextLine().toLowerCase();
            }

            if (userAnswer.equals(correctAnswers[i])) {
                score++;
            }

            System.out.println();
        }

        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of " + totalQuestions);
        double percentage = (double) score / totalQuestions * 100;
        System.out.println("Percentage: " + percentage + "%");

    }
}
