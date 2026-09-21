import java.util.Scanner;

public class JavaQuizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Array of quiz questions
        String[] questions = {
            "What is the main function of a router?",
            "What part of the computer is considered the brain?",
            "What year was Facebook launched?",
            "Who is known as the father of computer?",
            "What was the first programming language?"
        };

        // 2D array holding options for each question
        String[][] options = {
            {"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
            {"1. CPU","2. Hard Drive","3. RAM","4. GPU"},
            {"1. 2000","2. 2004","3. 2006","4. 2008"},
            {"1. Steve Jobs","2. Bill Gates","3. Alan Turing","4. Charles Babbage"},
            {"1. COBOL","2. C","3. Fortran","4. Assembly"}
        };

        // Correct answer index for each question (based on the option number)
        int[] answers = {3, 1, 2, 4, 3};

        int score = 0; // To keep track of correct answers

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        // Loop through all questions
        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            // Print all the options for the current question
            for (String option : options[i]){
                System.out.println(option);
            }

            // Prompt user to enter their guess
            System.out.print("Enter your guess (1-4): ");
            int guess = scanner.nextInt();

            // Check if user's guess matches the correct answer
            if (guess == answers[i]){
                System.out.println("*********");
                System.out.println("CORRECT!");
                System.out.println("*********");
                score++;
            } else {
                System.out.println("*********");
                System.out.println("  WRONG! ");
                System.out.println("*********");
            }
            System.out.println(); // Blank line for better readability
        }

        // Display the final score after all questions are answered
        System.out.println("Your Final Score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
