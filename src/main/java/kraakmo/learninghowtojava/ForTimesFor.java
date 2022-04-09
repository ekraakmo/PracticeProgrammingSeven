package kraakmo.learninghowtojava;

import java.util.Scanner;

public class ForTimesFor {

    public static void main(String[] args) {

        int score = 0;
        int usernumber;
        Scanner userInput = new Scanner(System.in);

        System.out.print("What times table are you trying to learn? ");
        usernumber = userInput.nextInt();

        for (int i = 1; i < 16; i++) {
            int answer = i * usernumber;
            System.out.print(usernumber + " * " + i + " is: ");
            int userAns = userInput.nextInt();

            if (userAns == answer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry no, the correct answer is: " + answer);
            }
        }
        if (score < 8){
            System.out.println("You got " + score + " out of 15 correct.");
            System.out.println("You got less than 50% correct. You need to study more!");
        } else if (score > 13) {
            System.out.println("You got " + score + " out of 15 correct.");
            System.out.println("Congratulations! You scored an A!");
        } else {
            System.out.println("You got " + score + " out of 15 correct.");
        }
    }
}
