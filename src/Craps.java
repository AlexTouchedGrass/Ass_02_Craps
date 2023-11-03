import java.util.Scanner;
import java.lang.Math;

public class Craps {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int roll1 = 0;
        int roll2 = 0;
        int total = 0;
        String again = "Y";
        String userInput = "";

        boolean valid = false;
        boolean valid2 = false;

        System.out.println("Welcome to Craps Simulator.");
         while (!valid){
             System.out.println("Dice one rolls.");
             roll1 = (int) (Math.random()*6)+1;
             System.out.println(roll1);
             System.out.println("Dice two rolls.");
             roll2 = (int) (Math.random()*6)+1;
             System.out.println(roll2);
             total = roll1+roll2;
             if (total == 7 || total == 11){
                 System.out.println("You win by natural! Would you like to play again? Y/N");
                 userInput = scan.nextLine();
                 if (userInput.equalsIgnoreCase(again)) {
                 } else {
                     System.out.println("Thanks for playing!");
                     valid = true;
                 }
             } else if (total == 2 || total == 3 || total == 12) {
                 System.out.println("You crapped out. . . Buddy.");
                 System.out.println("Would you like to play again? Y/N");
                 userInput = scan.nextLine();
                 if (userInput.equalsIgnoreCase(again)) {
                 } else {
                     System.out.println("Thanks for playing!");
                     valid = true;
                 }
             } else {
                 while(!valid2){
                 System.out.println("You are rolling for the point sum, which is " + total);
                 roll1 = (int) (Math.random()*6)+1;
                 System.out.println("Dice one rolls.");
                 System.out.println(roll1);
                 roll2 = (int) (Math.random()*6)+1;
                 System.out.println("Dice two rolls.");
                 System.out.println(roll2);
                     if (roll1 + roll2 == total) {
                         System.out.println("You win, would you like to play again? Y/N");
                         userInput = scan.nextLine();
                         if (userInput.equalsIgnoreCase(again)) {
                         } else {
                             System.out.println("Thanks for playing!");
                             valid2 = true;
                         }
                     }
                 }
             }
         }
    }
}