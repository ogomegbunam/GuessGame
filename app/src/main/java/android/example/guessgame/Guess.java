package android.example.guessgame;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May i have your name?");
        String name = scanner.next();
        while (name=="") {
            // We do not have the user's name
            System.out.println("May i have your name?");
            name = scanner.next();
        }
        System.out.println("Welcome"+ name +".Good afternoon");
        System.out.println("Shall we begin?");
        String shouldStart=scanner.next();
          // Until the answer is not yes we won't continue
        while (!shouldStart.equals("yes")) {
            System.out.println("Shall we begin?");
            shouldStart=scanner.next();
        }
        int x =new Random().nextInt(20)+1;
        boolean win= false;
        int timesTried=0;
        boolean shouldQuit= false;
        while (!shouldQuit){
            if (timesTried>=5){
                shouldQuit=true;
            }else {
                timesTried++;
                System.out.println("Please Guess a number");
                int userInput= scanner.nextInt();
                if (userInput==x){
                    shouldQuit=true;
                    win=true;
                }else  if (userInput>x){
                    System.out.println("Guess Lower");
                }else {
                    System.out.println("Guess Higher");
                }
            }
        }
        if (win){
            System.out.println("congrats, you have won in your"+timesTried+"try");
        }else {
            System.out.println("Game Over!");
        }
        System.out.println("x was:"+ x);
    }
}
