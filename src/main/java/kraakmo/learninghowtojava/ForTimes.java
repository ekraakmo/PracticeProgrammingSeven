package kraakmo.learninghowtojava;

import java.util.Scanner;

public class ForTimes {

    public static void main(String[] args) {

        int usernumber;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number...");
        usernumber = userInput.nextInt();

        for (int i = 1; i < 16; i++) {
            System.out.print(usernumber + " * " + i + " = ");
            System.out.println(i * usernumber);
        }
    }
}
