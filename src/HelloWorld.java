import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello. Welcome to the Practice ");
//        String name = "Sherma'n";
//        System.out.printf("%s",name);

        for (int i = 0; i < 10; i++) {
            System.out.print("The number is " + i +  ", ");
        }

        System.out.println("\n============================================\n");

        for (int i = 0; i < 29; i+= 3) {
            System.out.print("The number is " + i +  ", ");
        }

        System.out.println("\n============================================\n");

        int [] luckyNumbers = {13,14,15,16,65,73,93,29};
        System.out.println("The first item in the array is " + luckyNumbers[0]);


        System.out.println("\n============================================\n");

        for (int i = 0; i < luckyNumbers.length; i++) {
            System.out.println("The number at position " + i +  " is " + luckyNumbers[i]);
        }


        System.out.println("\n============================================\n");

        for (int number: luckyNumbers) {
            System.out.println("Lucky number is " + number);
        }

        ArrayList<Integer> unluckyNumbers = new ArrayList<>();


        unluckyNumbers.add(7);
        unluckyNumbers.add(77);
        unluckyNumbers.add(76);
        unluckyNumbers.add(47);
        unluckyNumbers.add(27);


        System.out.println("\n============================================\n");

        for (int i = 0; i < unluckyNumbers.size(); i+= 3) {
            System.out.println("The unlucky number at position " + i +  " is " + unluckyNumbers.get(i));
        }


        System.out.println("\n============================================\n");


        for (int number: unluckyNumbers) {
            System.out.println("The Unlucky number is " + number);
        }








    }

//        Random random = new Random();
//
//        int theNumber = random.nextInt(10);
//        int yourGuess = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Guess a number between 1 - 10:");
//        while(theNumber != yourGuess) {
//            yourGuess = scanner.nextInt();
//            if(yourGuess < theNumber) {
//                System.out.println("Your guess is too low");
//            }else if(yourGuess > theNumber){
//                System.out.println("Your guess is too high");
//            }else{
//                System.out.println("You did it!");
//            }
//        }
//    }
}
