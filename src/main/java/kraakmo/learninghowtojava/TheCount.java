package kraakmo.learninghowtojava;

import java.util.Scanner;

public class TheCount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int increment = 1;
        int counter = 0;

        System.out.print("Start at : ");
        start = input.nextInt();
        counter = start;

        System.out.print(" Stop at : ");
        end = input.nextInt();

        System.out.print("Count by : ");
        increment = input.nextInt();

        for (int i = start; i < end; i += increment) {
            System.out.print(i + " ");
            if (i == counter + (increment * 2)){
                System.out.println("- Ah ah ah!");
                counter += (increment * 3);
            }
        }
    }
}
