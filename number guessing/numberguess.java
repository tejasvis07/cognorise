import java.util.*;
import java.util.Random;

public class numberguess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numbertoguess = random.nextInt(100) + 1;
        int numberofattempts = 0;
        int maxattempts = 10;
        boolean haswon = false;

        System.out.println("Welcome to the number guessing game");
        System.out.println("i have picked a number from 1 to 100, can you guess it?");
        System.out.println("You have maximum of 10 attempts");

        while (numberofattempts < maxattempts) {
            System.out.println("Guess the number");
            int userguess = sc.nextInt();
            numberofattempts++;

            if (userguess < numbertoguess) {
                System.out.println("Your guess is too low");
            } else if (userguess > numbertoguess) {
                System.out.println("Your guess too high");
            } else {
                haswon = true;
                break;
            }
            System.out.println("You have still " + (maxattempts - numberofattempts) + " number of attempts");
        }
        if (haswon) {
            System.out.println("Congratulation you have guessed the number");
        } else {
            System.out.println("Sorry you attempts are over");
        }
    }
}