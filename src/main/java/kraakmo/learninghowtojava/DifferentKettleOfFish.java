package kraakmo.learninghowtojava;

public class DifferentKettleOfFish {

    public static void main(String[] args) {

        int fish;
//        while (fish < 10) {
//            if (fish == 3) {
//                System.out.println("RED fish!");
//            }else if (fish == 4) {
//                System.out.println("BLUE fish!");
//            } else {
//                System.out.println(fish + " fish!");
//            }
//            fish++;
//        }
        for (fish = 1; fish < 11; fish++) {
            if (fish == 3){
                System.out.println("RED fish!");
            } else if (fish == 4){
                System.out.println("RED fish!");
            } else {
                System.out.println(fish + " fish!");
            }
        }
    }
}
