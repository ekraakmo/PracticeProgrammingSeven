package kraakmo.learninghowtojava;

import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int fizzBuzzCount = 0;

        System.out.print("How much units fizzing and buzzing fo you need in your life? ");
        int stop = userInput.nextInt();

        System.out.println("0");
        for (int i = 1; i < (stop*6); i++){

            if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.println("fizzbuzz");
                fizzBuzzCount++;
            } else if ((i % 3) == 0) {
                System.out.println("fizz");
                fizzBuzzCount++;
            } else if ((i % 5) == 0) {
                System.out.println("buzz");
                fizzBuzzCount++;
            } else {
                System.out.println(i);
            }
            if (fizzBuzzCount > stop){
                System.out.println("TRADITION!!!!");
                break;
            }
        }
    }
}