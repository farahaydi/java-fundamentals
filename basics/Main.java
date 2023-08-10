

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//         Invoking Pluralize
        System.out.println(Pluralize("Dog", 1));
        System.out.println(Pluralize("Cat", 2));
        System.out.println(Pluralize("turtle", 0));

//         Invoking flipNHeads
        flipNHeads(1);

//         Invoking clock
        clock();


    }

    public static String Pluralize(String word, int number) {
        if (number == 1) {
            return word;
        } else {
            return word + 's';
        }
    }

    /////////////////////////////////////////////////////////////////////////

    public static void flipNHeads(int number) {
        int numOfFlip = 0;
        int headInRow = 0;
        Random random = new Random();
        double randomNumber;
        while (headInRow < number) {
            randomNumber = random.nextDouble();
            numOfFlip++;

            if (randomNumber >= 0.5) {
                System.out.println("heads");
                headInRow++;

            } else {
                System.out.println("tails");

                headInRow = 0;
            }
        }
        System.out.println("It took" + numOfFlip + " " + "FLIPS flips to flip" + " " + number + " " + "heads in a row");
    }

    ///////////////////////////////////////////////////////////////////////////

    public static void clock()
    {
        int previousSecond = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int second = now.getSecond();

            if (second != previousSecond) {
                System.out.println(formatter.format(now));
                previousSecond = second;
            }
        }
    }

    //////




}


