import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        System.out.println("Hello. Welcome to the Practice ");
        String name = "Sherma'n";
        System.out.printf("%s",name);

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




        CaveMan c1 = new CaveMan();
        CaveMan c2 = new CaveMan("Ogg", 17, 92.4f, new ArrayList<Rock>());


        c1.sayHi();
        c2.sayHi();

        System.out.println("\n============================================\n");


        c1.setName("DeShawn");
        c1.setAge(25);
        c1.setWeight(87.3f);
        c2.setName("Shy");
        c2.setAge(45);
        c2.setWeight(99.8f);


        System.out.println("\n============================================\n");


        c1.sayHi();
        c2.sayHi();


        System.out.println("C1 = " + c1);
        System.out.println("C2 = " + c2);

        Rock r1 = new Rock();
        Rock r2 = new Rock("Red", 88.4f);
        Rock r3 = new Rock("Green", 23.3f);
        Rock r4 = new Rock("Purple", 45.1f);


        ArrayList<Rock> allOftheRocks = new ArrayList<>();


        allOftheRocks.add(r1);
        allOftheRocks.add(r2);
        allOftheRocks.add(r3);
        allOftheRocks.add(r4);

        ArrayList<Rock> someRocks = new ArrayList<>();

        someRocks.add(r1);
        someRocks.add(r3);

        c1.setRockCollection(someRocks);

        c2.setRockCollection(allOftheRocks);

        System.out.println(r1.getClass());
        System.out.println(r2.getClass());
        System.out.println(r3.getClass());
        System.out.println(r4.getColor());


        System.out.println("C1 = " + c1);
        System.out.println("C2 = " + c2);



        for(Rock r: allOftheRocks){
            System.out.println("A rock in the collection is " + r);
        }


        for (int i = 0; i < someRocks.size(); i++) {
            System.out.println("A rock in the somerocks collection is " + someRocks.get(i));
        }
    }

        Random random = new Random();

        int theNumber = random.nextInt(10);
        int yourGuess = 0;
        Scanner scanner = new Scanner(System.in);
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
    }

